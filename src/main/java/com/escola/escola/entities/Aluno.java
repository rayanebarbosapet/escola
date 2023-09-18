package entities;

public class Aluno extends Pessoa {
    
    private double nota1;
    private double nota2; 
    private double media; 
    private double nota3;
   
    public Aluno(String nome, String dataNascimento, String cpf, String matricula, Contato contatoEmergencia, Contato contato,
                double nota1, double nota2, double media, double nota3) {
        super(nome, dataNascimento, cpf, matricula, contatoEmergencia, contato);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.nota3 = nota3;
    }

    
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }



    
}
