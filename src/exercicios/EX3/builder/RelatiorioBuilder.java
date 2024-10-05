package exercicios.EX3.builder;

import exercicios.EX3.entities.Relatorio;

public class RelatiorioBuilder {

    private Relatorio relatorio = new Relatorio();

    public RelatiorioBuilder setTitulo(String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }

    public RelatiorioBuilder setCorpo(String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }

    public RelatiorioBuilder setRodape(String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build(){
        return this.relatorio;
    }
}
