public class Tarefa5 {
    public static void main(String[] args) {
        //Tarefa 5 - Crie uma listagem de produtos utilizando variáves primitivas
        /*
        Nosso desafio será criar uma listagem de produtos utilizando o console
        do Intellij ou Eclipse utilizando variáveis primitivas para representar o
        preço dos produtos.
        */

        System.out.println("Seja bem vindo ao COMEX!");
        System.out.println();

        double livro = 49.95;
        double celular = 1470.76;
        String mensagem = """
                        >>> Listagem dos Produtos
                        ____________________________________
                        Nome:   Livro
                        Preço:  R$ %.2f
                        ____________________________________
                        Nome:   Celular
                        Preço:  R$ %.2f
                        
                """.formatted(livro, celular);

        System.out.println( mensagem);


    }
}
