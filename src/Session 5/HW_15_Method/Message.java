public class Message {
  public static void main(String[] args) {
    System.out.println(welcomeMessage("Kevin", 3));
  }

  public static String welcomeMessage(String name, int visitorNum) {
    return "Welcome " + name + "! You are visitor number " + visitorNum + ".";
  }
}