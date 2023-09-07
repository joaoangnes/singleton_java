package singleton;

public class TestSingletonPessoa {
    public static void main(String[] args) {
        Pessoa p1 = Pessoa.getInstance();
        p1.nome = "João Arthur";
        System.out.println("Usando p1:");
        System.out.println(" - Nome: "+p1.nome +"|| Email: "+ p1.email+"\n");

        // --------
        // Nova Pessoa

        Pessoa p2 = Pessoa.getInstance();
        p2.email = "joao@gmail.com";
        System.out.println("Usando p2:");
        System.out.println(" - Nome: "+p2.nome +"|| Email: "+ p2.email+"\n");

        // -------------
        // Teste utilizando o email do objeto p1
        System.out.println("Voltando para p1:");
        System.out.println(" - Email: "+ p1.email+"\n");

        // -----
        // Comparação entre os dois objetos
        System.out.println("Comparação entre os dois objetos");
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);

    }
    
}
