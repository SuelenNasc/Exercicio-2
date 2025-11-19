// Estratégia 1: Modelo Conservador
// Foca na preservação do patrimônio e aversão a perdas.
class ModeloConservador implements CalculoRiscoStrategy {
    @Override
    public void calcularRisco(double patrimonio, int idade) {
        System.out.println("--- Cálculo Modelo CONSERVADOR ---");
        System.out.println("Critério: Prioridade máxima em Renda Fixa e Tesouro.");
        System.out.println("Peso Idade: Alto (quanto mais velho, menos risco).");
        // Lógica fictícia de cálculo
        double score = (patrimonio * 0.02) - (idade * 0.5);
        System.out.println("Resultado do Score de Segurança: " + score);
    }
}

// Estratégia 2: Modelo Moderado
// Equilibra segurança com busca por rentabilidade.
class ModeloModerado implements CalculoRiscoStrategy {
    @Override
    public void calcularRisco(double patrimonio, int idade) {
        System.out.println("--- Cálculo Modelo MODERADO ---");
        System.out.println("Critério: Balanceamento entre Fundos Imobiliários e Ações Blue Chips.");
        System.out.println("Peso Idade: Médio.");
        // Lógica fictícia diferente
        double score = (patrimonio * 0.05) + (100 - idade);
        System.out.println("Resultado do Score de Equilíbrio: " + score);
    }
}

// Estratégia 3: Modelo Agressivo
// Foca em maximização de retorno, aceitando alta volatilidade.
class ModeloAgressivo implements CalculoRiscoStrategy {
    @Override
    public void calcularRisco(double patrimonio, int idade) {
        System.out.println("--- Cálculo Modelo AGRESSIVO ---");
        System.out.println("Critério: Foco em Criptoativos, Ações Small Caps e Derivativos.");
        System.out.println("Peso Idade: Baixo (foco no patrimônio disponível para risco).");
        // Lógica fictícia agressiva
        double score = (patrimonio * 0.15) * 1.5;
        System.out.println("Resultado do Score de Potencial: " + score);
    }
}