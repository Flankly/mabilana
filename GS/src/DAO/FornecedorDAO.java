/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Fornecedor;
import java.util.LinkedList;

/**
 *
 * @author Tec
 */
public class FornecedorDAO {
     private static LinkedList baseDado = new  LinkedList();

    public  LinkedList lista() {
        return baseDado;
    }
      public int pegaUltimoCodigo() {
        Fornecedor ultimoUtente = (Fornecedor) baseDado.get(baseDado.size()- 1);
        return ultimoUtente.getCodigo();
    }

    public void add (Fornecedor fornecedor){
        baseDado.addLast(fornecedor);
    }

    public Fornecedor buscaByCodigo (int codigo){
     Fornecedor fornecedor = null;
     for (int i = 0; i < baseDado.size(); i++) {
            Fornecedor regist = (Fornecedor) baseDado.get(i);
            if (regist.getCodigo() == codigo) {
               fornecedor = regist;
            }
        }
        return fornecedor;
    }
    


}
