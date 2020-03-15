package ca.uqam.inf2120;

/**
 * Definition commune aux jamos
 */
public abstract class Jamo {

    protected int value;

    abstract public String getIPA();

    /**
     * Obenit la valeur numerique originale du jamo
     */
    public int getValue() {
        return value;
    }

    public boolean equals(Jamo otherJamo) {
        return value == otherJamo.value;
    }

    public String toString() {
        return String.format("%d", value);
    }
}
