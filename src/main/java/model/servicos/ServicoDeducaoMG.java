
package model.servicos;


public class ServicoDeducaoMG implements ServicoDeducao {

    private static final double TAXA = 0.2;
    
    @Override
    public double calcularDeducao(double valor) {
        return valor * TAXA;
    }
    
}
