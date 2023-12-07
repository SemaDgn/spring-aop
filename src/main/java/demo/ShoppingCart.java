package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
  public void  checkOut(String status)
  {
      System.out.println("Checkout Methods Called from Shopping Card ");
  }

  public  int quantity()
  {
      return 2;
  }
}
