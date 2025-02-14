public class ConstrutorCasaModerna extends ConstrutorCasa {
    @Override
    public void construirFundacao() {
        casa.setFundacao("Concreto armado com isolamento térmico");
    }
    
    @Override
    public void construirParedes() {
        casa.setParedes("Vidro e aço");
    }
    
    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhado plano com painéis solares");
    }
    
    @Override
    public void construirPortas() {
        casa.setNumPortas(4);
    }
    
    @Override
    public void construirJanelas() {
        casa.setNumJanelas(10);
    }
    
    @Override
    public void construirGaragem() {
        casa.setTemGaragem(true);
    }
    
    @Override
    public void construirPiscina() {
        casa.setTemPiscina(false);
    }
}
