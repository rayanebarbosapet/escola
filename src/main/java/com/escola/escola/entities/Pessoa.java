package entities;

import enums.Cargo;

public abstract class Pessoa {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String matricula;
    private Endereco endereco;
    private Contato contatoEmergencia;
    private Contato contato;
    private String login;
    private String senha;
    private Cargo cargo;
    
    public Pessoa(String nome, String dataNascimento, String cpf, String matricula,
            Contato contatoEmergencia, Contato contato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = endereco;
        this.contatoEmergencia = contatoEmergencia;
        this.contato = contato;
        this.login = login;
        this.senha = senha;
    }
    
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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Contato getContatoEmergencia() {
        return contatoEmergencia;
    }
    public void setContatoEmergencia(Contato contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }


    
   
    
}
