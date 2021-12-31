import javax.swing.*;

public class Q5 extends JFrame {

  Q5() {
    setLayout(null);
    setVisible(true);

    JLabel label = new JLabel("Temprature converter");
    JLabel label1 = new JLabel("Enter temprature in Farhenheit: ");
    JLabel label2 = new JLabel("Celsius: ");
    JTextField txt = new JTextField();

    label.setBounds(100, 50, 200, 30);
    label1.setBounds(100, 100, 200, 30);
    label2.setBounds(100, 150, 200, 30);
    txt.setBounds(300, 100, 200, 30);

    add(txt);
    add(label);
    add(label1);
    add(label2);

    pack();
    setSize(600, 400);

    double f = 0;
    while (true) {
      try {
        f = Double.parseDouble(txt.getText());
      } catch (Exception e) {
        label2.setText("Celsius: Invalid number");
        continue;
      }
      label2.setText("Celsius: " + (f - 32) * 5 / 9);
    }

  }

  public static void main(String args[]) {
    new Q5();
  }
}
