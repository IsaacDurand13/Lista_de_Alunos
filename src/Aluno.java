public class Aluno {

    String nome;
    String sobrenome;
    int idade;
    int matricula;
    double nota1 =-1;
    double nota2 =-1;
    double nota3 =-1;

    double mediaP;
    double mediaF;

    public double mediaParc(){

        mediaP = (nota1 + nota2)/2;
        System.out.printf("Media parcial do aluno:  %.1f %n",mediaP);

        return mediaP;
    }

    public double mediaFinal(){

        mediaF = (mediaP + nota3)/2;
        System.out.printf("Media final do aluno:  %.1f %n",mediaF);

        return mediaF;
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

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setMediaP(double mediaP) {
        this.mediaP = mediaP;
    }

    public void setMediaF(double mediaF) {
        this.mediaF = mediaF;
    }
}
