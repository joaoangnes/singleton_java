package singleton;

public class TestRefactorSingletonPessoa {
    public static void main(String[] args) {
        PessoaRefactorSingleton singleton = PessoaRefactorSingleton.ISTANCE;
        singleton.nome = "João Arthur";
        System.out.println("Usando singleton:");
        System.out.println(" - Nome: "+singleton.nome +"|| Email: "+ singleton.email+"\n");

        // --------
        // Nova Pessoa

        PessoaRefactorSingleton singleton2 = PessoaRefactorSingleton.ISTANCE;
        singleton2.email = "joao@gmail.com";
        System.out.println("Usando singleton2:");
        System.out.println(" - Nome: "+singleton2.nome +"|| Email: "+ singleton2.email+"\n");

        // -------------
        // Teste utilizando o email do objeto singleton
        System.out.println("Voltando para singleton:");
        System.out.println(" - Email: "+ singleton.email+"\n");

        // -----
        // Comparação entre os dois objetos
        System.out.println("Comparação entre os dois objetos");
        System.out.println("singleton: "+singleton);
        System.out.println("singleton2: "+singleton2);
    }
}