package sistemavenda;

public class Pagamento 
{
    private ModoDePagar modo;
    
    public void pagar(){
        modo.pagamento();
    }
    
    public void setModo(ModoDePagar novoModo){
        modo = novoModo;
    }
    
}
