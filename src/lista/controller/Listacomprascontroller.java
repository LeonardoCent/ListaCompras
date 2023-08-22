/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.controller;
import lista.model.Listacomprasmodel;
import java.util.ArrayList;

/**
 *
 * @author 182210126
 */
public class Listacomprascontroller {
   
    public  Listacomprasmodel adicionaCompra(String produto, int unidade){
       
       Listacomprasmodel lista = new Listacomprasmodel(produto, unidade);
       return lista.adicionaCompra();
        }
    }

