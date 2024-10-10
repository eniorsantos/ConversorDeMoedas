package br.ers.modelo;

public class SalvarHist {
    private String exchanger;
    private String conversao;
    private double valor;

    public SalvarHist(){}

    public void sh(String exchanger, String conversao, double valor) {
        this.exchanger = exchanger;
        this.conversao = conversao;
        this.valor = valor;
    }

    public String getExchanger() {
        return exchanger;
    }

    public String getConversao() {
        return conversao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  exchanger +", "+ conversao +", "+ valor ;
    }
}
