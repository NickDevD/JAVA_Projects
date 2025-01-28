import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Screen extends JFrame {
    Scanner in = new Scanner(System.in);
    public Screen(){
        setVisible(true);
        setSize(800, 500);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton();
        jButton.setText("2");
        jButton.setBounds(30, 50, 50, 50);
        add(jButton);

        JButton jButton2 = new JButton();
        jButton2.setText("3");
        jButton2.setBounds(30, 100, 50, 50);
        add(jButton2);

        JButton jButton3 = new JButton();
        jButton3.setText("+");
        jButton3.setBounds(30, 150, 50, 50);
        add(jButton3);




        jButton.addActionListener(this::v1);

        jButton2.addActionListener(this::v2);


    }
    int Life = 100;

    public void v1(ActionEvent actionEvent) {
        System.out.println("Vida restante: 98");
    }
    public void v2(ActionEvent actionEvent){
        int v2 = 3;
        System.out.println("3");
    }
    public int a2(int v1, int v2){
        return v1 + v2;
    }

}
