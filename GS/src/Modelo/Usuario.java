/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Tec
 */
public class Usuario extends Funcionario{

    @Override
    public int getCod() {
        return super.getCod();
    }
    String usuario;
    int senha;

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
