package secao08;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public Student(String name, double nota1, double nota2, double nota3){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public double missingPoints(){
        if (notaFinal() < 60){
            return 60 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
