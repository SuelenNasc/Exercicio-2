// Interface que define o contrato para as estratégias de cálculo
public interface CalculoRiscoStrategy {
    void calcularRisco(double patrimonio, int idade);
}