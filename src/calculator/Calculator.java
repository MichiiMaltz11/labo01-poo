package calculator;
import java.util.Scanner;

public class Calculator {

   
    public static void main(String[] args) 
    {
        int opcion;
        do
        {
            Scanner sc = new Scanner (System.in);
        
            System.out.println("Calculadora");
            System.out.println("1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Salir");
            System.out.println("Ingresa la opcion: ");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                   
                    System.out.println("Ingrese el primer numero: ");
                    float sum1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero ");
                    float sum2 = sc.nextFloat();
                    System.out.println("La suma es: " + (sum1 + sum2));
              
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    float res1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero ");
                    float res2 = sc.nextFloat();
                    System.out.println("La resta es: " + (res1 - res2));
                    
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    float mul1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero ");
                    float mul2 = sc.nextFloat();
                    System.out.println("La multiplicacion es: " + (mul1 * mul2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    float div1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero ");
                    float div2 = sc.nextFloat();
                    if (div2 == 0)
                    {
                        System.out.println("No se puede divir entre 0");
                    }
                    else 
                    {
                        System.out.println("La division es: " + (div1 / div2));
                    }
                    break;  
                default:
                    break;
            }
        }
        while(opcion != 5);
           
        
        
        
        
        
        
    }
    
}
