package ExplicacaoClasse;

public class Pessoa {
    String nome;
    String dataNascimento;
    Character sexo;

    String correr(int velocidade) {
        return nome + " correndo na velocidade: " + velocidade;
    }
}
