package SemBuilder;

public class CasaCreator {

    public Casa createCasaModerna() {
        Casa casa = new Casa();
        casa.setFundacao("Fundação de concreto reforçado");
        casa.setParedes("Paredes de vidro e aço");
        casa.setTelhado("Telhado plano com painéis solares");
        return casa;
    }
    
    public Casa createCasaClassica() {
        Casa casa = new Casa();
        casa.setFundacao("Fundação de concreto tradicional");
        casa.setParedes("Paredes de tijolo");
        casa.setTelhado("Telhado inclinado com telhas cerâmicas");
        return casa;
    }
}
