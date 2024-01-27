public class Tarefa7 {
    public static void main(String[] args) {
        //Tarefa 7 - Alterar a listagem dos clientes para exibir a característica etária dos clientes
        /*
        Nosso desafio será alterar a listagem de clientes para implementar a característica etária do cliente.
        */

        System.out.println("Seja bem vindo ao COMEX!");
        System.out.println();


        String nomeFulano = "Fulano";
        int anoFulano = 1980;
        int idadeFulano= 43;
        String faixaEtariaFulano;

        if (idadeFulano <= 17) {
            faixaEtariaFulano = "ADOLESCENTE";
        }else if(idadeFulano <= 29) {
            faixaEtariaFulano ="JOVEM";
        }else if(idadeFulano <= 59) {
            faixaEtariaFulano = "ADULTO";
        }else{
            faixaEtariaFulano ="IDOSO";
        };


        String nomeSicrano = "Sicrano";
        int anoSicrano = 2000;
        int idadeSicrano = 23;
        String faixaEtariaSicrano;

        if (idadeSicrano <= 17) {
            faixaEtariaSicrano = "ADOLESCENTE";
        }else if(idadeSicrano <= 29) {
            faixaEtariaSicrano ="JOVEM";
        }else if(idadeSicrano <= 59) {
            faixaEtariaSicrano = "ADULTO";
        }else{
            faixaEtariaSicrano ="IDOSO";
        };

        String mensagem = """
                                >>> Listagem de Clientes
                                ____________________________________
                                Nome:                  %s
                                Data de Nascimento:    %d
                                Idade:                 %d
                                Caracteristica Etária: %s
                                ____________________________________
                                Nome:                  %s
                                Data de Nascimento:    %d
                                Idade:                 %d
                                Caracteristica Etária: %s
                                
                        """.formatted(nomeFulano, anoFulano, idadeFulano, faixaEtariaFulano,
                        nomeSicrano, anoSicrano, idadeSicrano, faixaEtariaSicrano);

        System.out.println( mensagem);
    }
}
