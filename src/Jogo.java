/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class Jogo {
    
    private int idJogo;
    private String nome, descricao;
    private Categoria[] categoria;
    
    public Jogo(){
        
    }
    public Jogo( String nome , String descricao){
        this.descricao = descricao;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String Getdescricao(){
        return descricao;
    }
    
    public int getIdJogo(){
        return idJogo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    
    
    
    
    
}
