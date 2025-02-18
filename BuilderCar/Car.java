package ads;

public class Car {
    private String motor;
    private String roda;
    private String chassi;
    private String cor;
    private String combustivel;

    public Car(String motor, String roda, String chassi, String cor, String combustivel) {
        this.motor = motor;
        this.roda = roda;
        this.chassi = chassi;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", roda=" + roda + ", chassi=" + chassi + 
               ", cor=" + cor + ", combustivel=" + combustivel + "]";
    }
}
//
