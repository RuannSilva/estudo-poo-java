package TesteConta;

import java.util.Locale;
import java.util.Scanner;
import Conta.Conta;
import Data.Data;

public class TesteConta {
     
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        Conta contateste = new Conta();

        //QUESTAO 1: CRIANDO REFERENCIA

        contateste.setTitular("Ruann");
        System.out.println(contateste.getDadosConta());
        System.out.println("iguais");
       
        Data data = new Data();
        data.preencherData(1, 12, 2000);
        
        contateste.setDataDeAbertura(data);
        System.out.println(contateste.getDadosConta());
        System.out.println();

        Conta c1 = new Conta();
            c1.setTitular("Minerva");
            c1.setSaldo(100);
            Data data1 = new Data();
            data1.preencherData(1, 7, 2009);
            c1.setDataDeAbertura(data1);
            System.out.println(c1.getDadosConta());
            System.out.println();

        Conta c2 = new Conta();
            c2.setTitular("Danilo");
            c2.setSaldo(100);
            Data data3 = new Data ();
            data.preencherData(1, 4, 2017);
            c2.setDataDeAbertura(data3);

        if ( c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        
        System.out.println();
        System.out.println("Resposta: No primeiro caso, antes de colocarmos a comparação (c1 == c2), a resposta entra no ELSE, onde alega serem diferentes. Isso ocorre pois, apesar de ambas as contas apresentarem os mesmos dados, elas buscam referências diferentes na memória. Quando colocamos a comparação, a resposta entra na comparação IF mesmo mudando o nome do titular. Isso ocorre pois a comparação quer dizer que a conta c1 busca a referência na memória da c2, dessa forma tornando as mesmas iguais.");
        System.out.println();











        sc.close();
    }
}
