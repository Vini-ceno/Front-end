import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeCadastro extends JFrame {
    public final JLabel lblNome;
    public final JTextField txtNome;
    public final JLabel lblEmail;
    public final JTextField txtEmail;
    public final JLabel lblSenha;
    public final JPasswordField txtSenha;
    public final JButton btnCadastrar;
    public final JButton btnCancelar;
    public final JLabel lblNotificacoes;

    public TelaDeCadastro() {
        super("Tela de Cadastro");
        setLayout(new GridLayout(5, 1, 5, 5)); // linhas, colunas, espaçamento horaziontal, espaçamento vertica

        JPanel linhaNome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome", SwingConstants.RIGHT); // alinhamento do nome a direita
        txtNome = new JTextField(10);

        linhaNome.add(lblNome);
        linhaNome.add(txtNome);

        add(linhaNome);

        JPanel linhaEmail = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email", SwingConstants.RIGHT);
        txtEmail = new JTextField(10);

        linhaEmail.add(lblEmail);
        linhaEmail.add(txtEmail);

        add(linhaEmail);

        JPanel linhaPassword = new JPanel(new GridLayout(1, 2));

        lblSenha = new JLabel("Senha", SwingConstants.RIGHT);
        txtSenha = new JPasswordField(10);

        linhaPassword.add(lblSenha);
        linhaPassword.add(txtSenha);

        add(linhaPassword);

        JPanel linhaButton = new JPanel(new GridLayout(1, 2));

        btnCadastrar = new JButton("Cadastrar");
        btnCancelar = new JButton("Cancelar");

        linhaButton.add(btnCadastrar);
        linhaButton.add(btnCancelar);

        add(linhaButton);

        JPanel linhaNotif = new JPanel(new GridLayout(1, 1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);

        linhaNotif.add(lblNotificacoes);

        add(linhaNotif);

        
        btnCadastrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {

                        if (txtNome.getText().trim().length() == 0) {
                            lblNotificacoes.setText(
                                    "é necessario digitar alguma coisa no campo, Ditige um caracter válido no campo nome para prosseguir");
                            txtNome.requestFocus();
                            return;
                        }
                        if (txtEmail.getText().trim().length() == 0) {
                            lblNotificacoes.setText(
                                    "é necessario digitar alguma coisa no campo, Ditige um caracter válido no campo Email para prosseguir");
                            txtEmail.requestFocus();
                            return;
                        }
                        if (String.valueOf(txtSenha.getPassword()).trim().length() == 0) {
                            lblNotificacoes.setText(
                                    "é necessario digitar alguma coisa no campo, Ditige um caracter válido no campo Senha para prosseguir");
                            txtSenha.requestFocus();
                            return;
                        }

                       String strSqlCadastrar = "insert into `db_senac`.`tbl_senac` (`nome`, `email`, `senha`) values ('" + txtNome.getText() + "','" + txtEmail.getText() + "','" + String.valueOf(txtSenha.getPassword()) + "');";
                    try {
                        Connection conexao = MySQLConnector.conectar();
                        Statement stmSqlCadastrar = conexao.createStatement();
                        stmSqlCadastrar.addBatch(strSqlCadastrar);
                        stmSqlCadastrar.executeBatch();
                        lblNotificacoes.setText("Cadastro realizado com sucesso!");
                    } catch (Exception e) {
                        lblNotificacoes.setText("Ops! Ocorrou um problema e não será possível cadastrar nesse momento. Por favor, tente novamente mais tarde.");
                        System.err.println("Erro: " + e);
                        }
                    }
                }
            );

    }

    public static void main(String[] args) {
        TelaDeCadastro appTelaDeCadastro = new TelaDeCadastro();
        appTelaDeCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeCadastro.setSize(280, 300);
        appTelaDeCadastro.setVisible(true);

    }
}
