
public class DiretorCasaPadrao {
    private ConstrutorCasa construtor;
    
    public void setConstrutor(ConstrutorCasa construtor) {
        this.construtor = construtor;
    }
    
    public void construirCasa() {
        construtor.criarNovaCasa();
        construtor.construirFundacao();
        construtor.construirParedes();
        construtor.construirTelhado();
    }
    
    public Casa getCasa() {
        return construtor.getCasa();
    }
}