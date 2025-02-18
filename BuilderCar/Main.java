package ads;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        
        Car carroPopular = directory.criarCarroPopular();
        Car carroEsportivo = directory.criarCarroEsportivo();
        Car carroPersonalizado = directory.criarCarroPersonalizado("2.0", "16 polegadas", "Sedan", "Prata", "Diesel");
        
        System.out.println("Carro Popular: " + carroPopular);
        System.out.println("Carro Esportivo: " + carroEsportivo);
        System.out.println("Carro Personalizado: " + carroPersonalizado);
    }
}