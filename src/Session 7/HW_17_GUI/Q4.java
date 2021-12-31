import java.awt.*;
import javax.swing.*;

public class Q4 extends JFrame {
  Q4() {
    setVisible(true);
    add(new JLabel(
        "<html>Type some text using your keyboard. The keys you press will be hilighted and the text will be displayed.<br>Note: Clicking the buttons with your mouse will not perform any action.</html>"));
    JTextArea textArea = new JTextArea(35, 100);
    add(textArea);
    add(new KeyBoard(), BorderLayout.CENTER);
    pack();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
  }

  public static class KeyBoard extends JPanel {
    String[][] keys = { { "~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "Backspace" },
                        { "Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\" },
                        { "Caps Lock", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter" },
                        { "Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "^" },
                        { " ", "<", "v", ">"}};
    KeyBoard() {
      setLayout(new GridLayout(5, 2));
      for (String[] row: keys) {
        JPanel rowKeys = new JPanel();
        rowKeys.setLayout(new GridLayout(1, row.length));
        for (String key: row) {
          rowKeys.add(new JButton(key));
        }
        add(rowKeys);
      }
    }
  }

  public static void main(String[] args) {
    new Q4();
  }
}
