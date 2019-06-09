/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class Post {
    
       private int idPost, like,deslike;
       private String postagem,descricao;
       private Usuario usuario;
    
    
    
     public Post(){
        
    }
    
    public Post( int like, int deslike, String postagem, String descricao ){
      
        this.like = like;
        this.deslike = deslike;
        this.postagem = postagem;
        this.descricao = descricao;
        
    }

   
    public int getIdPost() {
        return idPost;
    }

 
    
    public int getLike() {
        return like;
    }

   
   

  
    public int getDeslike() {
        return deslike;
    }

   
   
    public String getPostagem() {
        return postagem;
    }

    
    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

   
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
 
    
   
    
}
