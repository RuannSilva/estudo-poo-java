package Conta;
import Data.Data;
public class Conta {
    
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;

    public void conta () {

    }

    public String Conta (String titular) {
        return this.titular = titular;
    }

    public void setDataDeAbertura (Data dataDeAbetura) {
        this.dataDeAbertura = dataDeAbetura;
    }

     public void setPrencherData(Data dataDeAbertura){
        this.dataDeAbertura = dataDeAbertura;
    }
    

    public void setTitular (String titular) {
        this.titular = titular;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void saca (double valor) {
        this.saldo -= valor;
    }

    public void deposita (double valor) {
        this.saldo += valor;
    }

    public double calcularRendimento () {
        return this.saldo * 0.1;
    }

    public String getDadosConta (){
        String dados = "\nTitular: " + this.titular
                     + "\nNumero: " + this.numero
                     + "\nAgencia: " + this.agencia
                     + "\nSaldo: " + this.saldo
                     + "\nData de Abertura: " + (this.dataDeAbertura != null ? this.dataDeAbertura.dataFormatada() : "Não informada");
        return dados;
    }
}
