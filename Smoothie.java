public class Smoothie extends Beverage {

private String fruit;

/*
* Creates a smoothie with default values.
*/

public Smoothie() {
super();
fruit = "Strawberry";

}

/*
* Creates a smoothie with all its information.
*/

public Smoothie(String n, double p, String s,
  String f) {
  super(n, p, s);
  fruit = f;
}

/*
* Makes a smoothie with a name, price, and fruit
*/

public Smoothie(String n, double p, String f) {
  super(n, p);
  fruit = f;
}

/*
* Returns the fruit in the smoothie.
*/

public String getFruit() {
  return fruit;
}

/*
* Changes the fruit in the smoothie.
*/

public void setFruit(String f) {
  fruit = f;
}

/*
* Returns the smoothie information
*/

public String toString() {
  return super.toString() + "\nFruit: " + fruit;
  }
}


