import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Stock extends Applet implements ActionListener
{
    Label lbEnterItem, lbItemInStock, lbSelectedItems;
    TextField txtEnterItem;
    Button btnAddToStock, btnSelectItem, btnRemoveSelected, btnRemoveAll;
    List StockList, SelectedList;

    public void init()
    {
        setLayout(null);

        lbEnterItem = new Label("Enter Item Name : ");
        lbItemInStock = new Label("Items in Stock");
        lbSelectedItems = new Label("Selected Items");

        txtEnterItem = new TextField();

        btnAddToStock = new Button("Add To Stock");
        btnSelectItem = new Button("Selet Item");
        btnRemoveSelected = new Button("Remove Selected Item");
        btnRemoveAll = new Button("Remove All Selected Items");

        btnAddToStock.addActionListener(this);
        btnSelectItem.addActionListener(this);
        btnRemoveSelected.addActionListener(this);
        btnRemoveAll.addActionListener(this);

        StockList = new List();
        SelectedList = new List();

        lbEnterItem.setBounds(20, 50, 100, 25);
        txtEnterItem.setBounds(160, 50, 150, 25);
        btnAddToStock.setBounds(340, 50, 100, 25);

        lbItemInStock.setBounds(20, 90, 200, 25);
        lbSelectedItems.setBounds(240, 90, 200, 25);

        StockList.setBounds(20, 125, 200, 300);
        SelectedList.setBounds(240, 125, 200, 300);

        btnSelectItem.setBounds(55, 435, 100, 25);
        btnRemoveSelected.setBounds(265, 435, 150, 25);
        btnRemoveAll.setBounds(240, 470, 200, 25);

        add(lbEnterItem);
        add(txtEnterItem);
        add(btnAddToStock);

        add(lbItemInStock);
        add(lbSelectedItems);
        
        add(StockList);
        add(SelectedList);
        
        add(btnSelectItem);
        add(btnRemoveSelected);
        add(btnRemoveAll);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnAddToStock)
        {
            if(!txtEnterItem.getText().equals(""))
            {
                StockList.add(txtEnterItem.getText());
                txtEnterItem.setText("");
                txtEnterItem.requestFocus();
                btnAddToStock.setBackground(Color.CYAN);
                StockList.setBackground(Color.CYAN);
                timeDelay();
                btnAddToStock.setBackground(null);
                StockList.setBackground(null);
            }
        }
        else if(ae.getSource()==btnSelectItem)
        {
            if(StockList.getSelectedIndex()!=-1)
            {
                SelectedList.add(StockList.getSelectedItem().toString());
                btnSelectItem.setBackground(Color.CYAN);
                StockList.setBackground(Color.CYAN);
                SelectedList.setBackground(Color.CYAN);
                timeDelay();
                btnSelectItem.setBackground(null);
                StockList.setBackground(null);
                SelectedList.setBackground(null);
            }
        }
        else if(ae.getSource()==btnRemoveSelected)
        {
            if(SelectedList.getSelectedIndex()!=-1)
            {
                SelectedList.remove(SelectedList.getSelectedIndex());
                btnRemoveSelected.setBackground(Color.CYAN);
                SelectedList.setBackground(Color.CYAN);
                timeDelay();
                btnRemoveSelected.setBackground(null);
                SelectedList.setBackground(null);
            }
        }
        else if(ae.getSource()==btnRemoveAll)
        {
            SelectedList.removeAll();
            btnRemoveAll.setBackground(Color.CYAN);
            SelectedList.setBackground(Color.CYAN);
            timeDelay();
            btnRemoveAll.setBackground(null);
            SelectedList.setBackground(null);
        }
    }
    public void timeDelay()
    {
        try
        {
            Thread.sleep(250);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
// <applet code="Stock.java" width=550 height=500> </applet>