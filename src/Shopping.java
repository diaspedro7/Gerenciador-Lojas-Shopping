import java.util.Arrays;
import java.util.Set;

public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;
    int quantidadeLojas = 0; //Variavel auxiliar

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }


    //### Metodos

    public boolean insereLoja(Loja novaLoja){
        if( quantidadeLojas < lojas.length){
            lojas[quantidadeLojas] = novaLoja;
            quantidadeLojas++;
            return true;
        }
        else{
        return false;
        }
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){

                // Desloca os elementos para tras ao atribuir o valor do elemento seguinte
                for (int j = i; j < lojas.length - 1; j++) {
                    lojas[j] = lojas[j + 1];
                }
                lojas[lojas.length - 1] = null;
                quantidadeLojas--;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String nomeTipoLoja){

        int quantidadeLojas = 0;
        for (int i = 0; i < lojas.length; i++){
            switch (nomeTipoLoja.toLowerCase()) {
                case "cosmético":
                case "cosmetico":
                    if (lojas[i] instanceof Cosmetico) quantidadeLojas++;
                    break;
                case "vestuário":
                case "vestuario":
                    if (lojas[i] instanceof Vestuario) quantidadeLojas++;
                    break;
                case "bijuteria":
                    if (lojas[i] instanceof Bijuteria) quantidadeLojas++;
                    break;
                case "alimentação":
                case "alimentacao":
                    if (lojas[i] instanceof Alimentacao) quantidadeLojas++;
                    break;
                case "informática":
                case "informatica":
                    if (lojas[i] instanceof Informatica) quantidadeLojas++;
                    break;
                default:
                    return -1;

        }


    }
        return quantidadeLojas;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCara = null;
        double valorSeguroMaisCaro = -1;

        for (int i = 0; i < lojas.length; i++){
            if(lojas[i] instanceof Informatica){
                Informatica lojaInformatica = (Informatica) lojas[i];
                if(lojaInformatica.getSeguroEletronicos() > valorSeguroMaisCaro){
                    lojaMaisCara = lojaInformatica;
                    valorSeguroMaisCaro = lojaInformatica.getSeguroEletronicos();
                }
            }
        }
        return lojaMaisCara;

    }



    //### Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] listaLojas) {
        this.lojas = listaLojas;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", listaLojas=" + Arrays.toString(lojas) +
                '}';
    }
}
