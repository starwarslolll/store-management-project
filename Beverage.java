public class Beverage {

private String name;
private double price;
private String size;

/*
* Makes a beverage with default values
*/

public Beverage() {
  name = "Unknown";
  price = 0.0;
  size = "Medium";
 }

/*
* Makes a beverage with a name, price, and size
*/

public Beverage(String n, double p, String s) {
  name = n;
  price = p;
  size = s;
}

/*
* Makes a beverage with a name and price
*/

public Beverage(String n, double p) {
  name = n;
  price = p;
  size = "Medium";
}

/*
* Returns the name of the beverage
*/

public String getName() {
return name;
}

/*
* Changes the name of the beverage
*/

public void setName(String n) {
  name = n;
}

/*
* Returns the price of the beverage
*/

public double getPrice() {
return price;
}

/*
* Changes the price of the beverage
*/

public void setPrice(double p) {
  price = p;
}

/*
* Returns the size of the beverage
*/

public String getSize() {
return size;
}

/*
* Changes the size of the beverage
*/

public void setSize(String s) {
  size = s;
}

/*
* Returns the beverage information
*/

public String toString() {
return "Name: " + name + "\nPrice: $" + price + "\nSize: " + size;
  }

}


