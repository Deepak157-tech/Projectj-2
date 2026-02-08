public class FloatExample {
    public static void main(String [] args) {
       // Declaring float variables

        float price = 11.99f;
        float taxRate = 0.08f;

        // Calculations

        float taxAmount = price * taxRate;
        float totalPrice = price + taxAmount;

        // Output

        System.out.println("Price: $"+ price);
         System.out.println("Tax: $"+ taxAmount);
          System.out.println("Total Price: $"+ totalPrice);



    }
    
}
