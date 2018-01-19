/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public modeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);        
        
        
    }
    // Fazer getters e settlers ==> botÃ£o direito do mouse/ refatorar / Encapsular

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    // Conta nÃºmero de colunas
    public int getColumnCount(){
        return colunas.length;
        
    }
    
    // retorna nÃºmero de linhas 
    public int getRowCount(){
        return linhas.size();
    }
    
    // responsÃ¡vel por pegar o valor do nome da coluna
    public String getColumnName(int numCol){
       return colunas[numCol]; 
        
    }
    
    // MÃ©todo que monta a tabela, adiciona
    public Object getValueAt(int numLin,int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol]; // 8:43
        
    }
    
}

