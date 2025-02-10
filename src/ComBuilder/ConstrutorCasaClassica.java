package ComBuilder;

public class ConstrutorCasaClassica extends ConstrutorCasa {
    @Override
    public void construirFundacao() {
        casa.setFundacao("Fundação de concreto tradicional");
    }
    
    @Override
    public void construirParedes() {
        casa.setParedes("Paredes de tijolo");
    }
    
    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhado inclinado com telhas cerâmicas");
    }
}