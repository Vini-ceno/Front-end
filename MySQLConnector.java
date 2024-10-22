import java.sql.*;


public class MySQLConnector {
    public static Connection conectar() {
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "db_senac";
        String mysqlUser = "root";
        String mysqlPassword = "senac@02";
        String mysqlPort = "3306";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;// URL interna começa com o protocolo, 
        //identificador, e começa adicionar os valores das váriaveis "?" (diferenciação) variavel get= "&" adiciona
        Connection conn = null;
        try{ // Tentativa e erro, consegue coletar qual foi o erro, sem que aja o crash, personalizando a menssagem que ira aparecer
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance(); // Coleta o constutor de clarado e instanciar uma nova instancia para a classe Forname
            conn = DriverManager.getConnection(mysqlUrl); // Coleta a conexão através da URL
             System.out.println("Conexão realizada com sucesso!");

        } catch (Exception e) { // caso aconteceça de algo errado ira aparecer esta msg
            System.err.println("Ops! Algo de errado não esta certo com a coneção com o banco de dados  MySQL! Menssagem do servidor: " + e);
        }
        return conn;
    }   
}
