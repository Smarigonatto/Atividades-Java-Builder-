package exercicios.EX2.entities;

public class Veiculo {

    private String tipo;
    private String cor;
    private int quantidade;

    public Veiculo setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Veiculo setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Veiculo setRodas(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Veiculo build(){
        return this;
    }

    @Override
    public String toString(){
        return "Veiculo{" +
                "Tipo de Veículo='" + tipo + '\'' +
                ", Cor do Veículo='" + cor + '\'' +
                ", Quantidade de rodas='" + quantidade + '\'' +
                '}';
    }
}
