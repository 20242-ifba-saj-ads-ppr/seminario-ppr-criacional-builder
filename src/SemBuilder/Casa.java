package SemBuilder;

public class Casa {
    private String fundacao;
    private String paredes;
    private String telhado;

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }
    
    public void setParedes(String paredes) {
        this.paredes = paredes;
    }
    
    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }
    
    @Override
    public String toString() {
        return "Casa [fundacao=" + fundacao + ", paredes=" + paredes + ", telhado=" + telhado + "]";
    }
}
