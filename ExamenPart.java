import java.util.Scanner;

public class ExamenPart {
    public static void main(String[] args) {
      Scanner examen = new Scanner(System.in);
        int opcion = -1; 
        do{
            System.out.println("+---------------------+");
            System.out.println("[1] Calcula la moda");
            System.out.println("[2] La mitad es ");
            System.out.println("[3] Dí hola mundo");
            System.out.println("[0] Salir");
            System.out.println("[?] ");
            examen.nextInt();
            
                switch (opcion) {
        
        case 1:
        int[] opciones = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9};
        int moda = 0, maxFrecuencia = 0;

        for (int i = 0; i < opciones.length; i++) {
        int frecuencia = 0;
        for (int j = 0; j < opciones.length; j++) {
            if (opciones[i] == opciones[j]) {
                frecuencia++;
            }
        }
        if (frecuencia > maxFrecuencia) {
            maxFrecuencia = frecuencia;
            moda = opciones[i];
        }
        }
        break;
        
        case 2: 
        Scanner mitad = new Scanner(System.in); 
        System.out.println("Escriba un número:"); 
        double entradaA = mitad.nextDouble(); 
        double resultado = entradaA/2; System.out.println("La mitad es:"+resultado); 
        System.out.println("+------------------------+"); break;

        case 3: 
        System.out.println("Hola Mundo"); 
        System.out.println("+------------------------+"); 
        break;
        }


        }while(opcion != 0);
        }
    }
