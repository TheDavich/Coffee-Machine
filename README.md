##
Coffee Machine ☕
Welcome to the virtual coffee machine! This is a console application that allows you to make your favorite coffee, refill ingredients, take money, and check the remaining resources.
##
☕ Features
Brewing Coffee: You can select the type of coffee you want to brew (espresso, latte, cappuccino), and the application will check if there are enough resources (water, milk, coffee beans, and cups) to make the chosen beverage. If everything is in order, your coffee will be brewed, and the cost will be added to the total money.

Refilling Ingredients: If you run out of any ingredients (water, milk, coffee beans, cups), you can refill them into the coffee machine.

Taking Money: You can withdraw the money collected by the coffee machine.

Checking Remaining Resources: You can check the current status of the coffee machine, including the remaining:

Water (in ml)
Milk (in ml)
Coffee beans (in grams)
Disposable cups
Money (in dollars)
Exit: You can exit the coffee machine application.

##
🚀 Getting Started
Clone this repository to your local machine.

Open your terminal or command prompt and navigate to the project directory.

Compile the Kotlin source code:

shell
Copy code
kotlinc CoffeeMachine.kt -include-runtime -d CoffeeMachine.jar
Run the application:

shell
Copy code
java -jar CoffeeMachine.jar

##
💡 How to Use
When you run the application, you will be prompted with a list of actions:

buy: Choose this option to buy coffee. You'll be prompted to select the type of coffee (espresso, latte, cappuccino).

fill: Use this option to add ingredients to the coffee machine. You can add water, milk, coffee beans, and disposable cups.

take: Select this option to take the money collected by the coffee machine.

remaining: Check the current status of the coffee machine, including the remaining resources.

exit: Exit the coffee machine application.

##
📝 Example
Here's an example of how you can interact with the coffee machine:

shell
Copy code
Write an action (buy, fill, take, remaining, exit):
You can then enter one of the actions mentioned above and follow the prompts to use the coffee machine.
