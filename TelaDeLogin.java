import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeLogin extends JFrame {
   private final JLabel lblLogin;
   private final JTextField txtLogin;
   private final JLabel lblSenha;
   private final JPasswordField txtSenha;
   private final JButton btnLogar;
   private final JLabel lblNoticacoes;


    public TelaDeLogin(){
        super("Tela de Login");
        setLayout(new FlowLayout());
        lblLogin = new JLabel ("Login"); // Atribuição das váriaveis onde devem receber o novo Objeto que deve ser ou ter o mesmo nome do TIPO
        add(lblLogin);

        txtLogin = new JTextField("Insira seu Login",15);
        add(txtLogin);

        lblSenha = new JLabel("Senha");
        add(lblSenha);

        txtSenha = new JPasswordField(15);
        add(txtSenha);

        btnLogar = new JButton("Logar");
        btnLogar.setPreferredSize(new Dimension(200,25));
        add(btnLogar);

        lblNoticacoes = new JLabel ("Notificações");
        add(lblNoticacoes);
        
        ButtonHandler buttonHandler = new ButtonHandler (); 
        btnLogar.addActionListener(buttonHandler);

        txtSenha.addKeyListener(
           new KeyListener() {
           @Override
           public void keyReleased(KeyEvent e) {
                If (String.valueOf(txtSenha.getPassowrd().trim().length()>0){ 
                 
               If (e.getKeyCode()=10)); 
               logar();
           
            }
        }
    }
  );
};

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent event){
         logar();  
        }   
    }
    
    public void logar () { 
        try{
        Connection conexao = MySQLConnector.conectar();
         //Concatenação é quando junta 2 texto, nesse caso estamos utilizando a linha de código do sql para selecionar a tabela do banco de dados que ira pegar o que o usario digitar
         // e verificar no banco de dados getText e getPassword, lembrar de usar " ` " e cuidar com o espaçamento
        String strSqlLogin = "select * from `db_senac`.`tbl_senac` where email = '" + txtLogin.getText() + "' and senha = '" + String.valueOf(txtSenha.getPassword()) + "';";
        //Declaração
        Statement stmSqlLogin = conexao.createStatement (); // para utilizar este método deve estar dentro do Try
        ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
        if (rstSqlLogin.next()){
            //Aqui vamos notificar o usuario que o login e senha foi encontrada
            lblNoticacoes.setText("Login realizado com sucesso");
                            } else {
            //Aqui vamos notificar o usuario que o login e senha não foi encontrada
            lblNoticacoes.setText("Não foi possível encontrar o login e/ou senha digitado. Por favor, verifique e tente novamente");
        }    
      
    } catch (Exception e) {
        lblNoticacoes.setText("Houve um problema e não será possível realizar o login neste momento. Por favor, tente novamente mais tarde");
        System.err.println("Ops! Deu ruim, se liga no erro" + e); 
    }       
}
public String setHtmlFormat (String txt) {
    return "<html><body>" + txt + "<body></html>";

}

public void notificarUsuario(String strTexto) {
    lblNoticacoes.setText(setHtmlFormat(strTexto));
}

    public static void main (String[]args){
        TelaDeLogin appTelaDeLogin = new TelaDeLogin();
        appTelaDeLogin.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeLogin.setSize (260,150);
        appTelaDeLogin.setVisible(true);
    
    };
};




