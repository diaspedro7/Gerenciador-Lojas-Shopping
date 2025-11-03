package model;

public class Loja {
    String nome;
    Integer quantidadeFuncionarios;
    Integer salarioBaseFuncionario;
    Endereco endereco;
    Data dataFundacao;



    public Loja(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario, Endereco endereco, Data data) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.nome = nome;
        this.endereco = endereco;
        this.dataFundacao = data;
    }

    public Loja(String nome, Integer quantidadeFuncionarios, Endereco endereco, Data data) {
        this(nome, quantidadeFuncionarios, -1, endereco, data);
    }

    //### Metodos

    public Integer gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return 1;
        }
        else{
        Integer gastosSalario = quantidadeFuncionarios * salarioBaseFuncionario;
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

    public Integer getSalarioBaseFuncionario() {
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


    //### Metodo ToString


    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                '}';
    }
}
