fun main() {
    val length = LengthConverter()
    val weight = WeightConverter()
    val temperature = TemperatureConverter()

    println("Welcome to unit converter!")
    println("Choose a category below :")

    val category = listOf("1.Length", "2.weight", "3.Temperature", "4.Exit")

    for (i in category)
        println(i)

    println("Enter the value :")
    val input = readln()
    val isInt = input.toIntOrNull()

    if (isInt != null) {
        val toDo = when (isInt) {
            1 -> {
                println("\n choose a conversion ")
                println("1.km to miles")
                println("2.miles to km")

                val conversion = readln().toIntOrNull()
                if (conversion == 1 || conversion == 2) {
                    println("enter the conversion value:")
                    val value = readln().toIntOrNull()
                    if (value != null) {
                        if (conversion == 1) {
                            println("$value Km = ${length.kmToMiles(value.toDouble())} miles")
                        } else {
                            println("$value miles = ${length.milesToKm(value.toDouble())} km")
                        }
                    } else {
                        println("enter valid conversion")
                    }
                } else {
                    println("enter val valid conversion")
                }
            }


            2 -> {
                println("\n choose a conversion ")
                println("1.kg to pounds")
                println("2.pounds to kg")

                val conversion = readln().toIntOrNull()
                if (conversion == 1 || conversion == 2) {
                    println("enter the conversion value:")
                    val value = readln().toIntOrNull()
                    if (value != null) {
                        if (conversion == 1) {
                            println("$value Kg = ${weight.kgToPounds(value.toDouble())} pounds")
                        } else {
                            println("$value pounds = ${weight.poundsToKg(value.toDouble())} kg")
                        }
                    } else {
                        println("enter valid conversion")
                    }
                } else {
                    println("enter a valid conversion")
                }

            }


            3 -> {
                println("\n choose a conversion ")
                println("1.cel to fah")
                println("2.fah to cel")

                val conversion = readln().toIntOrNull()
                if (conversion == 1 || conversion == 2) {
                    println("enter the conversion value:")
                    val value = readln().toIntOrNull()
                    if (value != null) {
                        if (conversion == 1) {
                            println("$value cel = ${temperature.celsiusToFahrenheit(value.toDouble())} fah")
                        } else {
                            println("$value fah = ${temperature.fahrenheitToCelsius(value.toDouble())} cel")
                        }
                    } else {
                        println("enter valid conversion")
                    }
                } else {
                    println("enter a valid conversion")
                }
            }

            4 -> println("Exit")

            else -> println("enter a valid input")
        }
    } else {
        println("enter a valid input")
    }

}



