import java.util.Scanner;

class Main {
  public static void main(String[] args) 
{
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a number between 0 and 1000 ");
  int a = scan.nextInt();

  int b = a % 10; //gets the ones digit

  int c = (a % 100 - b) / 10; //gets the tens digit

  int d = (a % 1000 - c) / 100; //gets the hundreds digit

  System.out.println("The multiplication of all the digits in " + a + " is " + (b*c*d);
}
}