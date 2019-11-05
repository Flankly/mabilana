/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Material;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;



/**
 *
 * @author Tec
 */
public class MaterialDAO {
    
   
  
 private static final String caminho = "jdbc:mysql://localhost:3308/sgs";
 private static final String driver ="com.mysql.jdbc.Driver";
  private static final String usuario = "root";
   private static final String senha ="1234";
   
   public Connection con = null;
 
 public void conectarBD(){
     try {
         
         System.setProperty("jdbc.driver", driver);
         con = (Connection) DriverManager.getConnection(caminho,usuario,senha);
         JOptionPane.showMessageDialog(null,"Conectado...");
     } catch (SQLException e) {
         
         JOptionPane.showMessageDialog(null,"Erro de Conexão..."+e);
     }   
 }
 
  public void desconectarBD(){
      try {
          con.close();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Erro de Desconexão...");
      }
 } 
   private static LinkedList baseDado = new  LinkedList();

    public  LinkedList lista() {
        return baseDado;
    }
      public int pegaUltimoCodigo() {
        Material material = (Material) baseDado.get(baseDado.size()- 1);
        return material.getCod_material();
    }

    public void add (Material material){
        baseDado.addLast(material);
    }

    public Material buscaByCodigo (int codigo){
     Material material = null;
     for (int i = 0; i < baseDado.size(); i++) {
            Material regist = (Material) baseDado.get(i);
            if (regist.getCod_material()== codigo) {
               material = regist;
            }
        }
        return material;
    }
  
  public ArrayList buscaTodos() {
  
     
        ArrayList list = new ArrayList();
        for (int i = 0; i < baseDado.size(); i++) {
            Material regist = (Material) baseDado.get(i);
            list.lastIndexOf(regist);
        }
        return list;
    }
    
}
    
//      try { 
//      System.setProperty("jdbc.driver", driver);
//      con = (Connection) DriverManager.getConnection(caminho,usuario,senha);
//         
//          PreparedStatement stmt =  con.prepareStatement(sql);
//          ResultSet rs = null;
//          rs=stmt.executeQuery();
//          while(rs.next()){
//              Material m = new Material();
//              m.setCod_material(rs.getString("mat_cod"));
//              m.setDescricao(rs.getString("mat_descricao"));
//              
//              materiais.add(m);
//          }
//          rs.close();
//          stmt.close();
//              
//          
//      } catch (Exception e) {
//          JOptionPane.showConfirmDialog(null, "Erro ao Realizar a consulta"+e);
//      }
//    return materiais;
//  }
//  
//  

    

