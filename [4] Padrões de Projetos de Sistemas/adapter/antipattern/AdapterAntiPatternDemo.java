package adapter.antipattern;

public class AdapterAntiPatternDemo {
    public static void main(String[] args) {
        LegacySensorCoupled oldSensor = new LegacySensorCoupled();

        double tempF = oldSensor.getTemperatureFahrenheit();

        double tempC = (tempF - 32) / 1.8;

        System.out.println("(Sem Adapter) Temperatura lida: " + tempC + " graus Celsius");
    }
}