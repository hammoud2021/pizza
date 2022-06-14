public class Pizza

{
  //instance data
  private String pizzaPlace;
  private int numToppings;
  private boolean stretchyCheese;
  private double costLarge;
  private boolean def;
  
  //constructor
  public Pizza(String pp, int t, boolean sc, double c, boolean d)
  {
    setPizzaPlace(pp);
    setNumToppings(t);
    setStretchyCheese(sc);
    setCostLarge(c);
    setDef(d);
  }


//default constructor
public Pizza()
  {
    this("nothing", 0, false, 0.00, true);
  }

  
     
//accessor method
    public String getPizzaPlace()
    {
      return pizzaPlace;
    }
    public int getNumToppings()
    {
      return numToppings;
    }
    public boolean getStretchyCheese()
    {
      return stretchyCheese;
    }
    public double getCostLarge()
    {
      return costLarge;
    }
    public boolean getDef()
    {
      return def;
    }

    //mutator method
    public void setPizzaPlace(String pp)
    {
      pizzaPlace = pp;
    }
    public void setNumToppings(int t)
    {
      numToppings = t;
    }
    public void setStretchyCheese(boolean sc)
    {
      stretchyCheese = sc;
    }
    public void setCostLarge(double c)
    {
      costLarge = c;
    }
    public void setDef(boolean d)
    {
      def = d;
    }
    

    //additional method, discount method
    public double discount()
{
  return((int)10*Math.random());
}


//additional method, huge variety method
public boolean hugeVariety()
{
  if(numToppings>5)
  {
  return true;
  }
  else
  {
    return false;
  }
}



//equals method for comparison
    public boolean equals(Pizza d)
{
  if(this.getPizzaPlace().equals(d.getPizzaPlace()))
  {
    return true;
    }
  else
  {
    return false;
    }
}


    //pizza place information printed
    public String toString()
  {
    String str = "";
    str = "\nPizza Place: " + pizzaPlace + "\nNumber of Toppings offered: " + numToppings + "\nStretchy cheese? " + stretchyCheese + "\nCost of a large: " + costLarge;
    return str;
  }
}