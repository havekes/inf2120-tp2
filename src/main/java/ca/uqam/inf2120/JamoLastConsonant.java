package ca.uqam.inf2120;

/**
 * JamoLastConsonant
 */
public class JamoLastConsonant extends Jamo {

  JamoLastConsonant(int value) {
    // Might have 0 value;
    this.value = value;
  }

  public void correctFromNext(Jamo nextJamo) {
  }

  public String getIPA() {
    switch (this.value) {
      default:
        return "\\uFFFD";
    }
  }
}
