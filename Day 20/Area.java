import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Area extends Applet implements ActionListener
{
    Label lbRadius, lbArea, lbPerimeter;
    TextField txtRadius, txtArea, txtPerimeter;
    Button btnArea, btnPerimeter;

    public void init()
    {
        setLayout(null);

        lbRadius = new Label("Enter Radius : ");
        txtRadius = new TextField();

        lbArea = new Label("Area of Circle : ");
        txtArea = new TextField();

        lbPerimeter = new Label("Perimter of Circle : ");
        txtPerimeter = new TextField();

        txtArea.setEnabled(false);
        txtPerimeter.setEnabled(false);

        btnArea = new Button("Find Area");
        btnPerimeter = new Button("Find Perimeter");

        lbRadius.setBounds(50, 30, 100, 25);
        txtRadius.setBounds(180, 30, 100, 25);

        lbArea.setBounds(50, 60, 100, 25);
        lbPerimeter.setBounds(180, 60, 150, 25);

        txtArea.setBounds(50, 90, 100, 25);
        txtPerimeter.setBounds(180, 90, 100, 25);

        btnArea.setBounds(50, 120, 100, 30);
        btnPerimeter.setBounds(180, 120, 100, 30);

        add(lbRadius);
        add(txtRadius);

        add(lbArea);
        add(txtArea);

        add(lbPerimeter);
        add(txtPerimeter);

        add(btnArea);
        add(btnPerimeter);

        btnArea.addActionListener(this);
        btnPerimeter.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnArea)
        {
            double radius = Double.parseDouble(txtRadius.getText());
            double area = 3.14 * radius * radius;

            txtArea.setText(area + "");
        }
        else if(ae.getSource()==btnPerimeter)
        {
            double radius = Double.parseDouble(txtRadius.getText());
            double perimeter = 2 * 3.14 * radius;

            txtPerimeter.setText(perimeter + "");
        }
    }
}

// <applet code="Area.class" height=200 width=350></applet>