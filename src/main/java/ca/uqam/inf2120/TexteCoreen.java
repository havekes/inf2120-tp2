package ca.uqam.inf2120;

public class TexteCoreen {

    private final StringKorean stringKorean;

    public TexteCoreen(String input) {
        stringKorean = new StringKorean(input);
    }

    public int noConsonneInitiale(int position) {
        return stringKorean.getHangul(position).getFirstConsonant().getValue();
    }

    public int noVoyelle(int position) {
        return stringKorean.getHangul(position).getVowel().getValue();
    }

    public int noConsonneFinale(int position) {
        return stringKorean.getHangul(position).getLastConsonant().getValue();
    }

    public String traduire() {
        return stringKorean.getIPA();
    }
}
