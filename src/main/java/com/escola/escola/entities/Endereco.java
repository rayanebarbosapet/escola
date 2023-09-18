package entities;

import org.springframework.expression.spel.CodeFlow.ClinitAdder;

public class Endereco {
    
    private String Rua;
    private int  numero;
    private String bairro;
    private String complemento;
    private int cep;
    private String cidade;
    private String uf;
    private String pais;


    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Endereco(String rua, int numero, String bairro, String complemento, int cep, String cidade, String uf,
            String pais) {
                        Rua = rua;
                        
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }

}
