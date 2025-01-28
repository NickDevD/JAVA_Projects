import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField display;
    private String operador;
    private double num1, num2;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do display
        display = new JTextField(20);
        display.setEditable(false);

        // Painel para os botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Criação dos botões (exemplo)
        String[] botoes = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for (String s : botoes) {
            JButton button = new JButton(s);
            button.addActionListener(this);
            panel.add(button);
        }

        // Adiciona os componentes à janela
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (Character.isDigit(comando.charAt(0)) || comando.equals(".")) {
            display.setText(display.getText() + comando);
        } else {
            // Lógica para operadores, igual, limpar, etc.
            switch (comando) {
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    double resultado = calcular(num1, num2, operador);
                    display.setText(String.valueOf(resultado));
                    break;
                // ... outros casos
            }
        }
    }

    private double calcular(double num1, double num2, String operador) {
        // Implementação das operações matemáticas
        switch (operador) {
            case "+":
                return num1 + num2;
            // ... outros casos
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}