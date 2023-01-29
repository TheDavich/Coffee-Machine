package machine
class CoffeeMachine {
    var water = 400
    var milk = 540
    var coffee = 120
    var money = 550
    var cups = 9

    fun display() {
        while (true) {
            println("Write an action (buy, fill, take, remaining, exit):")
            var choise = readln().toString()
            when (choise) {
                "buy" -> {
                    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                    val coffeeChoise = readln()
                    when (coffeeChoise) {
                        "1" -> {
                            if (water >= 250 && coffee >= 16 && cups >= 1) {
                                println("I have enough resources, making you a coffee!")
                                water -= 250
                                coffee -= 16
                                money += 4
                                cups -= 1
                            } else println("Sorry, not enough resources")
                        }

                        "2" -> {
                            if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
                                println("I have enough resources, making you a coffee!")
                                water -= 350
                                milk -= 75
                                coffee -= 20
                                money += 7
                                cups -= 1
                            } else println("Sorry, not enough resources")
                        }

                        "3" -> {
                            if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
                                println("I have enough resources, making you a coffee!")
                                water -= 200
                                milk -= 100
                                coffee -= 12
                                money += 6
                                cups -= 1
                            } else println("Sorry, not enough resources")
                        }

                        "back" -> {
                        }
                    }
                }

                "fill" -> {
                    println("Write how many ml of water you want to add:")
                    val waterAdd = readln().toInt()
                    water += waterAdd
                    println("Write how many ml of milk you want to add:")
                    val milkAdd = readln().toInt()
                    milk += milkAdd
                    println("Write how many grams of coffee beans you want to add:")
                    val coffeeAdd = readln().toInt()
                    coffee += coffeeAdd
                    println("Write how many disposable cups you want to add:")
                    val cupsAdd = readln().toInt()
                    cups += cupsAdd
                }


                "take" -> {
                    println("I gave you $$money")
                    money -= money
                }

                "remaining" -> {
                    println("The coffee machine has:\n" +
                            "$water ml of water\n" +
                            "$milk ml of milk\n" +
                            "$coffee g of coffee beans\n" +
                            "$cups disposable cups\n" +
                            "$$money of money")
                }

                "exit" -> {
                    return
                }
            }
        }
    }
}
