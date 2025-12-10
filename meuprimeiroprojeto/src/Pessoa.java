import java.time.LocalDate;

public class Pessoa {

    //variáveis do tipo global - atributos
    String nome;
    String sobrenome;
    int idade;
    int anoNascimento;
    String cidadeOrigem;

    // método é a ação referente a classe
    public void apresentarPessoa() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void validarIdade(int idade) {
        if (idade > 18) {
            apresentarPessoa();
            System.out.println("Pessoa maior de idade.");
        } else if (idade == 0) {
            System.out.println("Idade zero não é pemitido.");
        } else {
            apresentarPessoa();
            System.out.println("Pessoa menor de idade.");
        }
    }

    public int conferirIdade(int idade, int anoNascimento) {
        int anoAtual = LocalDate.now().getYear(); //Pegando o ano atual
        int idadeReal = anoAtual - anoNascimento; //Encontrando a idade real da pessoa
        if (idade == idadeReal){
            System.out.println("Idade ok!!!");
            return idadeReal;
        }

        System.out.println("Idade não condiz com a realidade.");
        return 0;
    }

}
