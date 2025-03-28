import java.util.Scanner;

public class examen2 {
   public static void main(String[] args) {
    
    Scanner entrade = new Scanner(System.in);
    System.out.println("x + 2x, valor de x:");
    double entradaA = entrade.nextDouble(); 

    double resultado = entradaA + entradaA*2;
    System.out.println("El resultado de la ecuación es:"+resultado);
    
    Scanner entradaC = new Scanner(System.in);
    System.out.print("x2-3x, valor de x:");
    double c = entradaC.nextDouble();

    double resultados = c*2 - (3*c);
    
    System.out.println("El resultado de la ecuación es:" + resultado);
    
    Scanner entradaE = new Scanner(System.in);
    System.out.print("(a + b + c)/3");
    System.out.println("");
    Scanner entradaF = new Scanner(System.in);
    System.out.println("Valor de a:");
    double F = entradaE.nextDouble();
    Scanner entradaG = new Scanner(System.in);
    System.out.println("Valor de b:");
    double G = entradaG.nextDouble();
    Scanner entradaH = new Scanner(System.in);
    System.out.println("Valor de C");
    double H = entradaH.nextDouble();

    double resultadoo = (F + G + H)/ 3;
    System.out.println("El resultado de la ecuación es:"+resultadoo);
    
    Scanner entradaI = new Scanner(System.in);
    System.out.println("x^2 + 2(x+1)");
    System.out.println("");
    Scanner entradaJ = new Scanner(System.in);
    System.out.println("Valor de x:");
    double J = entradaJ.nextDouble();
    double resultadoos = (J*J)+2*J+1;
    System.out.println("El resutaldo de la ecuación es:"+ resultadoos);   
   }
}
