/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.model;
import java.util.ArrayList;
/**
 *
 * @author 182210126
 */
public class Listacomprasmodel {
    private String produto;
    private int unidade;

    public Listacomprasmodel(String produto, int unidade) {
        this.produto = produto;
        this.unidade = unidade;
    }

    public Listacomprasmodel() {
        
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public Listacomprasmodel adicionaCompra(){
     Listacomprasmodel lista = new Listacomprasmodel(getProduto(),getUnidade());
    // Listacomprasmodel alLista = new ArrayList<>();
     
     return lista;}
    
        
    }

