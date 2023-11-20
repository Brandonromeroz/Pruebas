package Brandon.zavala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel Panelvenanaprincipal;
    private JButton btn4;
    private JButton btn8;
    private JButton btn5;
    private JButton btn9;
    private JButton btn6;
    private JButton btn2;
    private JButton btn3;
    private JButton btn1;
    private JButton btnN0;
    private JButton btn7;
    private JLabel lbResultado;
    private JLabel lboperacion;

    public VentanaPrincipal() {
        setContentPane(Panelvenanaprincipal);
        setVisible(true);
      setSize(480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnN0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btnN0.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn1.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn2.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn3.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn4.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn5.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn6.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn7.getText();
                lbResultado.setText(numeroBoton);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton = btn8.getText();
                lbResultado.setText(numeroBoton);
            }

        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton =btn9.getText();
                lbResultado.setText(numeroBoton);
            }
        });
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
