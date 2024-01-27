public class Tarefa4 {
    public static void main(String[] args) {
        //Tarefa 4 - Crie uma listagem de clientes utilizando variáveis primitivas
        /*
	    Nosso desafio será criar uma listagem de clientes utilizando o console do
        Intellij utilizando variáveis primitivas para representar o ano de nascimento
        dos clientes.
        */

        System.out.println("Seja bem vindo ao COMEX!");
        System.out.println();

        int anoFulano = 1980;
        int anoSicrano = 2000;
        String mensagem = """
                        >>> Listagem de Clientes
                        ____________________________________
                        Nome:               Fulano
                        Data de Nascimento: %d
                        ____________________________________
                        Nome:               Sicrano
                        Data de Nascimento: %d
                        
                """.formatted(anoFulano, anoSicrano);

        System.out.println( mensagem);
    }
}
