package model;

public class Produto {
    String nome;
    Integer preco;
    Data dataValidade;

    public Produto(String nome, Integer preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataVencimento){

        if(dataVencimento.ano > dataValidade.ano){
            return true;
        } else if (dataVencimento.ano == dataValidade.ano && dataVencimento.mes > dataValidade.mes) {
            return true;
        } else if (dataVencimento.ano == dataValidade.ano && dataVencimento.mes == dataValidade.mes && dataVencimento.dia > dataValidade.dia ) {
            return true;
        } else
            return false;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
