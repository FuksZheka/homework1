
public class RnaTranscription {
    String transcribe(String dnaStrand) {

        String resulString="";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            char charN = dnaStrand.charAt(i);
            switch (charN) {
                case 'G' -> stringBuilder.append("C");
                case 'C' ->stringBuilder.append("G");
                case 'T' ->stringBuilder.append("A");
                case 'A' ->stringBuilder.append("U");    
            }
        }
        return stringBuilder.toString();
    }
}
