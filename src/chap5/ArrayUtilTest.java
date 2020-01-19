package chap5;
class ArrayUtil {

	   public static int[] concat(int[] a, int[] b) {
	      int sumLength = a.length + b.length;
	      int[] arrSum = new int[sumLength];
	      for (int i = 0; i < sumLength; i++) {
	         if (i < a.length) {
	            arrSum[i] = a[i];
	         } else {
	            arrSum[i] = b[i - a.length];
	         }

	      }
	      return arrSum;
	   }

	   public static void print(int[] a) {
	      System.out.print("[");
	      for (int i = 0; i < a.length - 1; i++) {

	         System.out.print(a[i] + ", ");

	      }

	      System.out.println(a[a.length - 1] + "]");

	   }

	}

public class ArrayUtilTest {

	  public static void main(String[] args) {
	      int[] array1 = { 1, 3, 5, 7, 9 };
	      int[] array2 = { 2, 4, 6, 8, 10 };
	      int[] array3 = ArrayUtil.concat(array1, array2);

	      ArrayUtil.print(array3);

	   }


}
