package entities;

public class Professor extends Funcionario{
    
       private double desempenho;
    // interface metodo do professor
    // construtor professor
   
    public Professor(String nome, String dataNascimento, String cpf, String matricula, Contato contatoEmergencia,
            Contato contato, int ctps, double desempenho) {
        super(nome, dataNascimento, cpf, matricula, contatoEmergencia, contato, ctps);
        this.desempenho = desempenho;
    }


     
    
   // metodos get e set
    public double getDesempenho() {
        return desempenho;
    }


    public void setDesempenho(double desempenho) {
        this.desempenho = desempenho;
    }

}

