package ca.uqam.inf2120;

/**
 * JamoLastConsonant
 */
public class JamoLastConsonant extends Jamo {

  private String correctedIPA;

  JamoLastConsonant(int value) {
    this.value = value;
  }

  public void correctFromNext(Jamo nextJamo) {
    final String replacement = JamoReplacements.REPLACEMENTS[value - 1][nextJamo.value - 1].last;

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
      case 0:
        return "";
      case 1:
        return "\u006B\u031A";
      case 2:
        return "\u006B\u031A";
      case 3:
        return "\u006B";
      case 4:
        return "\u006E";
      case 5:
        return "\u006E\u0074\u0255";
      case 6:
        return "\u006E\u0068";
      case 7:
        return "\u0074\u031A";
      case 8:
        return "\u006C";
      case 9:
        return "\u006B";
      case 10:
        return "\u006D";
      case 11:
        return "\u0070";
      case 12:
        return "\u0073";
      case 13:
        return "\u0074\u02B0";
      case 14:
        return "\u0070\u02B0";
      case 15:
        return "\u0068";
      case 16:
        return "\u006D";
      case 17:
        return "\u0070\u031A";
      case 18:
        return "\u0070\u031A";
      case 19:
        return "\u0074\u031A";
      case 20:
        return "\u0074\u031A";
      case 21:
        return "\u014B";
      case 22:
        return "\u0074\u031A";
      case 23:
        return "\u0074\u031A";
      case 24:
        return "\u006B\u031A";
      case 25:
        return "\u0074\u031A";
      case 26:
        return "\u0070\u031A";
      case 27:
        return "\u0074\u031A";
      default:
        return "\uFFFD";
    }
  }
}
