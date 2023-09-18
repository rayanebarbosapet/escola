package entities;

import org.springframework.core.io.support.EncodedResource;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

public abstract class Pessoa {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String matricula;
    private String endereco;
    private int telefone;
    private String email;
    private String contatoEmergencia;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContatoEmergencia() {
        return contatoEmergencia;
    }
    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }
    public Pessoa(String nome, String dataNascimento, String cpf, String matricula, String endereco, int telefone,
            String email, String contatoEmergencia) {
                
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contatoEmergencia = contatoEmergencia;
    }


    
}
