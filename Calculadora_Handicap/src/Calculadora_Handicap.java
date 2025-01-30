import javax.swing.*;
import java.awt.*;
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

        JButton button1 = new JButton("Calcular");
        button1.setBounds(30,30,90,30);
        add(button1);

        JLabel label1 = new JLabel("Casa");
        label1.setBounds(10,100,150,50);
        add(label1);

        JLabel label2 = new JLabel("Fora");
        label2.setBounds(10,150,150,50);
        add(label2);

        JLabel label3 = new JLabel("Handicap");
        label3.setBounds(1,200,150,50);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(60,100,150,50);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(60,150,150,50);
        add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(60,200,150,50);
        add(textField3);


        setVisible(true);

        button1.addActionListener(this::resultado);

    }

    public void resultado(ActionEvent actionEvent){

        int casa = Integer.parseInt(textField1.getText());
        int fora = Integer.parseInt(textField2.getText());
        double handicap = Double.parseDouble(textField3.getText());

        casa += (int) handicap;

        if (casa > fora){
            JOptionPane.showMessageDialog(null, "Resultado: Venceu" , "titula", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Resultado: Perdeu" , "titula", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public static void main(String[] args) {
        new Calculadora_Handicap();
    }
}
