package View;

import model.Data;
import model.Endereco;
import model.Loja;
import model.Produto;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenu(){
        while(true) {
            try{
            System.out.println("\n====================");
            System.out.println("       MENU         ");
            System.out.println("====================");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite: ");

            int digito = scanner.nextInt();

            switch (digito) {

                case 1:
                    Loja loja = criarLoja();
                    System.out.println(loja);
                    break;
                case 2:
                    Produto produto = criarProduto();
                    System.out.println(produto);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção Inválida");
            }
            } catch (Exception e) {
                System.out.println("Inserção inválida. Tente novamente");
                scanner.nextLine();
            }
        }
    }

    Loja criarLoja(){
        while(true) {
            try{
                scanner.nextLine();
                System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();
        System.out.print("Digite a quantidade de funcionários: ");
        Integer qtdFuncionarios = scanner.nextInt();
        System.out.print("Digite o salário base dos funcionários (opcional): ");
        Integer salarioBase = scanner.nextInt();

        System.out.println("Digite o endereço da loja.");
                scanner.nextLine();
    System.out.print("Nome da Rua: ");
        String ruaEndereco = scanner.nextLine();
    System.out.print("Cidade: ");
        String cidadeEndereco = scanner.nextLine();
    System.out.print("estado: ");
        String estadoEndereco = scanner.nextLine();
    System.out.print("País: ");
        String paisEndereco = scanner.nextLine();
    System.out.print("CEP: ");
        String cepEndereco = scanner.nextLine();
    System.out.print("Número: ");
        String numeroEndereco = scanner.nextLine();
    System.out.print("Complemento: ");
        String complementoEndereco = scanner.nextLine();


        System.out.println("Digite a data de fundação da loja.");
        System.out.print("Dia: ");
        Integer diaData = scanner.nextInt();
        System.out.print("Mês: ");
        Integer mesData = scanner.nextInt();
        System.out.print("Ano: ");
        Integer anoData = scanner.nextInt();

        return new Loja(nomeLoja, qtdFuncionarios, salarioBase, new Endereco(ruaEndereco, cidadeEndereco, estadoEndereco, paisEndereco, cepEndereco, numeroEndereco, complementoEndereco), new Data(diaData, mesData, anoData));
    }
catch (Exception e){
    System.out.println("Inserção inválida. Tente novamente");
}
        }}

    public Produto criarProduto(){
        while(true) {
            try{
                scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        Integer precoProduto = scanner.nextInt();

        System.out.println("Digite a data de validade. ");
        System.out.print("Dia: ");
        Integer diaValidade = scanner.nextInt();
        System.out.print("Mês: ");
        Integer mesValidade = scanner.nextInt();
        System.out.print("Ano: ");
        Integer anoValidade = scanner.nextInt();

        return new Produto(nomeProduto, precoProduto, new Data(diaValidade, mesValidade, anoValidade));
    }catch (Exception e){
                System.out.println("Inserção inválida. Tente novamente");
            }
        }}

}
