public class Money
{
    public double price;
    public String name;
  public Money(double price)
  {
    this.price = price;
  }
  public double getAmount()
  {
    return price;
  }
}
 class Coin extends Money
{
    private String name;
    private double price;
   // private Money a;
    public Coin(String name, double price)
    {
        super(price);
        this.name = name;
    }
    public String toString()
    {
        return this.name;
    }
    
    public boolean equals(Money other)
    {
        if(this.name.equals(other.name) && this.price == other.price)
        {
            return true;
        }
        else 
        return false;
    }
}
 class Bill extends Money
{
    
    public Bill(int price)
    {
        super(price);
    }
    public String toString()
    {
        return "$" + price;
    }
}
 class Quarter extends Coin
{
    public Quarter()
    {
        super("quarter", 0.25);
    }

}
 class Dime extends Coin
{
    public Dime()
    {
        super("dime", 0.10);
    }

}

 class Nickel extends Coin
{
    public Nickel()
    {
        super("nickel", 0.05);
    }

}
