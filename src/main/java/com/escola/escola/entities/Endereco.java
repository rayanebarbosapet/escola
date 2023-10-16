package com.escola.escola.entities;

import com.escola.escola.enums.Uf;

import lombok.Data;

import java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

@Data

public class Endereco {
  static  Scanner sc = new Scanner(System.in);

    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String localidade;
    private String uf;
    private String pais;

    public static Endereco getEnderecoByCep(String cep) {
        Endereco endereco = new Endereco();

        // Mandar o cep para o viaCep
        HttpGet request = new HttpGet("https://viacep.com.br/ws/" + cep + "/json/");
        try (
                CloseableHttpClient httpClient = HttpClientBuilder.create().build();
                CloseableHttpResponse response = httpClient.execute(request);) {

            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
           // System.out.println(result);

            Gson gson = new Gson();
            endereco = gson.fromJson(result, Endereco.class);
          //  endereco.setComplemento(null);
          //  System.out.println(endereco);
            System.out.println(endereco);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Tratar a resposta do via cep

        // montar o meu Endereco endereco

        return endereco;
    }
}
