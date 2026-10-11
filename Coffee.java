public class Coffee extends Beverage {

  private boolean iced;

/*
* Makes a coffee with default values
*/

public Coffee() {
super();
iced = false;
}

/*
* Makes a coffee with all its information
*/

public Coffee(String n, double p, String s,
  boolean i) {
  super(n, p, s);
  iced = i;
}

/*
* Makes a coffee with a name, price, and iced option
*/

public Coffee(String n, double p, boolean i) {
  super(n, p);
  iced = i;
}

/*
* Returns whether the coffee is iced
*/

public boolean getIced() {
  return iced;
}

/*
* Changes whether the coffee is iced
*/

public void setIced(boolean i) {
  iced = i;
}

/*
* Returns the coffee information
*/

public String toString() {
  return super.toString() + "\nIced: " + iced;

    }

}


