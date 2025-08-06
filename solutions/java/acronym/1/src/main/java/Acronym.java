import java.util.Arrays;

public class Acronym {
    private final String phrase;
    
    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        
        // Replace hyphens with spaces and remove other punctuation
        String cleaned = phrase.replace('-', ' ')
                              .replaceAll("[^a-zA-Z\\s]", "");
        
        // Split into words, handling multiple spaces
        String[] words = cleaned.split("\\s+");
        
        StringBuilder acronym = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }
        
        return acronym.toString().toUpperCase();
    }
}