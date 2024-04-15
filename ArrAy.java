import java.util.Arrays;
public class ArrAy {
  public static void main(String[] args) {
    int[] originalArray = {
      7,
      2,
      4,
      1,
      3,
      5,
      6,
      8,
      2,
      10
    };

    System.out.println("Original array: " + Arrays.toString(originalArray));

    partitionArray(originalArray);

    System.out.println("After partition the said array becomes: " + Arrays.toString(originalArray));
  }

  public static void partitionArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {

      while (arr[left] % 2 == 0 && left < right) {
        left++;
      }

      while (arr[right] % 2 != 0 && left < right) {
        right--;
      }

      if (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
  }
}
