package ComBuilder;

public class ConstrutorModerna extends ConstrutorCasa {

    @Override
    public void construirFundacao() {
        casa.setFundacao("concreto reforçado");
    }

    @Override
    public void construirParedes() {
        casa.setParedes("Paredes de vidro e aço");
    }

    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhado inclinado com telhas cerâmicas");
    }
    
}
