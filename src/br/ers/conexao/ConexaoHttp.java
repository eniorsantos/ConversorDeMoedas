package br.ers.conexao;

import br.ers.util.Utilitario;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoHttp {

    private String moeda;


    public ConexaoHttp(){
    }

    public String conexaoHttp(String moeda) throws IOException, InterruptedException {

        this.moeda = moeda;

        Utilitario instancia = Utilitario.getInstance();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + instancia.getProperty("prod.dados.api")+"/latest/"+this.moeda))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}