public class ComputePI {
  public static void main(String[] args) {
    double pi = 0;
    int current = 1;
    for (int i = 1; i <= 100000; i += 2) {
      pi += 1.0/(i*current);
      current *= -1;
    }
    pi *= 4;
    System.out.format("%.3f", pi);
  }
}


