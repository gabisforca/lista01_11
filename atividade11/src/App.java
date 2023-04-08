import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double numero1;
    double numero2;
    double numeroreal;
    double resolucao1;
    double resolucao2;
    double resolucao3;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    numero1 = teclado.nextDouble();
    System.out.println("Digite um número inteiro:");
    numero2 = teclado.nextDouble();
    System.out.println("Digite um número real:");
    numeroreal = teclado.nextDouble();
    // passo 3: calcular salario
    resolucao1 = (2 * numero1) * (numero2 / 2);
    resolucao2 = (3 * numero1) + (numeroreal);
    resolucao3 = Math.pow(numeroreal, 3);
    // passo 4: exibir salario 
    System.out.println("o produto do dobro do primeiro com metade do segundo: " + resolucao1);
    System.out.println("a soma do triplo do primeiro com o terceiro: " + resolucao2);
    System.out.println("o terceiro elevado ao cubo: " + resolucao3);

  }
}