package sistemavenda;

import sistemarelatorios.Recibo;
import sistemarelatorios.ReciboModelo1;
import sistemarelatorios.ReciboModelo2;

public class SistemaFabrica {

    public static void main(String[] args) 
    {   MaquinaChocolate cc = new MaquinaChocolate();
        MaquinaDoceDeLeite cd = new MaquinaDoceDeLeite();
        System.out.println("Compra Atual:");
        cc.entregaChurros();
        cd.entregaChurros();  
        
        //seleção de pagamento:
        System.out.println("\nModo de Pagamento:");
        Pagamento a = new Pagamento();
        
        a.setModo(new PagarComDinheiro());
        a.pagar();
        //alteração do modo de pagamento em tempo de execução
        a.setModo(new PagarComCartao());
        a.pagar();
        
        //cadastro pessoa
        System.out.println("\nCliente e entrega: ");
        PessoaBuilder pessoaBuilder = new PessoaBuilder();
        Pessoa pessoa = pessoaBuilder.criaPessoa()
                .chamada("Caetano Costa Pereira")
                .nascidaEm("04/10/1984")
                .queMoraEm("Av Marte n 144 - Bairro Alvorada")
                .builder();
        
        pessoa.printaNome();
        pessoa.printaData();
        pessoa.printaEndereco();
        
        //emissão de recibo
        System.out.println("\nRecibo:");
        Recibo r = new ReciboModelo1();
        r.gerarRecibo();
        
        
        
    }
    
}
