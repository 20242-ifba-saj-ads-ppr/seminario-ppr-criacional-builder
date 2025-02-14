public class DiretorCasaPersonalizado {
    private ConstrutorCasa construtor;
    
    public void setConstrutor(ConstrutorCasa construtor) {
        this.construtor = construtor;
    }
    
    public void construirCasa() {
        construtor.criarNovaCasa();
        construtor.construirGaragem();
        construtor.construirJanelas();
        construtor.construirFundacao();
        construtor.construirParedes();
        construtor.construirTelhado();
        construtor.construirPortas();
        construtor.construirPiscina();
    }
    
    public Casa getCasa() {
        return construtor.getCasa();
    }
}
