package br.ers.calculo;

import br.ers.conexao.ConexaoHttp;
import br.ers.modelo.Moeda;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;

public class Conversao {

    Operacao opec = new Operacao();
    Gson gson = new Gson();
    ConexaoHttp ch = new ConexaoHttp();

    public double Converte_1(String moeda, String conversor, double quantidade) throws IOException, InterruptedException {

        String json = ch.conexaoHttp(moeda);
        Moeda conversionRates = gson.fromJson(json, Moeda.class);

        for (Map.Entry<String, Double> entry : conversionRates.getConversion_rates().entrySet()) {
            if(conversor.equals(entry.getKey())){
                double v = entry.getValue();
                return v * quantidade;

            }
        }
        return 0;
    }


    public double Converte_2(String moeda, String conversor, double quantidade) throws IOException, InterruptedException {

        String json = ch.conexaoHttp(moeda);
        Moeda conversionRates = gson.fromJson(json, Moeda.class);

        for (Map.Entry<String, Double> entry : conversionRates.getConversion_rates().entrySet()) {
            if(conversor.equals(entry.getKey())){
                double v = entry.getValue();
                return quantidade / v;

            }
        }
        return 0;
    }
}
