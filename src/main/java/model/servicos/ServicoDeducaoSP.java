
package model.servicos;


public class ServicoDeducaoSP implements ServicoDeducao{

    private static final double TAXA = 0.1;
    
    @Override
    public double calcularDeducao(double valor) {
        return valor * TAXA;
    }
    
}
