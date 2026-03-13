import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX_ALUNOS = 30;
        String[] nomesAlunos = new String[MAX_ALUNOS];
        double[] nota1 = new double[MAX_ALUNOS];
        double[] nota2 = new double[MAX_ALUNOS];
        double[] medias = new double[MAX_ALUNOS];

        int qtdAlunos = 0;
        int opcao = 0;

        System.out.println("Iniciando Sistema");
        Scanner sc = new Scanner(System.in);

        while(opcao != 6) {
            System.out.println("Selecione uma opção para prosseguir: ");

            System.out.println("\n=== SISTEMA DE CADASTRO DE ALUNOS E NOTAS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos cadastrados");
            System.out.println("3 - Lançar notas");
            System.out.println("4 - Consultar boletim de um aluno");
            System.out.println("5 - Mostrar alunos aprovados e reprovados");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Selecione uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolhido a opção 1");
                    break;

                case 2:
                    System.out.println("Escolhido a opção 2");
                    break;

                case 3:
                    System.out.println("Escolhido a opção 3");
                    break;

                case 4:
                    System.out.println("Escolhido a opção 4");
                    break;

                case 5:
                    System.out.println("Escolhido a opção 5");
                    break;

                case 6:
                    System.out.println("Escolhido a opção 6");
                    break;

                default:
                    System.out.println("A opção " + opcao + " não é válida.");
            }
        }

        sc.close();
    }
}
