package SemBuilder;

public class CasaCreator {

    public Casa createCasaModerna() {
        Casa casa = new Casa();
        casa.setFundacao("Concreto armado com isolamento térmico");
        casa.setParedes("Vidro e aço");
        casa.setTelhado("Telhado plano com painéis solares");
        casa.setNumPortas(4);
        casa.setNumJanelas(10);
        casa.setTemGaragem(true);
        casa.setTemPiscina(false);
        return casa;
    }
    
    public Casa createCasaClassica() {
        Casa casa = new Casa();
        casa.setFundacao("Concreto tradicional");
        casa.setParedes("Alvenaria com revestimento em pedra");
        casa.setTelhado("Telhado inclinado com telhas cerâmicas");
        casa.setNumPortas(6);
        casa.setNumJanelas(8);
        casa.setTemGaragem(true);
        casa.setTemPiscina(false);
        return casa;
    }
    
}
