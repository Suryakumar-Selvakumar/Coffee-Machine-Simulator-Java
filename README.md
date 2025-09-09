# Coffee Machine Simulator with Java

This project simulates a coffee machine that can make different types of coffee, manage its supplies, and handle cash
transactions. It was built step by step, with each stage adding new functionality:

1. **Stage 1 - Make a first cup:**  
   Print the coffee-making process step by step.

2. **Stage 2 - Calculate the ingredients:**  
   Ask the user how many cups of coffee they need and calculate the required amount of water, milk, and coffee beans.

3. **Stage 3 - Estimate the number of servings:**  
   Check whether the available supplies are sufficient for the requested cups, and inform the user if more or fewer cups
   can be made.

4. **Stage 4 - Add functions to your machine:**  
   Add the ability to buy espresso, latte, or cappuccino, refill supplies, or take money from the machine. Track and
   update the machine’s state accordingly.

5. **Stage 5 - Keep track of the supplies:**  
   Extend the machine to handle multiple actions in a loop until the user exits. Add two new commands:
    - `remaining` to display the machine’s current state
    - `exit` to turn off the machine  
      Also allow the user to type `back` to cancel a coffee purchase.

6. **Stage 6 - Brush up your code:**  
   Refactor the program into classes for better structure. Introduce a new `clean` action, requiring the machine to be
   cleaned after 10 coffees are made before it can resume operations.

## Demo

<video width="1920" height="1080" align="center" src="https://github.com/user-attachments/assets/8a5d100d-a745-4372-8a5a-6d96d91d07df"></video>

## Takeaway

This project deepened my understanding of object-oriented programming in Java by pushing me to refactor the program into
classes that modeled both the coffee machine and the coffee drinks. It strengthened my ability to design programs with
maintainability in mind, where responsibilities are clearly divided between objects. Adding the cleaning feature also
highlighted the importance of state management and how different actions interact with the machine’s condition. Overall,
it was a valuable step in building more structured, interactive, and realistic simulations.  
