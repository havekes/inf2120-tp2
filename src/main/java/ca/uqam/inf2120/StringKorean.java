package ca.uqam.inf2120;

import java.util.Iterator;

/**
 * StringKorean
 */
public class StringKorean implements Iterable<Hangul> {

    private String input;
    private Hangul[] hanguls;

    StringKorean(String input) {
        this.input = input.trim();
        parseInputToHanguls();
    }

    private void parseInputToHanguls() {
        hanguls = new Hangul[input.length()];
        for (int i = 0; i < input.length(); i++) {
            hanguls[i] = new Hangul(input.charAt(i));
        }
    }

    public void correction() {
        var it = this.iterator();
        var tempHangul = it.next();
        while (it.hasNext()) {
            var hangul1 = tempHangul;
            var hangul2 = it.next();
            hangul2.correctFirstConsonant(hangul1);
            tempHangul = hangul2;
        }
    }

    @Override
    public Iterator<Hangul> iterator() {
        return new IteratorStringKorean(this);
    }

    public class IteratorStringKorean implements Iterator<Hangul> {
        private int index;
        private StringKorean str;

        IteratorStringKorean(StringKorean str) {
            this.str = str;
        }

        @Override
        public boolean hasNext() {
            return index < str.input.length();
        }

        @Override
        public Hangul next() {
            var hangul = new Hangul(this.str.input.charAt(index));
            index++;
            return hangul;
        }
    }
}
