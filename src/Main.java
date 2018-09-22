import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int arrayLength = scanner.nextInt();

    if (!isArrayLengthValid(arrayLength)) {
      return;
    }

    int k = scanner.nextInt();

    if (!isKValid(k)) {
      return;
    }

    int[] numbers = new int[arrayLength];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    if (!isArrayValid(numbers)) {
      return;
    }

    int validCount = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        int total = numbers[i] + numbers[j];
        if (total % k == 0 && i < j) {
          validCount += 1;
        }
      }
    }
    System.out.println(validCount);
  }

  private static boolean isArrayLengthValid(int value) {
    return (value >= 2 && value <= 100);
  }

  private static boolean isKValid(int value) {
    return (value >= 1 && value <= 100);
  }

  private static boolean isArrayValid(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      return (numbers[i] >= 1 && numbers[i] <= 100);
    }
    return false;
  }

}
