package ca.uqam.inf2120;

import java.util.ArrayList;
import java.util.List;

/**
 * Stocke unr chaine chaine en coreen (chaine de hanguls)
 */
public class StringKorean {

    private final List<Hangul> hanguls;

    /**
     * Crrer une nouvelle chaine koreenne a partir d'un String
     * @param input
     */
    StringKorean(String input) {
        hanguls = parseStringToHanguls(input.trim());
    }

    /**
     * Creer une liste de hanguls a partir d'un entree
     * @param input entree de l'utilisateur
     * @return List de hangusl
     */
    private static List<Hangul> parseStringToHanguls(String input) {
        var hanguls = new ArrayList<Hangul>();

        for (int i = 0; i < input.length(); i++) {
            hanguls.add(new Hangul(input.charAt(i)));
        }

        return hanguls;
    }

    /**
     * Renvoyer le hangul a la position donnee
     * @param position
     * @return
     */
    public Hangul getHangul(int position) {
        return hanguls.get(position);
    }

    /**
     * Effectuer les corrections phonetiques sur le jamos de fin et de debut des hanguls
     */
    public void corrections() {
        var it = hanguls.iterator();
        var tempHangul = it.next();
        
        while (it.hasNext()) {
            var hangul1 = tempHangul;
            var hangul2 = it.next();
            hangul1.correctLastConsonant(hangul2);
            hangul2.correctFirstConsonant(hangul1);
            tempHangul = hangul2;
        }
    }

    /**
     * Calculer la traduction phonetique de la chaine
     * @return
     */
    public String getIPA() {
        var sb = new StringBuilder();

        for (Hangul hangul: hanguls) {
            sb.append(hangul.getIPA());
        }

        return sb.toString();
    }
}
