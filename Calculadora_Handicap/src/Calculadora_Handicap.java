import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Handicap extends JFrame {

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    public Calculadora_Handicap(){
        setTitle("Handicap Calculator");
        setSize(300, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton();
        button1.setBounds(30,30,50,30);
        add(button1);

        JButton button2 = new JButton();
        button2.setBounds(30,50,50,30);
        add(button2);

        textField1 = new JTextField();
        textField1.setBounds(50,100,150,50);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(50,150,150,50);
        add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(50,200,150,50);
        add(textField3);

        setVisible(true);

        button1.addActionListener(this::resultado);
        button2.addActionListener(this::somar);

    }
    public void somar(ActionEvent actionEvent){


    }
    public void resultado(ActionEvent actionEvent){

        Integer casa = Integer.parseInt(textField1.getText());
        Integer fora = Integer.parseInt(textField2.getText());
        Integer handicap = Integer.parseInt(textField3.getText());

        casa += handicap;

        if (casa > fora){
            System.out.println("Vence");
        }else {
            System.out.println("perde");
        }
        JOptionPane.showMessageDialog(null, "Resultado: " , "titula", JOptionPane.ERROR_MESSAGE);

    }

    public static void main(String[] args) {
        new Calculadora_Handicap();
    }
}
