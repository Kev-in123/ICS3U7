public class Alarm {
  public static void main(String[] args) {
    printAlarm(10);
  }

  public static void printAlarm(int times) {
    if (times < 1) {
      System.out.println("Must be larger than 1");
      return;
    }
    for (int i = 0; i < times; i++) {
      System.out.println("Alarm!");
    }
  }
}
