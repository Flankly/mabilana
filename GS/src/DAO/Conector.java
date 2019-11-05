/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tec
 */
public class Conector {
    
  private final static String url = "jdbc:mysql://localhost:3308/sgs";
  private final static String driver ="com.mysql.jdbc.Driver";
  private final static String usuario = "root";
  private final static String senha ="1234";
  Connection con;
  
  public Connection conectar(){
  try {
            System.setProperty("jdbc.driver", driver);
            con = (Connection) DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null,"Conectado com Sucesso!!");
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Algo deu errado "+ex);
        }
  return con;
  }
  
  
}
