package ca.uqam.inf2120;

public class TexteCoreen {

    public TexteCoreen(String text) {
        StringKorean stringKorean = new StringKorean(text);
        for (final var hangul : stringKorean) {
            System.out.println(hangul);
        }
    }

    public int noConsonneInitiale(int position) {
        return 0;
    }

    public int noVoyelle(int position) {
        return 0;
    }

    public int noConsonneFinale(int position) {
        return 0;
    }

    public String traduire() {
        return "";
    }
}
