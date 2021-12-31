import java.awt.*;
import javax.swing.*;

public class Q2 extends JFrame {
  Q2() {
    setVisible(true);
    add(new JTextField(), BorderLayout.PAGE_START);
    add(new KeyPad(), BorderLayout.CENTER);
    pack();
    setSize(300, 300);
  }

  public static class KeyPad extends JPanel {
    KeyPad() {
      setLayout(new GridLayout(4, 4));
      add(new JButton("7"));
      add(new JButton("8"));
      add(new JButton("9"));
      add(new JButton("/"));
      add(new JButton("4"));
      add(new JButton("5"));
      add(new JButton("6"));
      add(new JButton("*"));
      add(new JButton("1"));
      add(new JButton("2"));
      add(new JButton("3"));
      add(new JButton("-"));
      add(new JButton("0"));
      add(new JButton("."));
      add(new JButton("="));
      add(new JButton("+"));
    }
  }

  public static void main(String[] args) {
    new Q2();
  }
}