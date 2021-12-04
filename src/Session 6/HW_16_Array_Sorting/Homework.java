public class Homework {
  public static void main(String[] args) {
    int[] arr = new int[1000];
    for (int i = 0; i < 1000; i++) {
      arr[i] = (int) (Math.random() * 500);
    }
    for (int i = 0; i < 100; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("---------------------------");

    double start = System.currentTimeMillis();
    arr = mergeSort(arr);
    double end = System.currentTimeMillis();

    for (int i = 0; i < 100; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("Merge sort time: " + (end - start) + " milliseconds");

    System.out.println("---------------------------");

    for (int i = 0; i < 1000; i++) {
      arr[i] = (int) (Math.random() * 500);
    }
    for (int i = 0; i < 100; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("---------------------------");

    start = System.currentTimeMillis();
    arr = bubbleSort(arr);
    end = System.currentTimeMillis();

    for (int i = 0; i < 100; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("---------------------------");

    System.out.println("Bubble sort time: " + (end - start) + " milliseconds");
  }

  public static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }

    int[] left = new int[arr.length / 2];
    int[] right = new int[arr.length - left.length];

    for (int i = 0; i < left.length; i++) {
      left[i] = arr[i];
    }

    for (int i = 0; i < right.length; i++) {
      right[i] = arr[i + left.length];
    }

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
  }

  public static int[] merge(int[] n, int[] m) {
    int[] result = new int[n.length + m.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < n.length && j < m.length) {
      if (n[i] < m[j]) {
        result[k] = n[i];
        i++;
      } else {
        result[k] = m[j];
        j++;
      }
      k++;
    }

    while (i < n.length) {
      result[k] = n[i];
      i++;
      k++;
    }

    while (j < m.length) {
      result[k] = m[j];
      j++;
      k++;
    }

    return result;
  }

  public static int[] bubbleSort(int[] n) {
    int[] result = n;
    int length = n.length;
    int temp;
    boolean swapped = false;

    for (int i = 0; i < length; i++) {
      if (i == n.length - 1) {
        break;
      }
      
      if (n[i] > n[i + 1]) {
        temp = n[i];
        n[i] = n[i + 1];
        n[i + 1] = temp;
        swapped = true;
      }
    }

    if (!swapped) {
      return result;
    }
    
    return bubbleSort(result);
  }
}