enum Genero {
    Masculino, Feminino
}
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Genero genero;
    private int idade;
    private String aluno;

    public Pessoa(String nome, Genero genero, int idade, String aluno) {
        super();
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.aluno = aluno;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {

        return " [" + nome + ", " + genero + ", " + idade
                + "]";

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
