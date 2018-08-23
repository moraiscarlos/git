package udemy.aula43;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setNotas(new double[5]);
        double sum = 0.0;


        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        System.out.print("Por favor, insira seu nome: ");
        student.setName(reader.nextLine().toString());

        for (int i=1; i<=3; i++){
            System.out.print("Insira a " + i +"ª nota: ");
            double notas = reader.nextDouble();
            student.getNotas()[i] = notas;
            sum = sum + notas;
        }

        student.verificarAprovacao(sum);
//        System.out.println("Nome: " + student.getName());
//        System.out.println("Notas: " + (student.getNotas()));
    }
}
