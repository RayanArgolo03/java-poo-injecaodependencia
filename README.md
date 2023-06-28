

# Projeto de Demonstração de Injeção de Dependência em Java

Este projeto é um exemplo simples que demonstra o uso de injeção de dependência em Java. Ele ilustra como diferentes serviços de dedução de impostos podem ser injetados em um serviço de pagamento para calcular a taxa a ser aplicada.

## Funcionalidades

O projeto consiste em classes e interfaces que realizam as seguintes funcionalidades:

- A interface `ServicoDeducao` define um método `calcularDeducao` que retorna o valor da dedução de imposto.
- As classes `ServicoDeducaoMG`, `ServicoDeducaoRJ` e `ServicoDeducaoSP` implementam a interface `ServicoDeducao` e calculam a dedução de imposto com taxas específicas para cada estado.
- A classe `ServicoPagamento` é responsável por gerar a taxa de pagamento com base no valor e no serviço de dedução fornecido.

## Uso

O arquivo `Main.java` contém o método `main` que demonstra a injeção de dependência e o cálculo das taxas de pagamento para os diferentes serviços de dedução.

```
public static void main(String[] args) {
    // Injeção de Dependência
    ServicoPagamento sp1 = new ServicoPagamento(new ServicoDeducaoSP());
    double taxaSP = sp1.gerarTaxa(10);

    ServicoPagamento sp2 = new ServicoPagamento(new ServicoDeducaoMG());
    double taxaMG = sp2.gerarTaxa(10);

    ServicoPagamento sp3 = new ServicoPagamento(new ServicoDeducaoRJ());
    double taxaRJ = sp3.gerarTaxa(10);
}

```
## UML
<div align="center">
<img src="https://github.com/RayanArgolo03/java-poo-injecaodependencia/assets/113947677/64eeed4f-2b63-459e-9cb1-c2f0604401b2">
</div>
