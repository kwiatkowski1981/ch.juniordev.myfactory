package resorces;


public class Tool {

    String toolType; // WzgTyp Kompakt, Modular,
    String  product; // Produkt SZ, VG, TG, HTG
    String toolNumber; // WZG Nummer (F40615-01)
    int numberOfModules; //anzahl der Module (1-5)
    int numberoftools;  //anzahl der WZG (1-5)
    String productNumber;  // Produktnummer  3636 662 5000A
    int speed; //  Geschwidigkeit in Hub (200-700)
    int tracks;  // Spuren 2,4,6,8
    double rawMaterial; // Rohstoff dimensionnen
    double feed;  // Vorschub in MM
    int releaseTime;  // Luftzeitpunkt in Grad
    int criticalPressingForce;  // kritische Presskraft
    int maxPressingForce;  // maximale Presskraft
    int strokeLength;  // Hublaenge in MM
    double pistonPressure;  // Kolbendruck in Bar
    String storagePlace;  // Lagerplatz
    boolean toolMonitoring;  // WZGüberwachung  ein aus
    String mostCommonFaults; // haufigsten Storungen
    // Karrussell Daten
    // po wbudowaniu do maszyny reset hubzahl?


}
