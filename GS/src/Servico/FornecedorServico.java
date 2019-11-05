package Servico;

import DAO.FornecedorDAO;
import Modelo.Fornecedor;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tec
 */
public class FornecedorServico {
    
    public static final int OPERACAO_REALIZADA_COM_SUCESSO = 0;
    public static final int OPERACAO_FALHOU = 1;

    public static int guardar(Fornecedor reg) {
        int resultadoOperacao, codigo;
        FornecedorDAO registoDao = new FornecedorDAO();
        try {
            //Gerar codigo            
            if (registoDao.lista().isEmpty()) {
                codigo = 690;
            } else {
                codigo = GeradorDeCodigoServico.gerarCodigo(registoDao.pegaUltimoCodigo());
            }
            reg.setCodigo(codigo);
            registoDao.add(reg);
            resultadoOperacao = OPERACAO_REALIZADA_COM_SUCESSO;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            resultadoOperacao = OPERACAO_FALHOU;
        }
        return resultadoOperacao;

    }

    public static Fornecedor buscarPorID(int id) {
        Fornecedor reg = null;
        FornecedorDAO registoDAO = new FornecedorDAO();
        try {
            reg = registoDAO.buscaByCodigo(id);
        } catch (Exception ex) {

        }
        return reg;
    }



    public static LinkedList buscarTods() {
        LinkedList list = null;
        FornecedorDAO registoDAO = new FornecedorDAO();
        try {
            list = registoDAO.lista();
        } catch (Exception ex) {

        }
        return list;
    }

    public static Fornecedor actualizar(int id) {
        return buscarPorID(id);
    }

  
    
  

    
}
