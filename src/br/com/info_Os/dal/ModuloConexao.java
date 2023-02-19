/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.info_Os.dal;

import java.sql.*;

/**
 *
 * @author ivams
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector () {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando informaçoes referente ao banco
        String url="jdbc:mysql://localhost:3306/dbinfo_Os?characterEncoding=utf-8";
        String user = "dba";
        String password = "Ma313205@";
        // estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer o erro
           // System.out.println(e);
            return null;
        }
    }

    public static Connection conectar() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
