public class ConstrutorCasaClassica extends ConstrutorCasa {
    @Override
    public void construirFundacao() {
        casa.setFundacao("Concreto tradicional");
    }
    
    @Override
    public void construirParedes() {
        casa.setParedes("Alvenaria com revestimento em pedra");
    }
    
    @Override
    public void construirTelhado() {
        casa.setTelhado("Telhado inclinado com telhas cerâmicas");
    }
    
    @Override
    public void construirPortas() {
        casa.setNumPortas(6);
    }
    
    @Override
    public void construirJanelas() {
        casa.setNumJanelas(8);
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
