package entities;

import ch.qos.logback.core.net.LoginAuthenticator;

public class Funcionario extends Pessoa {
    
    private int ctps;
    private String cargo;


    
    public int getCtps() {
        return ctps;
    }
    public void setCtps(int ctps) {
        this.ctps = ctps;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Funcionario(String nome, String dataNascimento, String cpf, String matricula, Endereco endereco,
            Contato contatoEmergencia, Contato contato, int ctps, String cargo) {
        super(nome, dataNascimento, cpf, matricula, endereco, contatoEmergencia, contato);
        this.ctps = ctps;
        this.cargo = cargo;
    }





}
