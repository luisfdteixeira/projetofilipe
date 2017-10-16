package sistemavenda;

public class PagarComDinheiro implements ModoDePagar
{
    @Override
    public void pagamento() {
        System.out.println("ATENÇÃO: Modo de pagamento atual - Pagando com Dinheiro");
    }
}
