import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame implements ActionListener 
{
    Label lbFirst, lbSecond, lbSum;
    TextField txtFirst, txtSecond, txtSum;
    Button btnSum;
    Font f;

    MyFrame1() {
        setLayout(null);

        f = new Font("", Font.PLAIN, 15);

        lbFirst = new Label("Enter First Number : ");
        txtFirst = new TextField();

        lbSecond = new Label("Enter Second Number : ");
        txtSecond = new TextField();

        lbSum = new Label("Sum : ");
        txtSum = new TextField();
        txtSum.setEnabled(false);

        btnSum = new Button("Click to Add");
        btnSum.setFont(f);

        lbFirst.setBounds(20, 50, 100, 25);
        txtFirst.setBounds(150, 50, 100, 25);
        lbSecond.setBounds(20, 90, 100, 25);
        txtSecond.setBounds(150, 90, 100, 25);
        btnSum.setBounds(100, 130, 100, 30);
        lbSum.setBounds(20, 170, 100, 25);
        txtSum.setBounds(150, 170, 100, 25);

        add(lbFirst);
        add(txtFirst);
        add(lbSecond);
        add(txtSecond);
        add(lbSum);
        add(txtSum);
        add(btnSum);

        btnSum.addActionListener(this);
        addWindowListener(new MyWindow());
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSum) {
            double num1 = Double.parseDouble(txtFirst.getText());
            double num2 = Double.parseDouble(txtSecond.getText());
            double result = num1 + num2;
            txtSum.setText(result + "");
        }
    }

    class MyWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent we) 
        {
            System.exit(0);
        }
    }

    // public void windowOpened(WindowEvent e) {
    // }

    // public void windowClosed(WindowEvent e) {
    // }

    // public void windowIconified(WindowEvent e) {
    // }

    // public void windowDeiconified(WindowEvent e) {
    // }

    // public void windowActivated(WindowEvent e) {
    // }

    // public void windowDeactivated(WindowEvent e) {
    // }

    public static void main(String[] args) {
        MyFrame1 ob = new MyFrame1();
        ob.setVisible(true);
        ob.setSize(400, 400);
    }
}