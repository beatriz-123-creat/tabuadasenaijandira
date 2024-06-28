package br.senai.jandira.model.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaTabuada {

    private JPanel painelTitulo = new JPanel();
    private JLabel labelTitulo = new JLabel("Vamos usar a tabuada!");

    private JLabel lblMinimo = new JLabel("Mínimo multiplicador:");
    private JTextField txtMinimo = new JTextField();

    private JLabel lblMaximo = new JLabel("Máximo multiplcador:");
    private JTextField txtMaximo = new JTextField();

    private JLabel lblResultado = new JLabel("Resultado:");
    private JTextField txtResultado = new JTextField();

    private JLabel lblStatusTabuada = new JLabel();

    private JButton btnCalcular = new JButton("Calcular");
    private JButton btnLimpar = new JButton("Limpar");

    int minimo = 0;
    int maximo = 0;
    int resultado = 0;
    int multiplicador = 0;


    public TelaTabuada() {
        criarTela();
    }

    public void criarTela() {
        //CONSTRUINDO A TELA DO PROGRAMA//
        JFrame tela = new JFrame();
        tela.setTitle("TABUADA");
        tela.setSize(500, 300);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        painelTitulo.setBounds(0, 0, 500, 50);
        painelTitulo.setBackground(Color.PINK);
        painelTitulo.setLayout(null);

        labelTitulo.setBounds(10, 10, 200, 30);
        painelTitulo.add(labelTitulo);

        //COMPONENTE DE TELA: MINIMO MULTIPLICADOR//

        lblMinimo.setBounds(10, 70, 180, 30);
        txtMinimo.setBounds(12, 100, 150, 35);
        txtMinimo.setFont(new Font("ᴠᴇʀꜱᴀʟᴇᴛᴇ", Font.ITALIC, 24));

        //COMPONENTE DE TELA: MÁXIMO MULTIPLICADOR//

        lblMaximo.setBounds(12, 127, 180, 30);
        txtMaximo.setBounds(12, 150, 150, 35);
        txtMaximo.setFont(new Font("ᴠᴇʀꜱᴀʟᴇᴛᴇ", Font.ITALIC, 24));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 127, 180, 30);
        txtMaximo.setFont(new Font("ᴠᴇʀꜱᴀʟᴇᴛᴇ", Font.ITALIC, 24));

        //COMPONENTE DE TELA: RESULTADO//

        lblResultado.setBounds(225, 70, 250, 30);
        lblResultado.setForeground(Color.GRAY);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 24));
        lblResultado.setHorizontalAlignment(JLabel.CENTER);


        txtResultado.setForeground(Color.GRAY);
        txtResultado.setFont(new Font("Arial", Font.BOLD, 24));
        txtResultado.setHorizontalAlignment(JLabel.CENTER);

        lblStatusTabuada.setBounds(225, 70, 250, 30);
        lblStatusTabuada.setFont(new Font("Arial", Font.BOLD, 24));
        lblStatusTabuada.setForeground(Color.CYAN);
        lblStatusTabuada.setHorizontalAlignment(JLabel.CENTER);

        //COMPONENTE DE TELA: BOTÃO CALCULAR//

        btnCalcular.setBounds(10, 220, 130, 20);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTabuada();
            }
        });

        //COMPONENTE DE TELA: BOTÃO LIMPAR//
        btnLimpar.setBounds(10, 250, 130, 20);
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });

        //MOSTRAR NA TELA
        tela.getContentPane().add(painelTitulo);

        tela.getContentPane().add(lblMinimo);
        tela.getContentPane().add(txtMinimo);

        tela.getContentPane().add(lblMaximo);
        tela.getContentPane().add(txtMaximo);

        tela.getContentPane().add(lblResultado);
        tela.getContentPane().add(txtResultado);

        tela.getContentPane().add(lblStatusTabuada);

        tela.getContentPane().add(btnCalcular);

        tela.getContentPane().add(btnLimpar);

        tela.setVisible(true);

    }

    private void limparTela() {
        txtMinimo.setText("");
        txtMaximo.setText("");
        lblResultado.setText("");
        lblStatusTabuada.setText("");
        txtMinimo.requestFocus();
    }

    private void calcularTabuada() {


        if (validarDados()) {

            Model resultado = new Model();

            resultado.setMinimo(minimo);
            resultado.setMaximo(maximo);


            String resultTabuada = String.valueOf(resultado.getResultado());

            lblResultado.setText(minimo + "x" + maximo + " = " + resultado.getResultado());

        }

    }

    private boolean validarDados() {
        try {
            minimo = Integer.parseInt(txtMinimo.getText().trim());
        } catch (NumberFormatException erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(
                    null,
                    "Digite somente números, valor inválido",
                    "Valor Inváido",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        try{
            maximo = Integer.parseInt(txtMaximo.getText().trim());

        }catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Digite somente números, valor inválido",
                    "Valor Inváido",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }

}