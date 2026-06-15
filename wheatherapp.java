class WeatherApp {
    // Celsius to Fahrenheit
    public double convertTemperature(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    public double convertTemperature(int fahrenheit) {
        return (fahrenheit - 32) * 5/9.0;
    }

    // Celsius to Kelvin
    public double convertTemperature(double celsius, boolean toKelvin) {
        if (toKelvin) return celsius + 273.15;
        return convertTemperature(celsius);
    }

    public static void main(String[] args) {
        WeatherApp w = new WeatherApp();
        System.out.println("C to F: " + w.convertTemperature(25.0));
        System.out.println("F to C: " + w.convertTemperature(77));
        System.out.println("C to K: " + w.convertTemperature(25.0, true));
    }
}
