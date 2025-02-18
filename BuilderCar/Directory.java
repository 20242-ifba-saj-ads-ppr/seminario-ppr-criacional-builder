package ads;

public class Directory {
    public CarBuilder criarBuilder() {
        return new CarBuilder();
    }

    public Car criarCarroEsportivo() {
        return criarBuilder()
            .motor("V8")
            .roda("18 polegadas")
            .chassi("Esportivo")
            .cor("Vermelho")
            .combustivel("Gasolina")
            .build();
    }

    public Car criarCarroPopular() {
        return criarBuilder()
            .motor("1.0")
            .roda("14 polegadas")
            .chassi("Hatch")
            .cor("Branco")
            .combustivel("Flex")
            .build();
    }

    public Car criarCarroPersonalizado(String motor, String roda, String chassi, String cor, String combustivel) {
        return criarBuilder()
            .motor(motor)
            .roda(roda)
            .chassi(chassi)
            .cor(cor)
            .combustivel(combustivel)
            .build();
    }
}
