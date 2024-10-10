package br.ers.menu;

import br.ers.calculo.Conversao;
import br.ers.modelo.SalvarHist;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu  {

    public Menu() {
    }

    Scanner sc = new Scanner(System.in);
    Conversao cn = new Conversao();
    SalvarHist sh = new SalvarHist();
    List<String> sh_list = new ArrayList<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();;



    public void iniciar() throws IOException, InterruptedException {
        boolean controle = true;
        String exchanger = "";
        double total = 0;

        try {
            while (controle) {

                System.out.println("----------------------------------");
                System.out.println("  Iniciando Conversor de Moedas ");
                System.out.println("----------------------------------");
                System.out.println("Opções de conversão:\n");
                System.out.println(" 1 - Dolar(USD) para Real(BRL).");
                System.out.println(" 2 - Real(BRL) para Dolar(USD).");
                System.out.println(" 3 - Euro(EUR) para Real(BRL).");
                System.out.println(" 4 - Real(BRL) para Euro(EUR)");
                System.out.println(" 5 - Libra(GBP) para Real(BRL)");
                System.out.println(" 6 - Real(BRL) para Libra(GBP)");
                System.out.println(" 7 - Sair.");
                System.out.println("----------------------------------");
                System.out.print("Digite a opção desejada:");

                double valor = 0;
                String conversao = "";
                int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Escolheu 1");
                        exchanger = "USD";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_1(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [BRL]");
                        sh.sh(exchanger,conversao,total);
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 2:
                        System.out.println("Escolheu 2");
                        exchanger = "USD";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_2(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [USD]");
                        sh.sh(conversao, exchanger,total);
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 3:
                        System.out.println("Escolheu 3");
                        exchanger = "EUR";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_1(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [BRL]");
                        sh.sh(exchanger,conversao,total );
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 4:
                        System.out.println("Escolheu 4");
                        exchanger = "EUR";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_2(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [EUR]");
                        sh.sh(conversao,exchanger,total );
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 5:
                        System.out.println("Escolheu 5");
                        exchanger = "GBP";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_1(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [BRL]");
                        sh.sh(exchanger,conversao,total );
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 6:
                        System.out.println("Escolheu 6");
                        exchanger = "GBP";
                        System.out.print("Digite o valor a converter com use virgula para separar: ");
                        valor = sc.nextDouble();
                        conversao = "BRL";
                        System.out.println("Total Final:");
                        total = cn.Converte_2(exchanger, conversao, valor);
                        System.out.println("Total da conversão "+ total + " [GBP]");
                        sh.sh(conversao,exchanger,total);
                        sh_list.add(String.valueOf(sh));
                        break;
                    case 7:
                        controle = false;
                        //sh_list.forEach(System.out::println);
                        String json = gson.toJson(sh_list);
                        FileWriter escrita = new FileWriter("historico.json");
                        escrita.write(gson.toJson(json));
                        escrita.close();
                        System.out.println(json);

                        break;
                }

            }
        }catch(InputMismatchException e){
            System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            Menu menu = new Menu();
            menu.iniciar();

        }

    }


}
