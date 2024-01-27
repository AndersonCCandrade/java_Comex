public class Tarefa8 {
    public static void main(String[] args) {
        //Tarefa 8 - Crie um cabeçalho dinâmico utilizando fluxo com laços
        /*
        Nosso desafio será implementar um cabeçalho dinâmico utilizando laços. O sistema deve
        apresentar as linhas conforme o valor da variável.
        */

        String mensagem = "Bem vindo ao Comex!";
        int cenario1 = 20;
        int cenario2 = 40;

        System.out.println();
        System.out.println("Cenário 1 [Variável * com tamanho 20]");

        for (int i = 1; i <= 2; i++) {
            while (cenario1 > 0) {
                System.out.print("*");
                cenario1--;
            }
            if (i!= 2){
                System.out.println();
                System.out.println(mensagem);
                cenario1 = 20;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Cenário 2 [Variável * com tamanho 40]");

        for (int i = 1; i <= 2; i++) {
            while (cenario2 > 0) {
                System.out.print("*");
                cenario2--;
            }
            if (i!= 2){
                System.out.println();
                System.out.println(mensagem);
                cenario2 = 40;
            }
        }

    }
}
