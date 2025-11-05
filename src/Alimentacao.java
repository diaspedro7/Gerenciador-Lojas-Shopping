public class Alimentacao extends Loja {
    Data dataAlvara;

    public Alimentacao(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeProdutos );
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao{" +
                "dataAlvara=" + dataAlvara +
                '}';
    }
}
