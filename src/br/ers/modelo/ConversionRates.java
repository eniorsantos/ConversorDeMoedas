package br.ers.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ConversionRates {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversion_rates;

    // Getters e Setters
    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}