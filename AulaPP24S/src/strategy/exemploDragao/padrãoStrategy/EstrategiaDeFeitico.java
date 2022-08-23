package strategy.exemploDragao.padrãoStrategy;

public class EstrategiaDeFeitico implements AcaoExterminio{
    @Override
    public void executar() {
        System.out.println("Matou o dragão com feitiço");
    }
}
