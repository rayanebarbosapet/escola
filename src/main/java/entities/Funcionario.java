package entities;

import ch.qos.logback.core.net.LoginAuthenticator;
import enums.Cargo;

public class Funcionario extends Pessoa {
    
    private int ctps;
    
    public Funcionario(String nome, String dataNascimento, String cpf, String matricula, Contato contatoEmergencia,
            Contato contato, int ctps) {
        super(nome, dataNascimento, cpf, matricula, contatoEmergencia, contato);
        this.ctps = ctps;
    }
    public int getCtps() {
        return ctps;
    }
    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

  





}
