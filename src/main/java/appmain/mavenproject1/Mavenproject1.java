/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package appmain.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Wanderlei Silva do Carmmo <wander.silva@gmail.com>
 * Considere neste programa os comentários: // para comentários de apenas uma
 * linh \/* *\/ para comentários em múltiplas linhas \/** *\/ - para comentários
 * heredoc
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        //lacoFor();
        lacoWhile();

        System.exit(0);
        //Imprime na tela uma string
        System.out.println("Como capturar entrada de usuário a partir da entrada padrã!");
        System.out.println("A entrada padrão é o teclado, se nada for referenciado ao contrário");

        //A correlação em Java para ?Leia e Escreva em Portugol:
        // Escreva => System.out.println("A mensagem entre aspas");
        // Leia => A classe scanner é utilizada para ler a entrada padrão 
        //Informar ao scanner que quer receber um valor de algum tipo
        //a partir da entrada padrão
        System.out.println("Entre com um número inteiro: ");
        var scanner = new Scanner(System.in);

        //Capturar um número inteiro
        int i = scanner.nextInt();

        //Capturar um numero em ponto flutuante
        System.out.println("Entre com um número em ponto flutuante: ");
        scanner = new Scanner(System.in);
        float f = Float.parseFloat(scanner.next());

        //Capturar um número em ponto flutuante de dupla precisão
        System.out.println("Entre com um número em ponto flutuante com dupla precisão: ");
        scanner = new Scanner(System.in);
        double d = Double.parseDouble(scanner.next());

        //Capturar um caractere ou byte
        System.out.println("Entre com um valor que ocupe no náximo 1 byte na memória RAM");
        scanner = new Scanner(System.in);
        byte c = Byte.parseByte(scanner.next());

        System.out.println("Entre com um texto, uma palavra ou uma frase: ");
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("Entre 1 ou 0: ");
        scanner = new Scanner(System.in);
        boolean b = Boolean.parseBoolean(scanner.next());

        //Vamos exibir as entradas...
        System.out.println("Valores informados pela entrada padrão");
        System.out.println("======================================");
        System.out.println("Número inteiro (int):" + i);
        System.out.println("Número em ponto flutuante(float):" + f);
        System.out.println("Número com dupla precisão (double):" + d);
        System.out.println("Caractere (char):" + c);
        System.out.println("Cadeia de caracteres (String):" + s);
        System.out.println("Valor lógico (Boolean):" + i);
        System.out.println("=======================================");

        //maioridade
        maioridade();
    }

    /**
     * Estuda das estruturas condicionais if..else..elseif...
     */
    public static void maioridade() {
        //VAmos ver como utilizar estruturas condicionais em java...
        //O clássico if... else...
        var scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        var idade = Integer.parseInt(scanner.next());

        //se idade maior ou igual a 18.. escreva "maior de idade senão escreva "menor de idade".".
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.print("Menor de idade");
        }

        //agora vamos ver como fica a estrura composta if..else.. else if...
        //Queremos saber a faixa etária em que a idade está.
        var faixaEtaria = "";

        if (idade < 1 && idade > 120) {
            faixaEtaria = "Sua idade deve estar entre 1 e 120 anos";
        } else if (idade >= 1 && idade <= 12) {
            faixaEtaria = "criança";
        } else if (idade > 12 && idade < 18) {
            faixaEtaria = "adolescente";
        } else if (idade >= 18 && idade < 60) {
            faixaEtaria = "adulto";
        } else if (idade >= 60) {
            faixaEtaria = "idoso";
        } else {
            //Use este else apenas se você quiser uma 
            //saída padrão caso o usuário não entre com as opções esperadas.
            faixaEtaria = "";
        }

        //faixaEtaria
        faixaEtaria2(idade);
    }

    public static String retornaFaixaEtaria(int idade) {
        //VAmos ver como utilizar estruturas condicionais em java...
        //O clássico if... else...
        System.out.println("Qual a sua idade? ");

        //se idade maior ou igual a 18.. escreva "maior de idade senão escreva "menor de idade".".
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.print("Menor de idade");
        }

        //agora vamos ver como fica a estrura composta if..else.. else if...
        //Queremos saber a faixa etária em que a idade está.
        var faixaEtaria = "inválida";

        if (idade < 1 && idade > 120) {
            faixaEtaria = "Sua idade deve estar entre 1 e 120 anos";
        } else if (idade >= 1 && idade <= 12) {
            faixaEtaria = "criança";
        } else if (idade > 12 && idade < 18) {
            faixaEtaria = "adolescente";
        } else if (idade >= 18 && idade < 60) {
            faixaEtaria = "adulto";
        } else if (idade >= 60) {
            faixaEtaria = "idoso";
        } else {
            //Use este else apenas se você quiser uma 
            //saída padrão caso o usuário não entre com as opções esperadas.
            faixaEtaria = "inválida";
        }

        return faixaEtaria;
    }

    /**
     * Estudo da estrutura condicional switch
     */
    public static void faixaEtaria2(int idade) {

        var faixaEtaria = retornaFaixaEtaria(idade);
        //sim, podemos usar operadores ternarios aqui...
        boolean idadeInvalida = idade < 1 || idade > 120;

        if (!idadeInvalida) {
            switch (faixaEtaria) {
                //case  -> System.out.println("faixa de idade não permitida"); 
                case "criança" ->
                    System.out.println("Infância//criança é  uma fase de descobertas...");
                case "adolescente" ->
                    System.out.println("adoloscencia é  uma fase que não se preocupa com nada, tudo gira em torno dela");
                case "adulto" ->
                    System.out.println("A fase adulta é a fase da responsabilidade.");
                case "idoso" ->
                    System.out.println("Nesta fase o ser humano compartilha suas experiências adquiridades nas fases anterioros");
                default ->
                    System.out.println("A idade não está em uma faixa etária válida.");
            }
        }
    }

    /**
     * Estudo dos laços de repetição
     *
     */
    public static void lacoFor() {
        System.out.println("Contando de 1 até 9");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor da iteração: " + i);
        }
        //ou ainda,,,
        System.out.println("USando o break para quebrar o laço de acordo com uma ou mais condições");
        for (int i = 0;; i++) {
            if (i > 100) {
                break;
            }
        }
        //ou ainda usando o continue...
        System.out.println("Usando o continue...");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println("Valor da iteração:" + i);
            }
        }
    }

    public static void lacoWhile() {

        int i = 0;

        //Contagem crescente... progressiva.
        System.out.println("Contagem progressiva até 99");
        while (i < 100) {
            System.out.println("Valor da iteração: " + i);
            i++;
        }

        //contagem decrescente... regressiva.
        System.out.println("Contagem regressiva de 100 a 0");
        i = 100;
        while (i >= 0) {
            System.out.println("Valor da iteração: " + i);
            i--;  //ou i=i - 1;
        }

        //ou ainda...
        //Quebrar o laço de acordo com uma condição
        System.out.println("Saia do laço se satisfizer a condição");
        i = 0;
        while (true) {

            if (i > 10) {
                break;
            } else {
                System.out.println("Valor da iteração: " + i);
            }
            i++;
        }

        //pular algumas iterações de acordo com uma condição
        System.out.println("Pulando número impares...");
        i = 1;
        while (true) {

            
            if (i > 100) {
                break;
            } else {

                if ( i % 2 == 0) {
                   System.out.println("Valor da iteração: " + i);
                    
                }
            }
            
            i++;
        }
        
        ///
        //do {
        //   testar condição no final do laço...
        //} while( i < 100);
    }
    
    public static void arrays(){
        
        int[] num = { 10,20,30,40};
        float[] f = {1.2f, 2.5f, 5.2f, 10.2f};
        double[] d = {1.45245, 6.536534};
        long[] l = { 134565798765408765L, 5678909876546789L};
        //...
        
        String[] frutas = { "banana", "maçã", "uva", "limão" };
        //ou
        String[] frutas2 = new String[4];
        
        frutas2[0] = "Limão";
        frutas2[0] = "Abacate";
        frutas2[0] = "Cereja";
        frutas2[0] = "Melão";
        
        //usando laço para percorrer os vetores...
        for(String s: frutas){
            System.out.println("Fruta " + s);
        }
        
        //frutas[0] = "fdasfas";
    }
}
