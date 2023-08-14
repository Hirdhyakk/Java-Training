import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calculator extends Applet implements ActionListener
{
    Label lbCalculator;
    TextField txtResult;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnPercentile, btnEqual;
    Button btnAC, btnDel, btnPoint;

    String s;
    double num1, num2, result;
    char ch;
    double current;

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
        btnMultiply = new Button("x");
        btnDivide = new Button("\u00F7");
        btnPercentile = new Button("%");
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
        btnPercentile.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAC.addActionListener(this);
        btnDel.addActionListener(this);
        btnPoint.addActionListener(this);

        lbCalculator.setBounds(175, 50, 100, 25);

        txtResult.setBounds(100, 80, 200, 30);

        btnAC.setBounds(100, 120, 50, 25);
        btnDel.setBounds(150, 120, 50, 25);
        btnPercentile.setBounds(200, 120, 50, 25);
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
        add(btnPercentile);
        add(btnEqual);

        add(btnAC);
        add(btnDel);
        add(btnPoint);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnOne)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "1");
            else
                txtResult.setText("1");
        }
        else if(ae.getSource()==btnTwo)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "2");
            else
                txtResult.setText("2");
        }
        else if(ae.getSource()==btnThree)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "3");
            else
                txtResult.setText("3");
        }
        else if(ae.getSource()==btnFour)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "4");
            else
                txtResult.setText("4");
        }
        else if(ae.getSource()==btnFive)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "5");
            else
                txtResult.setText("5");
        }
        else if(ae.getSource()==btnSix)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "6");
            else
                txtResult.setText("6");
        }
        else if(ae.getSource()==btnSeven)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "7");
            else
                txtResult.setText("7");
        }
        else if(ae.getSource()==btnEight)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "8");
            else
                txtResult.setText("8");
        }
        else if(ae.getSource()==btnNine)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "9");
            else
                txtResult.setText("9");
        }
        else if(ae.getSource()==btnZero)
        {
            current = Double.parseDouble(txtResult.getText());
            if(current>0 || txtResult.getText().indexOf('.')!=-1)
                txtResult.setText(txtResult.getText() + "0");
            else
                txtResult.setText("0");
        }

        else if(ae.getSource()==btnAC)
        {
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnDel)
        {
            s = txtResult.getText();
            if(s.length()==1)
            {
                txtResult.setText("0");
            }
            else
            {
                txtResult.setText(s.substring(0, s.length()-1));
            }
        }
        else if(ae.getSource()==btnPoint)
        {
            if(txtResult.getText().indexOf('.')==-1)
            {
                txtResult.setText(txtResult.getText() + ".");
            }
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
        else if(ae.getSource()==btnPercentile)
        {
            ch='%';
            num1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("0");
        }
        else if(ae.getSource()==btnEqual)
        {
            num2 = Double.parseDouble(txtResult.getText());
            result = calculate(ch, num1, num2);
            txtResult.setText(result + "");
        }
    }

    public static double calculate(char ch, double num1, double num2)
    {
        double ans=0;
        switch(ch)
        {
            case '+':
                ans = num1 + num2;
            break;

            case '-':
                ans = num1 - num2;
            break;
            
            case '*':
                ans = num1 * num2;
            break;

            case '/':
                ans = num1 / num2;
            break;

            case '%':
                ans = num1 % num2;
        }
        return ans;
    }
}

// <applet code="Calculator.class" height=300 width=400> </applet>