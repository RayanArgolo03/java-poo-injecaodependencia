package teste;

import model.servicos.*;

public class Main {

    public static void main(String[] args) {

        //Injeção de Dependência
        ServicoPagamento sp1 = new ServicoPagamento(new ServicoDeducaoSP());
        double taxaSP = sp1.gerarTaxa(10);

        ServicoPagamento sp2 = new ServicoPagamento(new ServicoDeducaoMG());
        double taxaMG = sp2.gerarTaxa(10);

        ServicoPagamento sp3 = new ServicoPagamento(new ServicoDeducaoRJ());
        double taxaRJ = sp3.gerarTaxa(10);

    }

}
