public class Paper {
  public static void main(String[] args) {
    double paper_height = 0.09;
    double paper_area = 1;
    for (int i = 0; i < 40; i++) {
      paper_area /= 2;
      paper_height *= 2;
    }
    System.out.println("paper area: " + paper_area + "m\u00b2");
    System.out.println("pile height: " + paper_height + "mm");
  }
}
