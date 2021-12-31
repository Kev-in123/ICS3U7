import javax.swing.*;

public class Q1 extends JFrame {
  Q1() {
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    JCheckBox snap = new JCheckBox("Snap to Grid");
    JCheckBox show = new JCheckBox("Show Grid");
    snap.setBounds(23, 35, 100, 30);
    show.setBounds(23, 65, 100, 30);
    add(snap);
    add(show);

    JTextField input_x = new JTextField();
    JLabel label_x = new JLabel("X:");
    JTextField input_y = new JTextField();
    JLabel label_y = new JLabel("Y:");
    input_x.setBounds(180, 35, 50, 25);
    label_x.setBounds(160, 35, 20, 20);
    input_y.setBounds(180, 65, 50, 25);
    label_y.setBounds(160, 65, 20, 20);
    add(input_x);
    add(input_y);
    add(label_x);
    add(label_y);

    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");
    JButton help = new JButton("Help");
    ok.setBounds(250, 10, 95, 30);
    cancel.setBounds(250, 45, 95, 30);
    help.setBounds(250, 80, 95, 30);
    add(ok);
    add(cancel);
    add(help);
    
    pack();
    setSize(377, 167);
  }
  public static void main(String[] args) {
    new Q1();
  }
}