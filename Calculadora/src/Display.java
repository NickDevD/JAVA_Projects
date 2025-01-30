import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Display {

    JFrame frame;
    JButton button1;
    JTextField textField1;

    public Display(){
        frame = new JFrame();
        frame.setSize(300,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        button1 = new JButton();
        button1.setBounds(30,50,50,30);
        frame.add(button1);

        textField1 = new JTextField();

        frame.setVisible(true);

        button1.addActionListener(this::getButton1);

    }

    private void getButton1(ActionEvent actionEvent) {

    }


    public void calcular(ActionEvent actionEvent){
        int dois = getButton1();
        System.out.println(dois);

    }
}
