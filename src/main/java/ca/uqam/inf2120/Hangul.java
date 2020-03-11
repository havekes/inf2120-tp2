package ca.uqam.inf2120;

/**
 * Hangul
 */
public class Hangul {

    private Character codePoint;

    private JamoFirstConsonant firstConsonant;
    private JamoVowel vowel;
    private JamoLastConsonant lastConsonant;

    Hangul(Character codePoint) {
        this.codePoint = codePoint;
        firstConsonant = new JamoFirstConsonant(c());
        vowel = new JamoVowel(v());
        lastConsonant = new JamoLastConsonant(d()); 
    }

    private int uPrime() {
        return codePoint - 44032;
    }

    private int d() {
        return uPrime() % 28;
    }

    private int v() {
        return 1 + ((uPrime() - d()) % 588) / 28;
    }

    private int c() {
        return 1 + uPrime() / 588;
    }

    public Jamo getFirstConsonant() {
        return firstConsonant;
    }

    public void correctFirstConsonant(Hangul previousHangul) {
        if (previousHangul.lastConsonant != null) {
            previousHangul.lastConsonant.correctFromNext(this.firstConsonant);
        }
    }

    public Jamo getVowel() {
        return vowel;
    }

    public Jamo getLastConsonant() {
        return lastConsonant;
    }

    public String toString() {
        return String.format("( %s, %s, %s )", firstConsonant, vowel, lastConsonant);
    }
}
