class LengthConverter {
    fun kmToMiles(km: Double): Double {
        return km * 0.621371
    }

    fun milesToKm(miles: Double): Double {
        return miles * 1.60934
    }
}

class WeightConverter {
    fun kgToPounds(kg: Double): Double {
        return kg * 2.20462
    }

    fun poundsToKg(pounds: Double): Double {
        return pounds * 0.453592
    }
}
class TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return (celsius * 9/5) + 32
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5/9
    }
}
