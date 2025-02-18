package ads;

public interface Builder {
    Builder motor(String motor);
    Builder roda(String roda);
    Builder chassi(String chassi);
    Builder cor(String cor);
    Builder combustivel(String combustivel);
    Car build();
} 
