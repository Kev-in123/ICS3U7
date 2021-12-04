public class Month {
  public static void main(String[] args) {
    System.out.println(findMonth(5));
  }

  public static String findMonth(int n) {
    switch (n) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "Septemeber";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid number";
    }
  }
}