package br.com.zup;

public class Estudante {

    private String nome;
    private int matricula;
    private double[] notas;

    public Estudante(String nome, int matricula, double[] notas){
        this.nome       = nome;
        this.matricula  = matricula;
        this.notas      = notas;
    }

    public Estudante(){

    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for ( double nota: notas){
            System.out.println(nota + " ");
        }


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
