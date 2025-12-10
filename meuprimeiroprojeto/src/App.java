public class App {

    public static void main(String[] args) {

        // instanciano a classe Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafaela";
        p1.idade = 36;
        //p1.apresentarPessoa();
        p1.validarIdade(p1.idade);
        p1.anoNascimento = 1986;
        int idadeReal = p1.conferirIdade(p1.idade, p1.anoNascimento);
        System.out.println(idadeReal);

        Pessoa p2 = new Pessoa();
        p2.nome = "Raquel";
        p2.idade = 6;
        //p2.apresentarPessoa();
        p2.validarIdade(p2.idade);
        p2.anoNascimento = 2019;
        System.out.println(p2.conferirIdade(p2.idade, p2.anoNascimento));
    }
}
