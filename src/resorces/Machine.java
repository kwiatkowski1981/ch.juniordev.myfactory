package resorces;


import java.util.Objects;

public class Machine {

    boolean inOperation;  //in Betrieb
    String producer; // Hersteller
    double machineNumber; // Maschinen Nummer
    int speed; //aktuelle Hubzahl / schnell / langsam
    int maxPressingForce; // maximale Presskraft
    int tableLength; // Tischlaenge
    Peripherals peripheralsType; // Karrussell neu/alt, Revolver, Roettler, niO Weiche, Spuren

    public Machine(boolean inOperation, String producer, double machineNumber, int speed, int maxPressingForce, int tableLength, Peripherals peripheralsType) {
        this.inOperation = inOperation;
        this.producer = producer;
        this.machineNumber = machineNumber;
        this.speed = speed;
        this.maxPressingForce = maxPressingForce;
        this.tableLength = tableLength;
        this.peripheralsType = peripheralsType;
    }

    public boolean isInOperation() {
        return inOperation;
    }

    public void setInOperation(boolean inOperation) {
        this.inOperation = inOperation;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(double machineNumber) {
        this.machineNumber = machineNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPressingForce() {
        return maxPressingForce;
    }

    public void setMaxPressingForce(int maxPressingForce) {
        this.maxPressingForce = maxPressingForce;
    }

    public int getTableLength() {
        return tableLength;
    }

    public void setTableLength(int tableLength) {
        this.tableLength = tableLength;
    }

    public Peripherals getPeripheralsType() {
        return peripheralsType;
    }

    public void setPeripheralsType(Peripherals peripheralsType) {
        this.peripheralsType = peripheralsType;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "inOperation=" + inOperation +
                ", producer='" + producer + '\'' +
                ", machineNumber=" + machineNumber +
                ", speed=" + speed +
                ", maxPressingForce=" + maxPressingForce +
                ", tableLength=" + tableLength +
                ", peripheralsType=" + peripheralsType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return inOperation == machine.inOperation &&
                Double.compare(machine.machineNumber, machineNumber) == 0 &&
                speed == machine.speed &&
                maxPressingForce == machine.maxPressingForce &&
                tableLength == machine.tableLength &&
                Objects.equals(producer, machine.producer) &&
                Objects.equals(peripheralsType, machine.peripheralsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inOperation, producer, machineNumber, speed, maxPressingForce, tableLength, peripheralsType);
    }
}
