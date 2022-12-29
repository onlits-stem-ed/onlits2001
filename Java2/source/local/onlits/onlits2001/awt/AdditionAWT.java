package local.onlits.onlits2001.awt;

import javax.swing.*;
import java.awt.event.*;

public class AdditionAWT implements ActionListener{
    JFrame frame;
    JButton btnAdd;
    AdditionAWT()
    {
        frame = new JFrame("Addition App");     //Composition
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(null);
        btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 50, 100, 50);
        btnAdd.addActionListener(this);
        frame.add(btnAdd);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        if(e.getSource()==btnAdd){
            btnAdd.setBounds(50, 30, 300, 50);
        }
    }
    public static void main(String[] args) {
        new AdditionAWT();
    }    
}