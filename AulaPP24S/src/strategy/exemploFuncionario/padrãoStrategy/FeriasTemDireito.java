package strategy.exemploFuncionario.padrãoStrategy;

public class FeriasTemDireito implements Ferias{
    @Override
    public void calcularFerias() {
        System.out.println("Tem direito à férias");
    }
}
