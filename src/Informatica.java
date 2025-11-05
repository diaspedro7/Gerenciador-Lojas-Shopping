public class Informatica extends Loja {
    double seguroEletronicos;

    public Informatica(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, double seguroEletronicos, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
