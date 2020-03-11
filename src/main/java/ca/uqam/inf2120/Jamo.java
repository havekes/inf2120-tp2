package ca.uqam.inf2120;

/**
 * Jamo
 */
public abstract class Jamo {

    protected int value;

    abstract public String getIPA();

    public String toString() {
        return String.format("%d", value);
    }
}
