package strategy.exemploDragao.padrãoStrategy;

public class EstrategiaArmaBranca implements AcaoExterminio{
    @Override
    public void executar() {
        System.out.println("Matou o dragão com espada");
    }
}
