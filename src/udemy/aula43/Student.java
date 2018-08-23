package udemy.aula43;

public class Student{

    private String name;
    private double[] notas;


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void verificarAprovacao(double sum){
        if(sum >=60){
            System.out.println("FINAL GRADE = " + sum);
            System.out.println("PASS");
        }else{
            System.out.println("FINAL GRADE = " + sum);
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.0-sum) + " POINTS");
        }
    }

}
