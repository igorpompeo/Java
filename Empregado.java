/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class Empregado {
    
    private String nome, sobrenome;
    private double salMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(int salMensal) {
        this.salMensal = salMensal;
    }

    public Empregado(String nome, String sobrenome, double salMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salMensal = salMensal;
    }
    public double verificaSalario(double salario){
        if(salario < 0){
            return 0;
        }
        else{
            return salario;
        }
    }
    
    
}
