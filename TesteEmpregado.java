
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome, sobrenome;
        double salario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome=entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome=entrada.nextLine();
        System.out.println("Digite seu salario:");
        salario=entrada.nextDouble();
        
        Empregado t1 = new Empregado(nome, sobrenome, salario);
        t1.verificaSalario(salario);
        double soma;
        soma = t1.getSalMensal()*12;
        System.out.println("Salário anual de " + t1.getNome()+
                " "+t1.getSobrenome()+" é de R$ "+soma);
        System.out.println("Reajuste de 10%");
        soma = soma*1.10;
        System.out.println("Salario reajustado "+soma);
    }
    
}
