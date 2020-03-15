package ca.uqam.inf2120;

/**
 * Represente un hangul avec ses jamos
 */
public class Hangul {

    private final Character codePoint;

    private final JamoFirstConsonant firstConsonant;
    private final JamoVowel vowel;
    private final JamoLastConsonant lastConsonant;

    /**
     * Creer un nouveau hangul a partir d'un character d'une chaine
     * @param codePoint
     */
    Hangul(Character codePoint) {
        this.codePoint = codePoint;
        firstConsonant = new JamoFirstConsonant(c());
        vowel = new JamoVowel(v());
        lastConsonant = new JamoLastConsonant(d());
    }

    /**
     * Calculer l'offset des characteres
     */
    private int uPrime() {
        return codePoint - 44032;
    }

    /**
     * Calculer la valeur du la consonne finale
     * @return
     */
    private int d() {
        return uPrime() % 28;
    }

    /**
     * Calculer la valeur de la voyelle
     * @return
     */
    private int v() {
        return 1 + ((uPrime() - d()) % 588) / 28;
    }

    /**
     * Calculer la valeur de la premiere consonne
     * @return
     */
    private int c() {
        return 1 + uPrime() / 588;
    }

    /**
     * Obtenir le jamo de la premier consonne
     * @return
     */
    public Jamo getFirstConsonant() {
        return firstConsonant;
    }

    /**
     * Obtenir le jamo de la voyelle
     * @return
     */
    public Jamo getVowel() {
        return vowel;
    }

    /**
     * Obtenir le jamo de la derniere consonne
     * @return
     */
    public Jamo getLastConsonant() {
        return lastConsonant;
    }

    /**
     * Corriger la derniere consonne en fonction du hangul suivant
     * @param nextHangul
     */
    public void correctLastConsonant(Hangul nextHangul) {
        if (lastConsonant.getValue() != 0) {
            lastConsonant.correctFromNext(nextHangul.firstConsonant);
        }
    }

    /**
     * Corriger la premiere consonne en fonctione du hangul precedent
     * @param previousHangul
     */
    public void correctFirstConsonant(Hangul previousHangul) {
        if (previousHangul.lastConsonant.getValue() != 0) {
            firstConsonant.correctFromPrevious(previousHangul.lastConsonant);
        }
    }

    /**
     * Obtenir la traduction phonetique du hangul
     * @return
     */
    public String getIPA() {
        return String.format("%s%s%s", firstConsonant.getIPA(), vowel.getIPA(), lastConsonant.getIPA());
    }

    public String toString() {
        return String.format("( %s, %s, %s )", firstConsonant, vowel, lastConsonant);
    }
}
