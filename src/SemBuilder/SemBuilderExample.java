package SemBuilder;

public class SemBuilderExample {
    public static void main(String[] args) {
        CasaCreator creator = new CasaCreator();
        
        Casa casaModerna = creator.createCasaModerna();
        System.out.println("Casa Moderna: " + casaModerna);
        
        Casa casaClassica = creator.createCasaClassica();
        System.out.println("Casa Clássica: " + casaClassica);
    }
}
