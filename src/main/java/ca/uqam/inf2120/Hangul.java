package ca.uqam.inf2120;

/**
 * Hangul
 */
public class Hangul {

    private Character codePoint;

    Hangul(Character codePoint) {
        this.codePoint = codePoint;
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

    public Jamo firstConsonant() {
        return new Jamo(c());
    }

    public Jamo vowel() {
        return new Jamo(v());
    }

    // might not always have last consonant
    public Jamo lastConsonant() {
        return new Jamo(d());
    }

    public String toString() {
        return String.format("( %s, %s, %s )", firstConsonant(), vowel(), lastConsonant());
    }
}
