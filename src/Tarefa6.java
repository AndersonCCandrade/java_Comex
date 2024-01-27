public class Tarefa6 {
    public static void main(String[] args) {
        //Tarefa 6 - Alterar a listagem dos clientes para utilizar o nome dos clientes em variáveis do tipo String
        /*
        Nosso desafio será alterar a listagem de clientes para utilizar as variáveis
        do tipo String para representar os nomes dos clientes.
        */

        System.out.println("Seja bem vindo ao COMEX!");
        System.out.println();

        String nomeFulano = "Fulano";
        int anoFulano = 1980;

        String nomeSicrano = "Sicrano";
        int anoSicrano = 2000;

        String mensagem = """
                                >>> Listagem de Clientes
                                ____________________________________
                                Nome:               %s
                                Data de Nascimento: %d
                                ____________________________________
                                Nome:               %s
                                Data de Nascimento: %d
                                
                        """.formatted(nomeFulano, anoFulano, nomeSicrano, anoSicrano);

        System.out.println( mensagem);
    }
}
