/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subrotinaimc;

import java.util.Scanner;

/**
 *
 * @author lab651
 */
public class SubRotinaImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, altura;
        
        System.out.println("Peso?");
        peso = entrada.nextDouble();
        System.out.println("Altura:");
        altura = entrada.nextDouble();
        double imc = Imc(peso,altura);
        
        System.out.println(classificacao(imc));
    }
    static double Imc(double peso, double altura){
        double imc;
        imc = peso/(altura*altura);
        return imc;
    }
    static String classificacao(double imc) {
        String classificacao;
        if (imc < 18) {
            classificacao = "magreza";
        } else if (imc < 25) {
            classificacao = "normal";
        } else if (imc < 30) {
            classificacao = "sobrepeso";
        } else if (imc < 35) {
            classificacao = "obesidade grau I";
        } else if (imc < 40) {
            classificacao = "obesidade grau II";
        } else {
            classificacao = "obesidade grau III";
        }
        return classificacao;
    }
    
}
