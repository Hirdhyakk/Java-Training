import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends Applet implements ActionListener
{
    Label lbCalculator;
    TextField txtResult;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual;
    Button btnAC, btnDel, btnPoint;
    char ch='+';
    double num1, num2, result;
    int current;

    public void init()
    {
        setLayout(null);

        lbCalculator = new Label("Calculator");
        txtResult = new TextField("0");
        txtResult.setEnabled(false);

        btnOne = new Button("1");
        btnTwo = new Button("2");
        btnThree = new Button("3");
        btnFour = new Button("4");
        btnFive = new Button("5");
        btnSix = new Button("6");
        btnSeven = new Button("7");
        btnEight = new Button("8");
        btnNine = new Button("9");
        btnZero = new Button("0");

        btnAdd = new Button("+");
        btnSubtract = new Button("-");
        btnMultiply = new Button("*");
        btnDivide = new Button("/");
        btnEqual = new Button("=");
        
        btnAC = new Button("AC");
        btnDel = new Button("Del");
        btnPoint = new Button(".");

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnZero.addActionListener(this);

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAC.addActionListener(this);
        btnDel.addActionListener(this);
        btnPoint.addActionListener(this);

        lbCalculator.setBounds(175, 50, 100, 25);

        txtResult.setBounds(100, 80, 200, 30);

        btnAC.setBounds(100, 120, 50, 25);
        btnDel.setBounds(150, 120, 50, 25);
        btnDivide.setBounds(250, 120, 50, 25);

        btnSeven.setBounds(100, 150, 50, 25);
        btnEight.setBounds(150, 150, 50, 25);
        btnNine.setBounds(200, 150, 50, 25);
        btnMultiply.setBounds(250, 150, 50, 25);

        btnFour.setBounds(100, 180, 50, 25);
        btnFive.setBounds(150, 180, 50, 25);
        btnSix.setBounds(200, 180, 50, 25);
        btnSubtract.setBounds(250, 180, 50, 25);

        btnOne.setBounds(100, 210, 50, 25);
        btnTwo.setBounds(150, 210, 50, 25);
        btnThree.setBounds(200, 210, 50, 25);
        btnAdd.setBounds(250, 210, 50, 25);

        btnZero.setBounds(150, 240, 50, 25);
        btnPoint.setBounds(200, 240, 50, 25);
        btnEqual.setBounds(250, 240, 50, 25);

        add(lbCalculator);
        add(txtResult);
        add(btnOne);
        add(btnTwo);
        add(btnThree);
        add(btnFour);
        add(btnFive);
        add(btnSix);
        add(btnSeven);
        add(btnEight);
        add(btnNine);
        add(btnZero);

        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);
        add(btnEqual);

        add(btnAC);
        add(btnDel);
        add(btnPoint);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnOne)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "1");
            else
                txtResult.setText("1");
        }
        else if(ae.getSource()==btnTwo)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "2");
            else
                txtResult.setText("2");
        }
        else if(ae.getSource()==btnThree)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "3");
            else
                txtResult.setText("3");
        }
        else if(ae.getSource()==btnFour)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "4");
            else
                txtResult.setText("4");
        }
        else if(ae.getSource()==btnFive)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "5");
            else
                txtResult.setText("5");
        }
        else if(ae.getSource()==btnSix)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "6");
            else
                txtResult.setText("6");
        }
        else if(ae.getSource()==btnSeven)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "7");
            else
                txtResult.setText("7");
        }
        else if(ae.getSource()==btnEight)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "8");
            else
                txtResult.setText("8");
        }
        else if(ae.getSource()==btnNine)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "9");
            else
                txtResult.setText("9");
        }
        else if(ae.getSource()==btnZero)
        {
            current = Integer.parseInt(txtResult.getText());
            if(current>0)
                txtResult.setText(current + "0");
            else
                txtResult.setText("0");
        }

        else if(ae.getSource()==btnAdd)
        {
            ch='+';
            num1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnSubtract)
        {
            ch='-';
            num1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnMultiply)
        {
            ch='*';
            num1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnDivide)
        {
            ch='/';
            num1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnEqual)
        {
            num2 = Double.parseDouble(txtResult.getText());
            result = calculate(ch, num1, num2);
            txtResult.setText(result + "");
        }

        else if(ae.getSource()==btnAC)
        {
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnDel)
        {
            int value = Integer.parseInt(txtResult.getText());
            value = value/10;
            txtResult.setText(value + "");
        }
        // else if(ae.getSource()==btnPoint)
        // {
        //     current = 
        // }
    }

    public static double calculate(char ch, double num1, double num2)
    {
        double result=0;
        switch(ch)
        {
            case '+':
                result = num1 + num2;
            break;

            case '-':
                result = num1 - num2;
            break;
            
            case '*':
                result = num1 * num2;
            break;

            case '/':
                result = num1 / num2;
            break;
        }
        return result;
    }
    
}
// <applet code="Calculator.class" height=400 width=450></applet>