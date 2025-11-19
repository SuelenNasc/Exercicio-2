public class AnalisadorInvestimento {
    
    // Referência para a interface (pode receber qualquer modelo)
    private CalculoRiscoStrategy estrategia;

    // Construtor: Pode receber uma estratégia inicial ou iniciar nulo
    public AnalisadorInvestimento(CalculoRiscoStrategy estrategiaInicial) {
        this.estrategia = estrategiaInicial;
    }

    // Setter: Permite trocar a estratégia dinamicamente em TEMPO DE EXECUÇÃO
    public void setEstrategia(CalculoRiscoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    // Método principal que delega a execução para a estratégia atual
    public void realizarAnalise(double patrimonio, int idade) {
        if (this.estrategia == null) {
            System.out.println("Nenhuma estratégia de análise definida!");
            return;
        }
        this.estrategia.calcularRisco(patrimonio, idade);
        System.out.println("-------------------------------------------------");
    }
}