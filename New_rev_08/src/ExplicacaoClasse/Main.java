package ExplicacaoClasse;

public class Main {
    public static void main(String[] args) {
        Pessoa mauro = new Pessoa();
        mauro.nome = "mauro";
        mauro.dataNascimento = "01/12/1998";
        mauro.sexo = 'M';
        for (int i =0; i < 10;i++){
            System.out.println(mauro.correr(i));
        }

        Pessoa josefa = new Pessoa();
        josefa.nome = "josefa";
        josefa.dataNascimento = "13/01/2002";
        josefa.sexo = 'F';

        System.out.println(josefa.correr(5));
        System.out.println(mauro.correr(5));
    }
}