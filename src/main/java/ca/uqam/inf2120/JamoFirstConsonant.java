package ca.uqam.inf2120;

/**
 * JamoFirstConsonant
 */
public class JamoFirstConsonant extends Jamo {

  private String correctedIPA;

  public JamoFirstConsonant(int value) {
    this.value = value;
  }

  public void correctFromPrevious(Jamo previousJamo) {
    final String replacement = JamoReplacements.REPLACEMENTS[previousJamo.value - 1][value - 1].first;

    if (replacement != null) {
      correctedIPA = replacement;
    }
  }

  @Override
  public String getIPA() {
    if (correctedIPA != null) {
      return correctedIPA;
    }

    switch (this.value) {
      case 1:
        return "\u006B";
      case 2:
        return "\u006B\u0324";
      case 3:
        return "\u006E";
      case 4:
        return "\u0074";
      case 5:
        return "\u0074\u0324";
      case 6:
        return "\u027E";
      case 7:
        return "\u006D";
      case 8:
        return "\u0070";
      case 9:
        return "\u0070\u0324";
      case 10:
        return "\u0073";
      case 11:
        return "\u0073\u0324";
      case 12:
        return "";
      case 13:
        return "\u0074\u0255";
      case 14:
        return "\u0074\u0324\u0255";
      case 15:
        return "\u0074\u0255\u02B0";
      case 16:
        return "\u006B\u02B0";
      case 17:
        return "\u0074\u02B0";
      case 18:
        return "\u0070\u02B0";
      case 19:
        return "\u0068";
      default:
        return "\uFFFD";
    }
  }
}
