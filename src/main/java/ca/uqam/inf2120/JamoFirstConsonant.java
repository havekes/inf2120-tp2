package ca.uqam.inf2120;

/**
 * JamoFirstConsonant
 */
public class JamoFirstConsonant extends Jamo {

  public JamoFirstConsonant(int value) {
    this.value = value;
  }

  @Override
  public String getIPA() {
    switch (this.value) {
      case 1:
        return "\\u006B";
      default:
        return "\\uFFFD";
    }
  }
}
