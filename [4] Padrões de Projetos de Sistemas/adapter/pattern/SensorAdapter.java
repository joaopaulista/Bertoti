package adapter.pattern;

public class SensorAdapter implements TemperatureSensor {
    private LegacyFahrenheitSensor legacySensor;

    public SensorAdapter(LegacyFahrenheitSensor legacySensor) {
        this.legacySensor = legacySensor;
    }

    @Override
    public double getTemperatureCelsius() {
        double tempF = legacySensor.getTemperatureFahrenheit();

        double tempC = (tempF - 32) / 1.8;

        System.out.println("LOG ADAPTER: Convertendo " + tempF + "F para " + tempC + "C");

        return tempC;
    }
}