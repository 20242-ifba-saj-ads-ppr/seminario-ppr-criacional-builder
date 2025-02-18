package ads;

public class CarBuilder implements Builder {
    private String motor;
    private String roda;
    private String chassi;
    private String cor;
    private String combustivel;

    @Override
    public Builder motor(String motor) {
        this.motor = motor;
        return this;
    }

    @Override
    public Builder roda(String roda) {
        this.roda = roda;
        return this;
    }

    @Override
    public Builder chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    @Override
    public Builder cor(String cor) {
        this.cor = cor;
        return this;
    }

    @Override
    public Builder combustivel(String combustivel) {
        this.combustivel = combustivel;
        return this;
    }

    @Override
    public Car build() {
        return new Car(motor, roda, chassi, cor, combustivel);
    }
}

//