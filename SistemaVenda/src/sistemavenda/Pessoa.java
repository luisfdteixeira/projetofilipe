package sistemavenda;

public class Pessoa 
{
    public String nome;
    public String dataNascimento;
    public String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void printaEndereco()
    {
        System.out.println("Endereço de Entrega: " + endereco);
    }
    
    public void printaNome()
    {
        System.out.println("Nome cliente: " + nome);
    }
    
    public void printaData()
    {
        System.out.println("Data de Nascimento: " + dataNascimento);
    } 
}
