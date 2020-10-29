import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

 
    public static void main(String[] args) {
      final byte monthsInYear = 12;
      final byte percent = 100;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Principal: ");
      int principal = scanner.nextInt();

      System.out.print("Annual Interest: ");
      float annualRate = scanner.nextFloat();
      float monthlyInterest = annualRate / percent / monthsInYear;

      System.out.print("Period in Years: ");
      byte years = scanner.nextByte();
      float totalPayments = years * monthsInYear;

      double mortgage = principal *(monthlyInterest * Math.pow(1+ monthlyInterest, totalPayments)) / (Math.pow(1 + monthlyInterest, totalPayments));

      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

      System.out.println("Your monthly mortgage is " + mortgageFormatted);


}
}