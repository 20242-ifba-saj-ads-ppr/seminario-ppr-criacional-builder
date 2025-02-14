public class BuilderMultipleDirectorsExample {
    public static void main(String[] args) {
        DiretorCasaPadrao diretorPadrao = new DiretorCasaPadrao();
        ConstrutorCasa construtorModerna = new ConstrutorCasaModerna();
        diretorPadrao.setConstrutor(construtorModerna);
        diretorPadrao.construirCasa();
        Casa casaModernaPadrao = diretorPadrao.getCasa();
        System.out.println("Casa Moderna (Diretor Padrão): " + casaModernaPadrao);
        
        DiretorCasaPersonalizado diretorPersonalizado = new DiretorCasaPersonalizado();
        ConstrutorCasa construtorModerna2 = new ConstrutorCasaModerna();
        diretorPersonalizado.setConstrutor(construtorModerna2);
        diretorPersonalizado.construirCasa();
        Casa casaModernaPersonalizada = diretorPersonalizado.getCasa();
        System.out.println("Casa Moderna (Diretor Personalizado): " + casaModernaPersonalizada);
        
        DiretorCasaPadrao diretorPadraoClassica = new DiretorCasaPadrao();
        ConstrutorCasa construtorClassica = new ConstrutorCasaClassica();
        diretorPadraoClassica.setConstrutor(construtorClassica);
        diretorPadraoClassica.construirCasa();
        Casa casaClassicaPadrao = diretorPadraoClassica.getCasa();
        System.out.println("Casa Clássica (Diretor Padrão): " + casaClassicaPadrao);
        
        DiretorCasaPersonalizado diretorPersonalizadoClassica = new DiretorCasaPersonalizado();
        ConstrutorCasa construtorClassica2 = new ConstrutorCasaClassica();
        diretorPersonalizadoClassica.setConstrutor(construtorClassica2);
        diretorPersonalizadoClassica.construirCasa();
        Casa casaClassicaPersonalizada = diretorPersonalizadoClassica.getCasa();
        System.out.println("Casa Clássica (Diretor Personalizado): " + casaClassicaPersonalizada);
    }
}
