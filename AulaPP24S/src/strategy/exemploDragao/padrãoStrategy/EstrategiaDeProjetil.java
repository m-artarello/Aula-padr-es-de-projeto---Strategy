package strategy.exemploDragao.padrãoStrategy;

public class EstrategiaDeProjetil implements AcaoExterminio{
    @Override
    public void executar() {
        System.out.println("Matou o dragão com projetil");
    }
}
