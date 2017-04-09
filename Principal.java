
import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
        Random r = new Random();
        Guiche guiche1 = new Guiche();
        Guiche guiche2 = new Guiche();
        Guiche guiche3 = new Guiche();
        int totalClientes, totalSaques, totalDepositos, tempoTotalDeEspera;
        int totalPagamentos, sorteioCliente, sorteioTransicao, tempoExtra,
                tempo = 21600;

        totalClientes = tempoExtra = tempoTotalDeEspera = 0; //zerando

        while ((!fila.isEmpty() || (tempo > 0))) {
            Cliente cliente;
            if (tempo > 0) { //Só é possivel gerar sorteios quando tempo é > 0 
                sorteioCliente = r.nextInt(30);
                if (sorteioCliente == 0) {//Transição só é gerada quando...   
                    totalClientes++;                      //...cliente é gerado
                    sorteioTransicao = r.nextInt(3);
                    cliente = new Cliente(sorteioTransicao, tempo);
                    fila.enqueue(cliente); //cliente entra na fila
                }
            }

            if (guiche1.isFree()) {
                if (!fila.isEmpty()) {
                    cliente = sairDaFila(fila.dequeue(), tempo); //subRotina
                    guiche1.setCodTransicao(cliente.getCodTransicao());
                    tempoTotalDeEspera += cliente.retornaTempoDeEspera();
                }
            } else {
                guiche1.operando(); //decrementa por tempo
            }

            if (guiche2.isFree()) {
                if (!fila.isEmpty()) {
                    cliente = sairDaFila(fila.dequeue(), tempo);
                    guiche2.setCodTransicao(cliente.getCodTransicao());
                    tempoTotalDeEspera += cliente.retornaTempoDeEspera();
                }

            } else {
                guiche2.operando(); //decrementa por tempo
            }

            if (guiche3.isFree()) {
                if (!fila.isEmpty()) {
                    cliente = sairDaFila(fila.dequeue(), tempo);
                    guiche3.setCodTransicao(cliente.getCodTransicao());
                    tempoTotalDeEspera += cliente.retornaTempoDeEspera();
                }
            } else {
                guiche3.operando(); //decrementa por tempo
            }

            if (tempo < 0) {
                tempoExtra++;
            }

            tempo--;
        }

        totalSaques = guiche1.getSaquesAtendidos() + guiche2.
                getSaquesAtendidos() + guiche3.getSaquesAtendidos();

        totalDepositos = guiche1.getDepositosAtendidos() + guiche2. 
                getDepositosAtendidos() + guiche3.getDepositosAtendidos();

        totalPagamentos = guiche1.getPagamentosAtendidos() + guiche2.
                getPagamentosAtendidos() + guiche3.getPagamentosAtendidos();

        System.out.println("\nDados do guiche 1: \n" + guiche1);
        System.out.println("\nDados do guiche 2: \n" + guiche2);
        System.out.println("\nDados do guiche 3: \n" + guiche3);

        System.out.println("\nTotal de clientes atendidos na agencia: = "
                + totalClientes);
        System.out.println("\nTotal de Saques = " + totalSaques);
        System.out.println("\nTotal de Depositos = " + totalDepositos);
        System.out.println("\nTotal de Pagamentos = " + totalPagamentos);

        System.out.printf("\nTempo total de Espera na fila = %s segundos "
                + "(%.2f  horas)", tempoTotalDeEspera, 
                (float) tempoTotalDeEspera / 3600);

        int mediaTempoDeEspera = tempoTotalDeEspera / totalClientes;
        System.out.printf("\nTempo medio de Espera = %s segundos (%.2f horas)\n"
                , mediaTempoDeEspera, (float) mediaTempoDeEspera / 3600);

        System.out.printf("\ntempo de expediente extra = %s segundos (%.2f)"
                + " horas\n", tempoExtra, (float) tempoExtra / 3600);
    }

    static Cliente sairDaFila(Cliente cliente, int tempo) {
        cliente.setTempoDeSaida(tempo);
        return cliente;
    }
}
