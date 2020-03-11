package ca.uqam.inf2120;

/**
 * JamoVowel
 */
public class JamoVowel extends Jamo {

  JamoVowel(int value) {
    this.value = value;
  }

  public String getIPA() {
    switch (this.value) {
      default:
        return "\\uFFFD";
    }
  }
}
