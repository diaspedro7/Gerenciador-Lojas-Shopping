public class Loja {
    String nome;
    Integer quantidadeFuncionarios;
    Double salarioBaseFuncionario;

    public Loja(Double salarioBaseFuncionario, Integer quantidadeFuncionarios, String nome) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.nome = nome;
    }

    public void LojaComSalarioPadrao(Integer quantidadeFuncionarios, String nome) {
        this.salarioBaseFuncionario = -1.0;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.nome = nome;
    }

    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1.0){
            return 1.0;
        }
        else{
        Double gastosSalario = quantidadeFuncionarios * salarioBaseFuncionario;
        return gastosSalario;
    }}


    public String tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return "P";
        } else if (quantidadeFuncionarios <= 30) {
            return "M";
        } else{
            return "G";
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

    public Double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(Double salarioBaseFuncionario) {
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
