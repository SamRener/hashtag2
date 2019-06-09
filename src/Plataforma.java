/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class Plataforma {
    
    private int idPlataforma;
    private String tipo;
    private Categoria[] categoria;
    
    public Plataforma(){
        
    }
    
    public Plataforma( String tipo){
       
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public int getIdPlataforma(){
        return idPlataforma;
    }
        
    
}
