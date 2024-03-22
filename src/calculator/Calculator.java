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
                    
                    
                    break;
                case 3:
                    
                    
                    
                    break;
                case 4:
                        
                       
                    
                    break;  
                default:
                    break;
            }
        }
        while(opcion != 5);
           
        
        
        
        
        
        
    }
    
}
