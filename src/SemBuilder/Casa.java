package SemBuilder;

public class Casa {
    private String fundacao;
    private String paredes;
    private String telhado;
    private int numPortas;
    private int numJanelas;
    private boolean temGaragem;
    private boolean temPiscina;

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }
    public void setParedes(String paredes) {
        this.paredes = paredes;
    }
    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void setNumJanelas(int numJanelas) {
        this.numJanelas = numJanelas;
    }
    public void setTemGaragem(boolean temGaragem) {
        this.temGaragem = temGaragem;
    }
    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }
    
    @Override
    public String toString() {
        return "Casa [fundacao=" + fundacao + ", paredes=" + paredes 
                + ", telhado=" + telhado + ", numPortas=" + numPortas 
                + ", numJanelas=" + numJanelas + ", temGaragem=" + temGaragem 
                + ", temPiscina=" + temPiscina + "]";
    }
}
