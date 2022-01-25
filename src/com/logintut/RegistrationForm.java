package com.logintut;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    JLabel label1, label2,label3,label4,label5,msg;
    JTextField t1,t2;
    JRadioButton Male , Female;
    JComboBox day,month,year;
    JTextArea ta1;
    JTextArea result;
//    JCheckBox terms;
    JButton submit;
    Myframe(){
        setTitle("Registration form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("name");
        label1.setBounds(20,50,100,20);
        c.add(label1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);


        label2 = new JLabel("mobile");
        label2.setBounds(20,100,100,20);
        c.add(label2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);
        Male = new JRadioButton("Male");
        Male.setBounds(130,150,80,20);
        Female = new JRadioButton("Female");
        Female.setBounds(210,150,80,20);
        c.add(Male);
        c.add(Female);
        ButtonGroup gender = new ButtonGroup();
        gender.add(Male);
        gender.add(Female);


        label4 = new JLabel("DOB");
        label4.setBounds(20,200,100,20);
        c.add(label4);
        String months [] = {"","jan" , "feb" , "march" ,"april" , "may" , "june" , "july" ,"aug" ,"sept" ,"oct" ,"nov" ,"dec"};
        String years [] = {"","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
        String days[] = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);
        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);
        c.add(day);
        c.add(month);
        c.add(year);


        label5 = new JLabel("Address");
        label5.setBounds(20,250,100,20);
        c.add(label5);
        ta1 = new JTextArea();
        ta1.setBounds(130,240,200,50);
        c.add(ta1);

        submit = new JButton("Submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);

        submit.addActionListener(this);

        result = new JTextArea();
        result.setBounds(350,50,300,300);
        c.add(result);

        msg = new JLabel("");
        msg.setBounds(20,400,250,20);
        c.add(msg);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String name = t1.getText();
        String mobile = t2.getText();
        String genders = ((Female.isSelected()) ? (genders="female") : (genders="male"));
        String birth = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem();
        String address = ta1.getText();

        if(name.isEmpty() || name.isBlank()){
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter Your Name");
        }else if(mobile.isBlank() || mobile.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter Your Number");
        }else if(genders == null){
            JOptionPane.showMessageDialog(new JFrame(), "Please Select your Gender");
        }else if(birth == null){
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter your birth date");
        }else if(address.isEmpty() || address.isBlank()){
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter your Address");
        }else{
            result.setText("name:" + name + "\n" + "mobile Num:" + mobile + "\n" + "gender:" + genders + "\n" + "DOB:" + birth + "\n" + "Address:" + address);
        }


    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        Myframe frame = new Myframe();
    }
}
