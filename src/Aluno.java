import java.util.Scanner;

public class Aluno {

    static Scanner sc = new Scanner(System.in);

    String nome;
    String sobrenome;
    int idade;
    int matricula;
    double nota1 =-1;
    double nota2 =-1;
    double nota3 = 0;

    double mediaP;
    double mediaF;

    public void criaAluno (){
        sc.nextLine();
        System.out.println("-----Cadastro de Aluno-----");

        System.out.println("Informe o nome do aluno");
        nome = sc.nextLine();

        System.out.println("Informe o sobrenome");
        sobrenome = sc.nextLine();

        System.out.println("Informe a idade do aluno");
        idade = sc.nextInt();

        System.out.println("Informe a nota av1");
        nota1 = sc.nextDouble();

        System.out.println("Informe a nota av2");
        nota2 = sc.nextDouble();

        System.out.println("Cadastrado aluno: "+ nome+" "+sobrenome);
    }

    public void imprimeAluno(){
        System.out.println("-----Informações de aluno-----");
        System.out.println("Nome: "+nome+" "+sobrenome+"\nIdade: "+idade+"\nMatricula: "+matricula+"\nNota av1: "+nota1+"\nNota av2: "+nota2+"\nNota av3: "+nota3);
    }

    public void mediaParc(){

        mediaP = (nota1 + nota2)/2;
        System.out.printf("Media parcial do aluno:  %.1f %n",mediaP);

    }

    public void mediaFinal(){

        System.out.println("Informe a nota av3");
        nota3 = sc.nextDouble();

        mediaF = (mediaP + mediaF)/2;
        System.out.printf("Media final do aluno:  %.1f %n",mediaF);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getMediaF() {
        return mediaF;
    }

    public double getMediaP() {
        return mediaP;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
