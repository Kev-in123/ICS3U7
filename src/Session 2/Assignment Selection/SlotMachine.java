public class SlotMachine {
  public static void main(String[] args) {
    int slot1 = (int) (Math.random() * 3) + 1;
    int slot2 = (int) (Math.random() * 3) + 1;
    int slot3 = (int) (Math.random() * 3) + 1;
    System.out.format("You got %d %d %d\n", slot1, slot2, slot3);
    if (slot1 == slot2 && slot2 == slot3) {
      if (slot1 == 1) {
        System.out.println("You got 4 tokens");
      } else if (slot1 == 2) {
        System.out.println("You got 8 tokens");
       } else if (slot1 == 3) {
        System.out.println("You got 12 tokens");
      }
     }
    else if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {
      System.out.println("You got 1 token");
    } else {
      System.out.println("You got 0 tokens");
    }
  }
}

