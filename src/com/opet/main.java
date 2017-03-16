package com.opet;

import com.opet.util.Reader;
public class main
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        while(true) {
            System.out.print("Digite o primeiro numero: ");
            double primeiroNumero = Reader.readDouble();

            System.out.print("Digite a operação desejada (+,-,*,/) : ");
            String operacao = Reader.readString();

            System.out.print("Digite o segundo numero: ");
            double segundoNumero = Reader.readDouble();

            switch (operacao) {
                case "*":
                    System.out.println( "Multiplicação: "+(primeiroNumero * segundoNumero) );
                    break;
                case "+":
                    System.out.println( "Soma: "+(primeiroNumero + segundoNumero) );
                    break;
                case "-":
                    System.out.println( "Subtração: "+(primeiroNumero - segundoNumero) );
                    break;
                case "/":
                    System.out.println( "Divisão: "+(primeiroNumero / segundoNumero) );
                    break;
            }

        }


    }

}
