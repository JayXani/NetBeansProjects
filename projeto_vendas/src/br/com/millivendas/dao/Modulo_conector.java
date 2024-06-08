
package br.com.millivendas.dao;
import java.sql.*;

public final class Modulo_conector {
    //Criação do método com o framework Connection
    
    public static Connection conector(){
        //Variavel conexao
        Connection conexao = null;
        
        //Chamada do Driver
        String Driver = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/management_sales";
        String User = "root";
        String Password = "";
        
        //Estabelecendo a conexão e tratando as excessões
        try {
            Class.forName(Driver);  //Executa o arquivo do Driver
            conexao = DriverManager.getConnection(URL,User,Password);
            return conexao;
            
        } catch (Exception e) {
            
            //System.out.println(e); teste de conexão
            return null;
        }
    }
}
