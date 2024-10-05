package exercicios.EX2.builders;

import exercicios.EX2.entities.Veiculo;

public class VeiculoBuilder {
    private String tipo;
    private String cor;
    private int quantidade;

    private Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(int quantidade){
        this.veiculo.setRodas(quantidade);
        return this;
    }

    public Veiculo build(){
        return this.veiculo;
    }
}
