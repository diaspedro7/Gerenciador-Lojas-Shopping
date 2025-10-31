public class Loja {
    String nome;
    Integer quantidadeFuncionarios;
    Integer salarioBaseFuncionario;

    public Loja(String nome, Integer quantidadeFuncionarios, Integer salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.nome = nome;
    }

    public Loja(String nome, Integer quantidadeFuncionarios) {
        this(nome, quantidadeFuncionarios, -1);
    }

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

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                '}';
    }
}
