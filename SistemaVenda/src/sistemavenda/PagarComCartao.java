package sistemavenda;

public class PagarComCartao implements ModoDePagar
{
    @Override
    public void pagamento() {
        System.out.println("ATENÇÃO: Modo de pagamento atual - Pagando com Cartão");
    }
    
}
