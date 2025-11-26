public class App {

    public static void main(String[] args) {

        // instanciano a classe Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafaela";
        p1.idade = 36;
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Raquel";
        p2.idade = 6;
        p2.apresentar();
    }
}
