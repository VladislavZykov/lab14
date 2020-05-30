import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab14 extends Frame implements ActionListener {
    TextField textField1,textField2, textField3;
    Button but1,but2;
    public lab14(){
        setLayout(null);
        JLabel label1 = new JLabel("a");
        label1.setLocation(130,50);
        label1.setSize(20,20);
        textField1 = new TextField();
        textField1.setLocation(150,50);
        textField1.setSize(50,25);

        JLabel label2 = new JLabel("b");
        label2.setLocation(130,80);
        label2.setSize(20,20);
        textField2 = new TextField();
        textField2.setLocation(150,80);
        textField2.setSize(50,25);

        JLabel label3 = new JLabel("sum");
        label3.setLocation(120,110);
        label3.setSize(30,35);
        textField3 = new TextField();
        textField3.setLocation(150,110);
        textField3.setSize(50,25);

        but1 = new Button("calculate");
        but1.setSize(100,20);
        but1.setLocation(150,250);
        but1.addActionListener(this);

        but2 = new Button("clear");
        but2.setSize(100,20);
        but2.setLocation(150,300);
        but2.addActionListener(this);
        add(but1);
        add(but2);
        add(label1);
        add(label2);
        add(label3);
        add(textField1);
        add(textField2);
        add(textField3);
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("calculate")){
            try{
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                int sum = a +b;
                textField3.setText(String.valueOf(sum));
            }
            catch (NumberFormatException nf){
                textField1.setText("");
                textField2.setText("");
                textField3.setText("Error");
            }
        }
        else{
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }
    }
    public static void main(String[] args){
        new lab14();
    }
}
