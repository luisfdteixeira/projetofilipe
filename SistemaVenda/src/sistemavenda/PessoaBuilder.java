package sistemavenda;

public class PessoaBuilder 
{   private Pessoa pessoa;
    
    
    public PessoaBuilder criaPessoa(){
        pessoa = new Pessoa();
        return this;
    }
    
   public PessoaBuilder chamada(String nome){
        pessoa.setNome(nome);
        return this;
    }
    
    public PessoaBuilder nascidaEm(String dataNacimento){
        pessoa.setDataNascimento(dataNacimento);
        return this;
    }
    
    public PessoaBuilder queMoraEm (String endereco){
        pessoa.setEndereco(endereco);
        return this;
    }
    
    public Pessoa builder(){
        return this.pessoa;
    }
    
}
    

