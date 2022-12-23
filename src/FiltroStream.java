import java.util.ArrayList;
import java.util.List;

public class FiltroStream {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();

        pessoaList.add(new Pessoa("Alice", Genero.Feminino, 18, "Não"));
        pessoaList.add(new Pessoa("Paulo", Genero.Masculino, 25, "Sim"));
        pessoaList.add(new Pessoa("Léo", Genero.Masculino, 28, "Sim"));
        pessoaList.add(new Pessoa("Luan", Genero.Masculino, 24, "Sim"));
        pessoaList.add(new Pessoa("Gabriel", Genero.Masculino, 16, "Não"));
        pessoaList.add(new Pessoa("Bia", Genero.Feminino, 22,"Não"));
        pessoaList.add(new Pessoa("Ana", Genero.Feminino, 17, "Não"));

        System.out.println(" ");
        System.out.println("------| Todas as pessoas |------");
        pessoaList
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("------| Masculino |------");
        pessoaList.stream().filter(pessoa -> pessoa.getGenero().equals(Genero.Masculino))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("------| Feminino |------");
        pessoaList.stream().filter(pessoa -> pessoa.getGenero().equals(Genero.Feminino))
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("------| Maior de idade |------");
        pessoaList.stream().filter(pessoa -> pessoa.getIdade() > 17)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("------| Estuda programação |------");
        pessoaList.stream().filter(pessoa -> pessoa.getAluno().equals("Sim"))
                .forEach(System.out::println);


    }
}