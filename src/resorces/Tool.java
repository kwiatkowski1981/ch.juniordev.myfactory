package resorces;


import java.util.Objects;

public class Tool {

  private  String toolType; // WzgTyp Kompakt, Modular,
  private   String  product; // Produkt SZ, VG, TG, HTG
  private   String toolNumber; // WZG Nummer (F40615-01)
  private   int numberOfModules; //anzahl der Module (1-5)
  private   int numberoftools;  //anzahl der WZG (1-5)
  private   String productNumber;  // Produktnummer  3636 662 5000A
  private   int speed; //  Geschwidigkeit in Hub (200-700)
  private   int tracks;  // Spuren 2,4,6,8
  private   double rawMaterial; // Rohstoff dimensionnen
  private   double feed;  // Vorschub in MM
  private   int releaseTime;  // Luftzeitpunkt in Grad
  private   int criticalPressingForce;  // kritische Presskraft
  private   int maxPressingForce;  // maximale Presskraft
  private   int strokeLength;  // Hublaenge in MM
  private   double pistonPressure;  // Kolbendruck in Bar
  private   String storagePlace;  // Lagerplatz
  private   boolean toolMonitoring;  // WZGüberwachung  ein aus
  private   String mostCommonFaults; // haufigsten Storungen
    // Karrussell Daten
    // po wbudowaniu do maszyny reset hubzahl?


    public Tool(String toolType, String product, String toolNumber, int numberOfModules, int numberoftools,
                String productNumber, int speed, int tracks, double rawMaterial, double feed, int releaseTime,
                int criticalPressingForce, int maxPressingForce, int strokeLength, double pistonPressure,
                String storagePlace, boolean toolMonitoring, String mostCommonFaults) {
        this.toolType = toolType;
        this.product = product;
        this.toolNumber = toolNumber;
        this.numberOfModules = numberOfModules;
        this.numberoftools = numberoftools;
        this.productNumber = productNumber;
        this.speed = speed;
        this.tracks = tracks;
        this.rawMaterial = rawMaterial;
        this.feed = feed;
        this.releaseTime = releaseTime;
        this.criticalPressingForce = criticalPressingForce;
        this.maxPressingForce = maxPressingForce;
        this.strokeLength = strokeLength;
        this.pistonPressure = pistonPressure;
        this.storagePlace = storagePlace;
        this.toolMonitoring = toolMonitoring;
        this.mostCommonFaults = mostCommonFaults;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getToolNumber() {
        return toolNumber;
    }

    public void setToolNumber(String toolNumber) {
        this.toolNumber = toolNumber;
    }

    public int getNumberOfModules() {
        return numberOfModules;
    }

    public void setNumberOfModules(int numberOfModules) {
        this.numberOfModules = numberOfModules;
    }

    public int getNumberoftools() {
        return numberoftools;
    }

    public void setNumberoftools(int numberoftools) {
        this.numberoftools = numberoftools;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public double getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(double rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public double getFeed() {
        return feed;
    }

    public void setFeed(double feed) {
        this.feed = feed;
    }

    public int getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(int releaseTime) {
        this.releaseTime = releaseTime;
    }

    public int getCriticalPressingForce() {
        return criticalPressingForce;
    }

    public void setCriticalPressingForce(int criticalPressingForce) {
        this.criticalPressingForce = criticalPressingForce;
    }

    public int getMaxPressingForce() {
        return maxPressingForce;
    }

    public void setMaxPressingForce(int maxPressingForce) {
        this.maxPressingForce = maxPressingForce;
    }

    public int getStrokeLength() {
        return strokeLength;
    }

    public void setStrokeLength(int strokeLength) {
        this.strokeLength = strokeLength;
    }

    public double getPistonPressure() {
        return pistonPressure;
    }

    public void setPistonPressure(double pistonPressure) {
        this.pistonPressure = pistonPressure;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public boolean isToolMonitoring() {
        return toolMonitoring;
    }

    public void setToolMonitoring(boolean toolMonitoring) {
        this.toolMonitoring = toolMonitoring;
    }

    public String getMostCommonFaults() {
        return mostCommonFaults;
    }

    public void setMostCommonFaults(String mostCommonFaults) {
        this.mostCommonFaults = mostCommonFaults;
    }


    @Override
    public String toString() {
        return "Tool{" +
                "toolType='" + toolType + '\'' +
                ", product='" + product + '\'' +
                ", toolNumber='" + toolNumber + '\'' +
                ", numberOfModules=" + numberOfModules +
                ", numberoftools=" + numberoftools +
                ", productNumber='" + productNumber + '\'' +
                ", speed=" + speed +
                ", tracks=" + tracks +
                ", rawMaterial=" + rawMaterial +
                ", feed=" + feed +
                ", releaseTime=" + releaseTime +
                ", criticalPressingForce=" + criticalPressingForce +
                ", maxPressingForce=" + maxPressingForce +
                ", strokeLength=" + strokeLength +
                ", pistonPressure=" + pistonPressure +
                ", storagePlace='" + storagePlace + '\'' +
                ", toolMonitoring=" + toolMonitoring +
                ", mostCommonFaults='" + mostCommonFaults + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tool tool = (Tool) o;
        return numberOfModules == tool.numberOfModules &&
                numberoftools == tool.numberoftools &&
                speed == tool.speed &&
                tracks == tool.tracks &&
                Double.compare(tool.rawMaterial, rawMaterial) == 0 &&
                Double.compare(tool.feed, feed) == 0 &&
                releaseTime == tool.releaseTime &&
                criticalPressingForce == tool.criticalPressingForce &&
                maxPressingForce == tool.maxPressingForce &&
                strokeLength == tool.strokeLength &&
                Double.compare(tool.pistonPressure, pistonPressure) == 0 &&
                toolMonitoring == tool.toolMonitoring &&
                Objects.equals(toolType, tool.toolType) &&
                Objects.equals(product, tool.product) &&
                Objects.equals(toolNumber, tool.toolNumber) &&
                Objects.equals(productNumber, tool.productNumber) &&
                Objects.equals(storagePlace, tool.storagePlace) &&
                Objects.equals(mostCommonFaults, tool.mostCommonFaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolType, product, toolNumber, numberOfModules, numberoftools, productNumber, speed,
                tracks, rawMaterial, feed, releaseTime, criticalPressingForce, maxPressingForce, strokeLength,
                pistonPressure, storagePlace, toolMonitoring, mostCommonFaults);
    }
}
