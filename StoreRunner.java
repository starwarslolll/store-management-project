import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);


    // Welcome message

System.out.println("Welcome to The Hourly Drink!");
System.out.println("-----------------------");


/*
* Creates a regular beverage
*/

Beverage drink1 = new Beverage(
 "Hot Chocolate", 4.50, "Small");


/*
* Creates two coffee drinks
*/ 

Coffee coffee1 = new Coffee(
"Vanilla Latte", 5.50, "Large", true);

Coffee coffee2 = new Coffee(
"Caramel Latte", 5.00, "Medium", false);

/*
/ Creates two smoothies
*/

Smoothie smoothie1 = new Smoothie(
"Strawberry Smoothie", 6.00, "Large", "Strawberry");

Smoothie smoothie2 = new Smoothie(
"Mango Smoothie", 5.75,"Medium", "Mango");

/*
* Prints each drink
*/

System.out.println("\nDrink 1:");
System.out.println(drink1);

System.out.println("\nDrink 2:");
System.out.println(coffee1);

System.out.println("\nDrink 3:");
System.out.println(coffee2);

System.out.println("\nDrink 4:");
System.out.println(smoothie1);

System.out.println("\nDrink 5:");
System.out.println(smoothie2);

/*
/ Changes a coffee order
*/

coffee1.setSize("Small");
coffee1.setPrice(4.75);

System.out.println("\nUpdated Coffee Order:");
System.out.println(coffee1);

/*
/ Changes a smoothie order
*/

smoothie1.setFruit("Banana");

System.out.println("\nUpdated Smoothie Order:");
System.out.println(smoothie1);

/*
* Uses getter methods
*/

System.out.println("\nOrder Summary:");
System.out.println(coffee1.getName());
System.out.println(smoothie1.getFruit());
System.out.println("\nThank you for visiting!");

/*
* Closes the Scanner object
*/
    input.close();
    
  }
}
