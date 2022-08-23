package strategy.exemploFuncionario.padrãoStrategy;

public class FeriasSemDireito implements Ferias{
    @Override
    public void calcularFerias() {
        System.out.println("Não tem direito à férias");
    }
}
