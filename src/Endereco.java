/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *'
 * @author thiag
 */
public class Endereco {
    
     private int idEndereco,numero,cep;
    private String rua, bairro, complemento;
    private Usuario usuario;
    
    public Endereco(){
        
    }
    
     public Endereco( String rua, int numero , String bairro, int cep,  String complemento){        
         this.bairro = bairro;
         this.cep = cep;
         this.rua = rua;
         this.numero = numero;
         this.complemento= complemento;
        
    }

    public int getIdEndereco() {
        return idEndereco;
    }

  
   
    
    public int getNumero() {
        return numero;
    }

   
    public void setNumero(int numero) {
        this.numero = numero;
    }

  
    public int getCep() {
        return cep;
    }

   
    public void setCep(int cep) {
        this.cep = cep;
    }

   
    public String getRua() {
        return rua;
    }

   
    public void setRua(String rua) {
        this.rua = rua;
    }

   
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   
    public String getComplemento() {
        return complemento;
    }

    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
     
    
  
}
