import java.util.Scanner;

public class MenuAluno {

    Scanner sc = new Scanner(System.in);

    Aluno aluno = new Aluno();

    public void menuAluno() {

        int opt = -1;

        while (opt != 0) {
            System.out.println("-----Menu Cadastro Aluno-----\nInforme uma opção");
            System.out.println("1 - Cadastro de aluno\n2 - Infomações de aluno\n3 - Media Parcial (AV1 e AV2)\n4 - Media Final\n0 - Sair");
            opt = sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    criaAluno();
                    menuAluno();

                case 2:
                    imprimeAluno();
                    menuAluno();

                case 3:
                    if (aluno.getNota1() == -1 || aluno.getNota2() == -1) {
                        System.out.println("Antes de calcular a media, informe as notas AV1 e AV2 no cadastro do aluno.");
                        menuAluno();
                    } else {
                        aluno.mediaParc();
                        menuAluno();
                    }

                case 4:
                    if (aluno.getMediaP() == 0) {
                        System.out.println("Calcule a media parcial para calcular a final.");
                        aluno.mediaParc();
                        menuAluno();
                    } else {
                        aluno.mediaFinal();
                        menuAluno();
                    }
                default:
                    System.out.println("Informe uma opção válida.");
            }
        }
    }

    public void criaAluno() {

        System.out.println("-----Cadastro de Aluno-----");

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

        System.out.println("Cadastrado aluno: " + aluno.getNome() + " " + aluno.getSobrenome());
    }

    public void imprimeAluno() {
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
