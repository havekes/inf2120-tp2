package ca.uqam.inf2120;

/**
 * JamoVowel
 */
public class JamoVowel extends Jamo {

  JamoVowel(int value) {
    this.value = value;
  }

  @Override
  public String getIPA() {
    switch (this.value) {
      case 1:
        return "\u0061";
      case 2:
        return "\u025B";
      case 3:
        return "\u006A\u0061";
      case 4:
        return "\u006A\u025B";
      case 5:
        return "\u028C";
      case 6:
        return "\u0065";
      case 7:
        return "\u006A\u028C";
      case 8:
        return "\u006A\u0065";
      case 9:
        return "\u006F";
      case 10:
        return "\u0077\u0061";
      case 11:
        return "\u0077\u025B";
      case 12:
        return "\u00F8";
      case 13:
        return "\u006A\u006F";
      case 14:
        return "\u0075";
      case 15:
        return "\u0077\u028C";
      case 16:
        return "\u0077\u0065";
      case 17:
        return "\u0079";
      case 18:
        return "\u006A\u0075";
      case 19:
        return "\u026F";
      case 20:
        return "\u0270\u0069";
      case 21:
        return "\u0069";
      default:
        return "\uFFFD";
    }
  }
}
