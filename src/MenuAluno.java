import java.util.Scanner;

public class MenuAluno {

    Scanner sc = new Scanner(System.in);

    Aluno aluno = new Aluno();

    public void menuAluno(){

        int opt=-1;

        while(opt!=0) {
            System.out.println("-----Menu Cadastro Aluno-----\nInforme uma opção");
            System.out.println("1 - Cadastro de aluno\n2 - Infomações de aluno\n3 - Media Parcial (AV1 e AV2)\n4 - Media Final\n0 - Sair");
            opt = sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    aluno.criaAluno();
                    menuAluno();

                case 2:
                    aluno.imprimeAluno();
                    menuAluno();

                case 3:
                    if (aluno.getNota1() == -1 || aluno.getNota1() == -1) {
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



}
