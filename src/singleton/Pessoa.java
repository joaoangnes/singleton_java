package singleton;

/**
 * A classe Pessoa implementa o padrão Singleton para criar uma única instância de Pessoa.
 * Ela controla se já foi instanciado um objeto Pessoa e fornece um método estático para
 * obter essa instância única.
 */
public class Pessoa {
    // Controle para verificar se já foi instanciado um objeto Pessoa
    private static Pessoa uniqueInstance;

    // Construtor privado para garantir que não seja possível criar instâncias externas da classe
    private Pessoa(){}

    // Propriedades da pessoa
    public String nome;
    public String email;

    /**
     * Método estático que fornece a única instância de Pessoa.
     * Se a instância ainda não existir, ela é criada.
     * @return A instância única de Pessoa.
     */
    public static Pessoa getInstance(){
        // Verifica se já existe uma instância de Pessoa
        if(uniqueInstance == null){
            // Se não existe, cria uma nova instância
            uniqueInstance = new Pessoa();
        }

        // Retorna a instância existente ou recém-criada
        return uniqueInstance;
    }
}

