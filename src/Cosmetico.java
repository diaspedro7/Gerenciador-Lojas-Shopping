public class Cosmetico extends Loja {
    double taxaComercializacao;

    public Cosmetico(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, double taxaComercializacao, int quantidadeProdutos ){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
