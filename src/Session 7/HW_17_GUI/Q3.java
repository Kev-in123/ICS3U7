import javax.swing.*;

public class Q3 extends JFrame {
  Q3() {
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    JButton button_print = new JButton("OK");
    JButton button_exit = new JButton("Cancel");
    JButton button_setup = new JButton("Setup...");
    JButton button_help = new JButton("Help");
    
    button_print.setBounds(375, 10, 80, 40);
    button_exit.setBounds(375, 60, 80, 40);
    button_setup.setBounds(375, 110, 80, 40);
    button_help.setBounds(375, 160, 80, 40);

    add(button_print);
    add(button_exit);
    add(button_setup);
    add(button_help);


    JTextField text_area1 = new JTextField();
    JTextField text_area2 = new JTextField();
    JTextField text_area3 = new JTextField();

    text_area1.setBounds(20, 40, 70, 120);
    text_area2.setBounds(150, 40, 50, 120);
    text_area3.setBounds(290, 40, 70, 120);
    
    add(text_area1);
    add(text_area2);
    add(text_area3);


    JLabel printer = new JLabel("Printer: MyPrinter");
    JLabel quality = new JLabel("Print Quality: ");

    printer.setBounds(20, 15, 120, 20);
    quality.setBounds(20, 163, 120, 20);

    add(printer);
    add(quality);


    JRadioButton selection = new JRadioButton("Selection");
    JRadioButton all = new JRadioButton("All");
    JRadioButton applet = new JRadioButton("Applet");

    selection.setBounds(200, 50, 90, 20);
    all.setBounds(200, 80, 90, 20);
    applet.setBounds(200, 110, 90, 20);

    add(selection);
    add(all);
    add(applet);


    JCheckBox image = new JCheckBox("Image");
    JCheckBox text = new JCheckBox("Text");
    JCheckBox code = new JCheckBox("Code");
    JCheckBox file = new JCheckBox("Print to file");

    image.setBounds(90, 50, 100, 30);
    text.setBounds(90, 80, 100, 30);
    code.setBounds(90, 110, 100, 30);
    file.setBounds(180, 155, 100, 30);

    add(image);
    add(text);
    add(code);
    add(file);

    JComboBox combo = new JComboBox();
    combo.addItem("High");
    combo.setBounds(100, 163, 70, 20);
    add(combo);

    pack();
    setSize(500, 250); 
  }

  public static void main(String[] args) {
    new Q3();
  }
}