package controlefuncionario;
import java.util.*;

//classe Fake, pois ainda não sabemos acessar o banco de dados

class DAO {
    private ArrayList<Departamento> arrayDpto;
    
    public DAO(){
        arrayDpto = new ArrayList();
        
        arrayDpto.add(new Departamento(1, "Financeiro"));
        arrayDpto.add(new Departamento(2, "Comercial"));
        arrayDpto.add(new Departamento(3, "Recursos Humanos"));
        arrayDpto.add(new Departamento(4, "Projetos"));
    }
    
    public static boolean autenticar(String login, String senha){
        return true;
    }
    public ArrayList<Departamento> getDepartamento(){
        return arrayDpto;
    }
    
    
    public Departamento getDepartamento(int codigoDepartamento){
        Departamento d = null;
        for(int i = 0; i < arrayDpto.size(); i++){
            if(codigoDepartamento == arrayDpto.get(i).getCodigo()){
                d = arrayDpto.get(i);
                i = arrayDpto.size();
            }
            
        }
        return d;
    }
    
    
    public boolean inserirDepartamento(Departamento d){
        boolean resp = true;
        if(getDepartamento(d.getCodigo()) == null){
            arrayDpto.add(d);
        } else {
            resp = false;
        }
        return resp;        
    }
        
    
    public boolean excluirDepartamento(int codigoDepartamento){
        boolean resp = false;
        for(int i = 0; i < arrayDpto.size(); i++){
            if(codigoDepartamento == arrayDpto.get(i).getCodigo()){
                arrayDpto.remove(i);
                i = arrayDpto.size();
                resp = true;
            }
            
        }
        return resp;        
    }
    
    
    public boolean atualizarDepartamento(Departamento d){
        boolean resp = false;
        for(int i = 0; i < arrayDpto.size(); i++){
            if(d.getCodigo() == arrayDpto.get(i).getCodigo()){
                arrayDpto.set(i, d);
                i = arrayDpto.size();
                resp = true;
            }
            
        }        
        return resp; 
    }
}
