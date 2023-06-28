
package model.servicos;


public class ServicoPagamento {
 
    
    private ServicoDeducao servicoDeducao;

    //Inversão de controle 
    public ServicoPagamento(ServicoDeducao servicoDeducao) {
        this.servicoDeducao = servicoDeducao;
    }
    
    
    public double gerarTaxa (double valor){
    
        valor = valor - servicoDeducao.calcularDeducao(valor);
        return valor * 0.2;
        
    }
    
}
