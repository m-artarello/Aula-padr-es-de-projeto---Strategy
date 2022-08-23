package strategy.exemploDragao.entidade;

import strategy.exemploDragao.padrãoStrategy.AcaoExterminio;

public class ExterminadorDeDragoes {
    private AcaoExterminio acaoExterminio;

    public ExterminadorDeDragoes(AcaoExterminio acaoExterminio) {
        this.acaoExterminio = acaoExterminio;
    }

    public void mudaEstrategia (AcaoExterminio acaoExterminio){
        this.acaoExterminio = acaoExterminio;
    }
    public void iniciarBatalha() {
        acaoExterminio.executar();
    }
}
