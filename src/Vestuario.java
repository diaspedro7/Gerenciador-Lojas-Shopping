public class Vestuario extends Loja {
    boolean produtosImportados;

    public Vestuario(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                '}';
    }
}
