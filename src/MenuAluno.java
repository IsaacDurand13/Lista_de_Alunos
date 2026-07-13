import java.util.ArrayList;
import java.util.Scanner;

public class MenuAluno {

    Scanner sc = new Scanner(System.in);

    ArrayList<Aluno> listaAluno = new ArrayList<>();

    private int matriculaAluno = 1001;

    Aluno aluno = new Aluno();

    public void menuAluno() {

        int opt = -1;

        while (opt != 0) {
            System.out.println("-----Menu Cadastro Aluno-----\nInforme uma opção");
            System.out.println("1 - Cadastro de aluno");
            System.out.println("2 - Infomações de aluno");
            System.out.println("3 - Listar todos os alunos");
            System.out.println("4 - Media Parcial (AV1 e AV2)");
            System.out.println("5 - Media Final");
            System.out.println("0 - Sair");

            opt = sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Finalizando...");
                    return;
                case 1:
                    criaAluno();
                    menuAluno();
                case 2:
                    imprimeAluno();
                    menuAluno();
                case 3:
                    listaAlunos();
                    menuAluno();
                case 4:
                    System.out.println("Informe o nome do aluno que deseja a media parcial");
                    if (aluno.getNota1() == -1 || aluno.getNota2() == -1) {
                        System.out.println("Antes de calcular a media, informe as notas AV1 e AV2 no cadastro do aluno.");
                        menuAluno();
                    } else {
                        aluno.mediaParc();
                        menuAluno();
                    }
                case 5:
                    //System.out.println("Informe o nome do aluno que deseja a media final");
                    //int nome

                    if (aluno.getMediaP() == 0) {
                        System.out.println("Calcule a media parcial para calcular a final.");
                        menuAluno();
                    } else {
                        System.out.println("Informe a nota av3");
                        aluno.setNota3(sc.nextDouble());
                        aluno.mediaFinal();
                        menuAluno();
                    }
                default:
                    System.out.println("Informe uma opção válida.");
            }
        }
    }

    public void criaAluno() {

        Aluno aluno = new Aluno();

        System.out.println("-----Cadastro de Aluno-----");
        sc.nextLine();
        System.out.println("Informe o nome do aluno");
        aluno.setNome(sc.nextLine());

        System.out.println("Informe o sobrenome");
        aluno.setSobrenome(sc.nextLine());

        System.out.println("Informe a idade do aluno");
        aluno.setIdade(sc.nextInt());

        System.out.println("Informe a nota av1");
        aluno.setNota1(sc.nextDouble());

        System.out.println("Informe a nota av2");
        aluno.setNota2(sc.nextDouble());

        aluno.setMatricula(matriculaAluno);
        matriculaAluno++;

        listaAluno.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");

    }

    public void imprimeAluno() {
        sc.nextLine();
        System.out.println("Informe o nome do aluno");
        String busca = sc.nextLine();

        for (Aluno aluno : listaAluno) {
            if (aluno.getNome().equals(busca)) {
                System.out.println("-----Informações de aluno-----");

                System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nota av1: " + aluno.getNota1());
                System.out.println("Nota av2: " + aluno.getNota2());
                if (aluno.getNota3() == -1) {
                    System.out.println("O aluno ainda não fez AV3");
                } else {
                    System.out.println("Nota av3: " + aluno.nota3);
                }
            }
        }
    }

    public  void listaAlunos() {

        System.out.println("-----Lista de Alunos-----");
        int index = 1;
        for (Aluno value : listaAluno) {
            System.out.println("----- Aluno"+(index)+" -----");
            index++;
            System.out.println("Nome: " + value.getNome()+" "+ value.getSobrenome());
            System.out.println("Idade: " + value.getIdade());
            System.out.println("Matricula: " + value.getMatricula());
            System.out.println("-------------------------------------");
        }
    }

}
