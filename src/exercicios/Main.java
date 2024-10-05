package exercicios;

import exercicios.EX1.builder.PizzaBuilder;
import exercicios.EX1.entities.Pizza;
import exercicios.EX2.builders.VeiculoBuilder;
import exercicios.EX2.entities.Veiculo;
import exercicios.EX3.builder.RelatiorioBuilder;
import exercicios.EX3.entities.Relatorio;


public class Main {
    public static void main(String[] args) {
        System.out.println("Executando pizza");
        executarPizza();
        System.out.println("Executando Veiculo");
        executarVeiculo();
        System.out.println("Executando Relatório");
        executarRelatorio();
    }

    private static void executarPizza(){
        Pizza portuguesa = new PizzaBuilder()
                .setMassa("Massa Siciliana")
                .setTamanho("Média")
                .setIngrediente("Peperoni")
                .build();

        System.out.println(portuguesa.toString());

    }

    private static void executarVeiculo(){
        Veiculo corsa = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Vermelho")
                .setRodas(4)
                .build();

        System.out.println(corsa.toString());
    }

    private static void executarRelatorio(){
        Relatorio relatorio = new RelatiorioBuilder()
                .setTitulo("Corsa")
                .setCorpo("É")
                .setRodape("O Melhor lol")
                .build();

        System.out.println(relatorio.toString());


    }
}