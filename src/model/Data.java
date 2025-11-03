package model;

import java.time.LocalDate;
import java.util.Map;

public class Data {
    int dia;
    int mes;
    int ano;

    //TODO: Melhorar isso daqui
    public Data(int dia, int mes, int ano) {
    boolean validacaoData = dataValida(dia, mes, ano);
    if(validacaoData){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    else{
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
        System.out.println("A data inserida é inválida. model.Data ficou salva como a data padrão 1/1/2000");
    }}

    public boolean dataValida(int dia, int mes, int ano){
        boolean validaDia = validacaoDia(dia);
        boolean validaMes = validacaoMes(mes);
        boolean validaAno = validacaoAno(ano);
        boolean validaDiaPorMes = validacaoDiaMes(dia, mes);
        boolean validaFevBissexto = validacaoFevBissexto(dia, mes, ano);

        return validaDia && validaMes && validaAno && validaDiaPorMes && validaFevBissexto;
    }

    public boolean validacaoAno(int ano){
        int anoAtual = LocalDate.now().getYear();
        if (ano >= 1800 && ano <= anoAtual) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validacaoDia(int dia){
        if (dia >= 1 && dia <= 31) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validacaoMes(int mes){
        if (mes >= 1 && mes <= 12) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validacaoDiaMes(int dia, int mes){
        Map<Integer, Integer> diasPorMes = Map.ofEntries(
                Map.entry(1, 31),
                Map.entry(2,  29),
                Map.entry(3, 31),
                Map.entry(4, 30),
                Map.entry(5, 31),
                Map.entry(6, 30),
                Map.entry(7, 31),
                Map.entry(8, 31),
                Map.entry(9, 30),
                Map.entry(10, 31),
                Map.entry(11, 30),
                Map.entry(12, 31)
        );

        Integer tamMes = diasPorMes.get(mes);
        if(tamMes == null || dia < 1 || dia > tamMes){
            return false;
        }
        else
            return true;
    }

    public boolean validacaoFevBissexto(int dia, int mes, int ano){
        if (mes == 2 && dia >= 29 && ano % 4 != 0 && !(ano % 100 != 0 || ano % 400 == 0)) {
            return false;
        }
        return true;
    }

    public boolean verificaAnoBissexto(){
        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        }
        else
            return false;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "model.Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
