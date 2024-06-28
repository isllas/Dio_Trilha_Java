import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
    
    }



    
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice<candidatos.length; indice++){
            System.out.println("O candidato de nº "+(indice+1)+" e nome "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for(String candidato:candidatos){
            System.out.println("O candidato selecionado foi: "+candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditato "+candidato+" solicitou o salario de "+salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O canditato "+candidato+" já foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com contra proposta!");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }

}
