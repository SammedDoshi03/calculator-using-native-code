import java.util.*;

public class deathNote {
  static {
    System.loadLibrary("dll");
  }

  private native int addition(int firstNumber, int secondNumber);

  private native int subtraction(int firstNumber, int secondNumber);

  private native int multiplication(int firstNumber, int secondNumber);

  private native int division(int firstNumber, int secondNumber);

  private native float sine(int number);

  private native float cosine(int number);

  private native float tangent(int number);

  private native float sqrt(int number);

  public static void main(String[] args) {
    System.out.println("Welcome To Reality");

    int firstNumber, secondNumber = 0;
    int choice, confirmation = 0;
    float result;

    deathNote kira = new deathNote();
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println(
        "Enter Numbers (Either one or two based on opertation)"
      );
      firstNumber = sc.nextInt();
      System.out.println("Do you want to include second no (1/0) ");
      int ch = sc.nextInt();
      if (ch == 1) {
        System.out.println("Enter Number :");
        secondNumber = sc.nextInt();
      }

      System.out.println(
        "Choose Operation \n1.Addition \t 2.Substraction \t 3.multiplication"
      );
      System.out.println("4.Divison \t 5.Sine \t 6.Cosine");
      System.out.println("7.Tangent \t 8.Square Root");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          result = kira.addition(firstNumber, secondNumber);
          System.out.println("addition: " + result);
          break;
        case 2:
          result = kira.subtraction(firstNumber, secondNumber);
          System.out.println("subtraction: " + result);
          break;
        case 3:
          result = kira.multiplication(firstNumber, secondNumber);
          System.out.println("multiplication: " + result);
          break;
        case 4:
          result = kira.division(firstNumber, secondNumber);
          System.out.println("division: " + result);
          break;
        case 5:
          result = kira.sine(firstNumber);
          System.out.println("sine: " + result);
          break;
        case 6:
          result = kira.cosine(firstNumber);
          System.out.println("cosine: " + result);
          break;
        case 7:
          result = kira.tangent(firstNumber);
          System.out.println("tangent: " + result);
          break;
        case 8:
          result = kira.sqrt(firstNumber);
          System.out.println("square root: " + result);
          break;
        default:
          System.out.println("This is a wrong choice");
      }
      System.out.println("Do you want to perform next operation: (1/0) ");
      confirmation = sc.nextInt();
    } while (confirmation == 1);
  }
}
