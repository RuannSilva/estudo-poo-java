package Tela;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;

    public Tela() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        montarTela();
    }

    private void montarTela() {
        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8, 8, 8);

        JLabel rotuloUsuario = new JLabel("Usuário:");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.EAST;
        painel.add(rotuloUsuario, c);

        campoUsuario = new JTextField(15);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        painel.add(campoUsuario, c);

        JLabel rotuloSenha = new JLabel("Senha:");
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.EAST;
        painel.add(rotuloSenha, c);

        campoSenha = new JPasswordField(15);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.WEST;
        painel.add(campoSenha, c);

        botaoEntrar = new JButton("Entrar");
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.EAST;
        painel.add(botaoEntrar, c);

        botaoEntrar.addActionListener(e -> autenticar());

        add(painel);
    }

    private void autenticar() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        System.out.println("Usuário: " + usuario);
        System.out.println("Senha: " + senha);
    }

    public static void main(String[] args) {
        new Tela().setVisible(true);
    }
}
