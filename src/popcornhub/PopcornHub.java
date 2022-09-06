/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popcornhub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import popcornhub.Connection_Mysql.ConnectionFactory;

/**
 *
 * @author davip
 */
public class PopcornHub {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Deixar telas visiveis */
        //PopCornHUBLogin login = new PopCornHUBLogin();
        //login.setVisible(true);
        PopCornHUBLogin login = new PopCornHUBLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
    public void Insert_function_OO(Usuario user){
        
        // Conexão com banco
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String query_insert = "INSERT INTO `usuarios`(`username`, `password`) VALUES (?, ?)"; // query para valores que serão obtidos pelo objeto
        
        try {
            stmt = con.prepareStatement(query_insert);
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getPassword());
            /* 
            ... mais dados
            
            */
            // enfim executa o update
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.printf("\nErro ao inserir dados. Detalhes: " + ex.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public static void Insert_function_nonOO(){
        // Conexão com banco
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;  
        String query_insert = "INSERT INTO `nome_tabela`(`campos`) VALUES (`valores`)";

        try {
            stmt = con.prepareStatement(query_insert);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.printf("\nErro ao inserir dados. Detalhes: " + ex.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
