public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, double metaVendas, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "metaVendas=" + metaVendas +
                '}';
    }
}
