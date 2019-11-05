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
public class Material {
    private int cod_material;
    private String descricao;
 

    public Material(int cod_material, String descricao) {
        this.cod_material = cod_material;
        this.descricao = descricao;
        
    }


    public Material() {
       
    }

    public void setCod_material(int cod_material) {
        this.cod_material = cod_material;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getCod_material() {
        return cod_material;
    }

    public String getDescricao() {
        return descricao;
    }

    
}
