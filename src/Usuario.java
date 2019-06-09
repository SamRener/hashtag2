
public class Usuario{
    
    private int idUsuario;
    private String nome, email, nickName, senha, dtNasc;
      private char sexo;
      private Post[] post;
      private Endereco endereco; 
      
     public Usuario(){
         
     } 
     
       public Usuario( String nome, String email, String nickName, String senha, String dtNasc, char sexo){
           
           this.nome = nome;
           this.email = email;
           this.nickName = nickName;
           this.senha = senha;
           this.dtNasc = dtNasc;
           this.sexo = sexo;
         
     } 

   
    public int getIdUsuario() {
        return idUsuario;
    }


  
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getNickName() {
        return nickName;
    }


   
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getDtNasc() {
        return dtNasc;
    }

   
    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    
    public char getSexo() {
        return sexo;
    }

   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
     
       
}