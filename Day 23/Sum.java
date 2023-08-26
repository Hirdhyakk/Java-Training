import javax.swing.*;
import java.awt.event.*;
// import java.applet.*;
// import java.awt.*;

public class Sum extends JApplet implements ActionListener
{
    JLabel lbFirst, lbSecond, lbSum;
    JTextField txtFirst, txtSecond, txtSum;
    JButton btnSum;
    
    public void init()
    {
        setLayout(null);

        lbFirst = new JLabel("Enter First Number : ");
        lbSecond = new JLabel("Enter Second Number : ");
        lbSum = new JLabel("Sum : ");

        txtFirst = new JTextField();
        txtSecond = new JTextField();
        txtSum = new JTextField();

        txtSum.setEnabled(false);

        btnSum = new JButton("Click to Add");
        btnSum = new JButton(new ImageIcon("3412.jpg"));
        btnSum.addActionListener(this);


        lbFirst.setBounds(20, 50, 120, 25);
        txtFirst.setBounds(150, 50, 80, 25);
        
        lbSecond.setBounds(20, 80, 120, 25);
        txtSecond.setBounds(150, 80, 80, 25);

        lbSum.setBounds(20, 110, 120, 25);
        txtSum.setBounds(150,110, 80, 25);

        btnSum.setBounds(80, 140, 400, 200);

        add(lbFirst);
        add(txtFirst);

        add(lbSecond);
        add(txtSecond);

        add(lbSum);
        add(txtSum);        
        
        add(btnSum);

    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnSum)
        {
            double num1 = Double.parseDouble(txtFirst.getText());
            double num2 = Double.parseDouble(txtSecond.getText());
            double sum = num1 + num2;

            txtSum.setText(sum + "");
        }
    }
}
// <applet code="Sum.class" height=500 width=500></applet>