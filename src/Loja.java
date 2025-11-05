import java.util.Arrays;

public class Loja {
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    Endereco endereco;
    Data dataFundacao;
    Produto[] estoqueProdutos;
    int quantidadeProdutos = 0;


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, int capacidadeProdutos) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.nome = nome;
        this.endereco = endereco;
        this.dataFundacao = data;
        this.estoqueProdutos = new Produto[capacidadeProdutos];
    }

    public Loja(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data, int capacidadeProdutos) {
        this(nome, quantidadeFuncionarios, -1, endereco, data, capacidadeProdutos);
    }


    //### Metodos
    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return 1;
        }
        else{
            double gastosSalario = quantidadeFuncionarios * salarioBaseFuncionario;
        return gastosSalario;
    }}


    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else{
            return 'G';
        }
    }

    //###CRUD
    public void imprimeProdutos(){
        for(int i = 0; i< estoqueProdutos.length; i++){
            System.out.println(estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto novoProduto){
        if(quantidadeProdutos < estoqueProdutos.length){
            estoqueProdutos[quantidadeProdutos] = novoProduto;
    quantidadeProdutos++;
    return true;
        }
        else {
            return false;
        }
    }
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){

                // Desloca os elementos para tras ao atribuir o valor do elemento seguinte
                for (int j = i; j < estoqueProdutos.length - 1; j++) {
                    estoqueProdutos[j] = estoqueProdutos[j + 1];
                }
                estoqueProdutos[estoqueProdutos.length - 1] = null;
                quantidadeProdutos--;
            return true;
            }
        }
        return false;
    }

    //### Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(Integer salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        System.out.println(endereco);
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        System.out.println(dataFundacao);
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    //### Metodo ToString
    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) +
                '}';
    }

}
