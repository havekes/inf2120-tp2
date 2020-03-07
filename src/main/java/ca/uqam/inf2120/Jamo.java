package ca.uqam.inf2120;

/**
 * Jamo
 */
public class Jamo {

    private int value;

    Jamo(int value) {
        this.value = value;
    }

    public String getIPA() {
        switch (this.value) {
            case 1:
                return "\\u006B";
            default: 
                return "\\uFFFD";
        }
    }

    public String toString() {
        return String.format("%d", value);
    }
}
