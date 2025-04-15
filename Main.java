class Main {
   public static void main(String[] args) {
      ArrayList<Money> piggyBank = new ArrayList<Money>();
      piggyBank.add(new Quarter());
      piggyBank.add(new Bill(1));
      piggyBank.add(new Nickel());
      piggyBank.add(new Nickel());
      piggyBank.add(new Dime());
      piggyBank.add(new Coin("half-dollar", 0.50));
      piggyBank.add(new Bill(5));
      System.out.println(piggyBank);
      double amount = 0;
      for (Money item : piggyBank)
      {
        amount += item.getAmount();
      } 
      System.out.println("The piggy bank holds $" + amount + ".");
      System.out.println(piggyBank.get(2).equals(piggyBank.get(3)));
  }
  
  
}
