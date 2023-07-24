class Temperature
{
    double fahrenheit, celsius;
    void fahrenheit(double f)
    {
        fahrenheit = f;
    }
    void celsius(double c)
    {
        celsius = c;
    }
    void fahrenheitToCelsius()
    {
        celsius = (fahrenheit-32) * 5/9;
        System.out.println("Celsius : " + celsius);
    }
    void celsiusToFahrenheit()
    {
        fahrenheit = 9*celsius/5 + 32;
        System.out.println("Fahrenheit : " + fahrenheit);
    }
}