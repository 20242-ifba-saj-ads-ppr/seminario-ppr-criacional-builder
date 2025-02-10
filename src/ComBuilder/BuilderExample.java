package ComBuilder;


public class BuilderExample {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        
        ConstrutorCasa construtorModerno = new ConstrutorModerna();
        diretor.setConstrutor(construtorModerno);
        diretor.construirCasa();
        Casa casaModerna = diretor.getCasa();
        System.out.println("\nCasa Moderna: " + casaModerna);
        
        ConstrutorCasa construtorClassico = new ConstrutorCasaClassica();
        diretor.setConstrutor(construtorClassico);
        diretor.construirCasa();
        Casa casaClassica = diretor.getCasa();
        System.out.println("\nCasa Clássica: " + casaClassica);
    }
}
