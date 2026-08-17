import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner ler = new Scanner(System.in);
        
    double num1;
    double num2;
    char operador;
    double resultado;
    char resposta;

    do{
 
    System.out.print("Digite o primeiro numero: ");
    num1 = ler.nextDouble();

    System.out.print("Digite a operacao desejada (+, -, *, /, v para raiz quadrada, p para potencia): ");
    operador = ler.next().charAt(0);
    if(operador != 'v') {
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextDouble();
        }
    else {
        num2 = 0; // Atribui 0 a num2 se a operação for raiz quadrada
    }
    switch(operador){
        
        case '+':
            resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
            break;

        case '-':
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
            break;

        case '*':
            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
            break;

        case '/':
            if(num2 != 0){
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;

        case 'v':
            if(num1 >= 0){
                resultado = Math.sqrt(num1);
                System.out.println("O resultado da raiz quadrada é: " + resultado);
            } else {
                System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
            }
            break;

        case 'p':
            resultado = Math.pow(num1, num2);
            System.out.println("O resultado da potência é: " + resultado);
            break;

        default:
            System.out.println("Operação inválida.");
    }
    System.out.println("Deseja realizar outra operação? (s/n)");
     resposta = ler.next().charAt(0);
    }while(resposta == 's' || resposta == 'S');
    System.out.println("Obrigado por utilizar a calculadora!");
    }

    }