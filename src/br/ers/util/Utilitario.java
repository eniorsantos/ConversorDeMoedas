package br.ers.util;

import java.io.InputStream;

import java.util.Properties;

public class Utilitario {
    private static Properties p;
    private static Utilitario config;

    private Utilitario(){
        try {
            if (p == null){
                p = new Properties();
                InputStream in = this.getClass().getResourceAsStream("/dados.properties");
                p.load(in);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Utilitario getInstance(){
        if (config == null){
            config = new Utilitario();
        }
        return config;
    }
    public String getProperty(String key){
        return p.getProperty(key);
    }

}
