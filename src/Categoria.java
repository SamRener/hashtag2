/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class Categoria {
    
    public int idCategoria;
    private String nome;
    private Jogo[] jogo;
 
    
    
    
    public Categoria(){
    
   }
    
    public Categoria( String nome){
     
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdCategoria(){
        return idCategoria;
    }
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    
    public void setIdCategoria(int idCategoria){
        this.idCategoria = idCategoria;
    }
    
    
}
