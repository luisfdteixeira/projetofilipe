package sistemarelatorios;

public abstract class Recibo 
{
    public void gerarRecibo(){
        buscar();
        calcular();
        exportar();
    }
    private void buscar(){
        System.out.println("Obs. 1: Preços buscados.");
    }
    private void calcular(){
        System.out.println("Obs. 2: Calculo feito.");
    }
    protected abstract void exportar();
    
}
