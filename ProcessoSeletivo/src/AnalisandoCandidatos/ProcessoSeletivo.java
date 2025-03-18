package AnalisandoCandidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String[] candidatos = {"Maria", "Julio", "João", "Rodolfo", "Andre", "Bruno", "Alexandre"};
        for(String candidato : candidatos) {
            entrarEmContato(candidato);


        }

    }

    static void entrarEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");

        } while(continuarTentando && tentativasRealizadas < 3 );


        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo tentativas: " + tentativasRealizadas);




    }
//método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecionarCandidatos() {
        String[] candidatos = {"Maria", "Julio", "João", "Rodolfo", "Andre", "Bruno", "Alexandre", "Bruna", "Celia", "Larissa", "Monte", "Ana", "Alice"};
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtuais++;


        }


    }

    static void imprimirSelecionados() {

        String[] candidatos = {"Maria", "Julio", "João", "Rodolfo", "Leticia"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número: " + (indice+1) + " é " + candidatos[indice]);

        }
    }






    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }









    static void analisarCandidato (double salarioPretendido){

        double salarioBase =  2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}