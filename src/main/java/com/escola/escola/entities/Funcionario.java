package com.escola.escola.entities;



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
    @Override
    public void fazerLogin() {
        String login = "";
        String senha = "";
        String loginDigitado = "";
        String senhaDigitada = "";

        if(login.equals(loginDigitado) && senha.equals(senhaDigitada)){
            System.out.println("Login Realizado com sucesso");
        } else if (!login.equals(loginDigitado) && !senha.equals(senhaDigitada)){
            System.out.println("Tanto o login, quanto a senha estão incorretos.");
            
        } else if (senhaDigitada != senha){
            System.out.println("Senha incorreta.");
        } else if (!loginDigitado.equals(login)){
            System.out.println("Login incorreta.");
        }
    }
    @Override
    public void criarCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarCadastro'");
    }
    @Override
    public void mostrarCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarCadastro'");
    }
    @Override
    public void listarCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarCadastro'");
    }

  





}
