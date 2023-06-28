
package model.servicos;


public class ServicoDeducaoRJ implements ServicoDeducao{

    private static final double TAXA = 0.3;
    
    @Override
    public double calcularDeducao(double valor) {
        return valor * TAXA;
    }
    
}
