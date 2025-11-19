public class Main {
    public static void main(String[] args) {
        System.out.println(">>> SISTEMA DE ANÁLISE DE PERFIL DE RISCO <<<\n");

        // Dados do cliente simulado
        double patrimonio = 100000.00;
        int idade = 35;

        // 1. O sistema inicia com o modelo CONSERVADOR (padrão)
        AnalisadorInvestimento analisador = new AnalisadorInvestimento(new ModeloConservador());
        analisador.realizarAnalise(patrimonio, idade);

        // 2. O consultor ou o cliente decide mudar o perfil para MODERADO
        // A troca é feita dinamicamente sem recriar o analisador
        System.out.println("[Sistema] Alterando perfil para Moderado...");
        analisador.setEstrategia(new ModeloModerado());
        analisador.realizarAnalise(patrimonio, idade);

        // 3. O cliente decide arriscar mais, mudando para AGRESSIVO
        System.out.println("[Sistema] Alterando perfil para Agressivo...");
        analisador.setEstrategia(new ModeloAgressivo());
        analisador.realizarAnalise(patrimonio, idade);
    }
}