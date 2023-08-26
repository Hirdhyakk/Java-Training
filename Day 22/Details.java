import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Details extends Applet implements ItemListener
{
    Label lbDetails, lbName, lbDOB, lbGender, lbCorrAddress, lbPermAddress, lbHobbies;
    TextField txtName, txtDay;
    Choice chYear, chMonth, chDay;
    TextArea taCorrAddress, taPermAddress;
    CheckboxGroup cbg;
    Checkbox cbMale, cbFemale, cbOther, cbSinging, cbDancing, cbCoding, cbPlaying, cbAddress;

    public void init()
    {
        setLayout(null);

        lbDetails = new Label("Details : ");
        
        lbName = new Label("Name : ");
        txtName = new TextField();

        lbDOB = new Label("Date of Birth : ");
        
        chYear = new Choice();
        chYear.add("Year");
        for(int i=1950; i<=2023; i++)
        {
            chYear.add(i+"");
        }

        chMonth = new Choice();
        chMonth.add("Month");
        chMonth.add("January");
        chMonth.add("February");
        chMonth.add("March");
        chMonth.add("April");
        chMonth.add("May");
        chMonth.add("June");
        chMonth.add("July");
        chMonth.add("August");
        chMonth.add("September");
        chMonth.add("October");
        chMonth.add("November");
        chMonth.add("December");
        chMonth.setEnabled(false);
        
        chDay = new Choice();
        chDay.add("Day");
        chDay.setEnabled(false);

        txtDay = new TextField("Day of the Week");
        txtDay.setEnabled(false);

        lbGender = new Label("Gender : ");
        cbg = new CheckboxGroup();
        cbMale = new Checkbox("Male", cbg, false);
        cbFemale = new Checkbox("Female", cbg, false);
        cbOther = new Checkbox("Others", cbg, false);

        lbCorrAddress = new Label("Corresponding Address : ");
        taCorrAddress = new TextArea();

        cbAddress = new Checkbox("Select if Corresponding and Permanenet Address are Same.");

        lbPermAddress = new Label("Permanent Address : ");
        taPermAddress = new TextArea();

        lbHobbies = new Label("Hobbies : ");
        cbSinging = new Checkbox("Singing");
        cbDancing = new Checkbox("Dancing");
        cbCoding = new Checkbox("Coding");
        cbPlaying = new Checkbox("Playing");

        lbDetails.setBounds(200, 50, 100, 30);

        lbName.setBounds(20, 100, 200, 25);
        txtName.setBounds(230, 100, 200, 25);

        lbDOB.setBounds(20, 135, 200, 25);
        chYear.setBounds(230, 135, 60, 25);
        chMonth.setBounds(300, 135, 100, 25);
        chDay.setBounds(410, 135, 50, 25);
        txtDay.setBounds(470, 135, 100, 25);
//        txtAge.setBounds(230, 135, 100, 25);

        lbGender.setBounds(20, 170, 200, 25);
        cbMale.setBounds(230, 170, 50, 25);
        cbFemale.setBounds(290, 170, 50, 25);
        cbOther.setBounds(350, 170, 50, 25);

        lbCorrAddress.setBounds(20, 205, 200, 25);
        taCorrAddress.setBounds(230, 205, 300, 100);

        cbAddress.setBounds(100, 310, 400, 25);

        lbPermAddress.setBounds(20, 340, 200, 25);
        taPermAddress.setBounds(230, 340, 300, 100);

        lbHobbies.setBounds(20, 455, 100, 25);
        cbSinging.setBounds(230, 455, 100, 25);
        cbDancing.setBounds(340, 455, 100, 25);
        cbCoding.setBounds(230, 485, 100, 25);
        cbPlaying.setBounds(340, 485, 100, 25);

        add(lbDetails);
        add(lbName);
        add(txtName);
        add(lbDOB);
        add(chYear);
        add(chMonth);
        add(chDay);
        add(txtDay);
//        add(txtAge);
        add(lbGender);
        add(cbMale);
        add(cbFemale);
        add(cbOther);
        add(lbCorrAddress);
        add(taCorrAddress);
        add(cbAddress);
        add(lbPermAddress);
        add(taPermAddress);
        add(lbHobbies);
        add(cbSinging);
        add(cbDancing);
        add(cbCoding);
        add(cbPlaying);

        chYear.addItemListener(this);
        chMonth.addItemListener(this);
        chDay.addItemListener(this);
        cbMale.addItemListener(this);
        cbFemale.addItemListener(this);
        cbOther.addItemListener(this);
        cbAddress.addItemListener(this);
        cbSinging.addItemListener(this);
        cbDancing.addItemListener(this);
        cbCoding.addItemListener(this);
        cbPlaying.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==chYear)
        {
            if(chYear.getSelectedIndex()>0)
            {
                chMonth.setEnabled(true);
            }
            else
            {
                chMonth.setEnabled(false);
                chDay.setEnabled(false);
                chMonth.select(0);
                chDay.select(0);
            }
        }
        else if(ie.getSource()==chMonth)
        {
            if(chMonth.getSelectedIndex()>0)
            {
                chDay.setEnabled(true);
                chDay.removeAll();
                chDay.add("Day");
                int month = chMonth.getSelectedIndex();
                int day = 0;
                if(month==2)
                {
                    int year = Integer.parseInt(chYear.getSelectedItem());
                    if(year%4==0)
                    {
                        if(year%100==0)
                        {
                            if(year%400==0)
                            {
                                //System.out.print("Leap Year");
                                day = 29;
                            }
                            else
                            {
                                //System.out.print("Not a Leap Year");
                                day = 28;
                            }
                        }
                        else
                        {
                            //System.out.print("Leap Year");
                            day = 29;
                        }
                    }
                    else
                    {
                        //System.out.print("Not a Leap Year");
                        day = 28;
                    }
                }
                else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)            
                {
                    day = 31;
                }
                else
                {
                    day = 30;
                }
                for(int i=1; i<=day; i++)
                {
                    chDay.add(i+"");
                }
            }
            else
            {
                chDay.setEnabled(false);
                chDay.select(0);
            }
        }
        else if(ie.getSource()==chDay)
        {
            
        }
        else if(ie.getSource()==cbAddress)
        {
            if(cbAddress.getState()==true)
            {
                taPermAddress.setText(taCorrAddress.getText());
                taPermAddress.setEnabled(false);
            }
            else
            {
                taPermAddress.setText("");
                taPermAddress.setEnabled(true);
            }
        }
    }
}

// <applet code="Details.class" width=600 height=600> </applet>