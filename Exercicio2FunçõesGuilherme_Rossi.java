package algoritimos.modulariação.funções;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio2FunçõesGuilherme_Rossi {

    //2.Crie uma função chamada solicita_texto que peça ao usuário uma String e retorne o valor informado desde que tenha mais do que 5 caracteres.
    //Caso o texto tenha menos caracteres, informe “Palavra muito pequena”. 
    //Depois, no corpo do programa crie um vetor de 5 posições de Strings chamado frutas e use a função para preenchê-lo.
    public static void main(String[] args) {
        String fruta[] = new String[5];
        Scanner s = new Scanner(System.in);
        String texto;

        for (int i = 0; i < fruta.length; i++) {

            System.out.println("Informe a Fruta:");
            texto = s.nextLine();

            fruta[i] = Solicita_texto(texto);

        }

    }

    public static String Solicita_texto(String texto) {

        if (texto.length() >= 5) {
            return texto;
        } else {

            System.out.println("digite um texto maior!!");
            return texto;
        }

    }

}
