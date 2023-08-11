import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class MyApplet extends Applet implements ActionListener
{
    Label lbFirst, lbSecond, lbSum;
    TextField txtFirst, txtSecond, txtSum;
    Button btnSum;
    
    public void init()
    {
        setLayout(null);

        lbFirst = new Label("Enter First Number : ");
        lbSecond = new Label("Enter Second Number : ");
        lbSum = new Label("Sum : ");

        txtFirst = new TextField();
        txtSecond = new TextField();
        txtSum = new TextField();

        txtSum.setEnabled(false);

        btnSum = new Button("Click to Add");
        btnSum.addActionListener(this);


        lbFirst.setBounds(20, 50, 120, 25);
        txtFirst.setBounds(150, 50, 80, 25);
        
        lbSecond.setBounds(20, 80, 120, 25);
        txtSecond.setBounds(150, 80, 80, 25);

        lbSum.setBounds(20, 110, 120, 25);
        txtSum.setBounds(150,110, 80, 25);

        btnSum.setBounds(80, 140, 100, 25);

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
// <applet code="MyApplet.class" height=500 width=500></applet>