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

            System.out.print("Digite a opera��o desejada (+,-,*,/) : ");
            String operacao = Reader.readString();

            System.out.print("Digite o segundo numero: ");
            double segundoNumero = Reader.readDouble();

            switch (operacao) {
                case "*":
                    System.out.println( "Multiplica��o: "+(primeiroNumero * segundoNumero) );
                    break;
                case "+":
                    System.out.println( "Soma: "+(primeiroNumero + segundoNumero) );
                    break;
                case "-":
                    System.out.println( "Subtra��o: "+(primeiroNumero - segundoNumero) );
                    break;
                case "/":
                    System.out.println( "Divis�o: "+(primeiroNumero / segundoNumero) );
                    break;
            }

        }


    }

}
