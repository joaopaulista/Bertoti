package adapter.pattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyFahrenheitSensor oldSensor = new LegacyFahrenheitSensor();

        TemperatureSensor sensor = new SensorAdapter(oldSensor);

        System.out.println("Temperatura lida: " + sensor.getTemperatureCelsius() + " graus Celsius");
    }
}