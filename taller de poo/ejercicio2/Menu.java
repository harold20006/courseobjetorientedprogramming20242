package ejercicio2;

import java.util.Scanner;

public class Menu {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 123456, 100, true);
        Libro libro2 = new Libro("la odisea", "Homero", 657483, 100, true);
        Libro libro3 = new Libro("la divina comedia", "Dante Alighieri", 657483, 100, true);
        Libro libro4 = new Libro("la iliada", "Homero", 657483, 100, true);
    
    Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
       
       while(!salir){
           
           System.out.println("1. consultar disponibilidad");
           System.out.println("2. Prestamo del libro");
           System.out.println("3. Devolucion del libro");
           System.out.println("4. Salir");
           
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("digite el numero del libro");
                     int numero = sn.nextInt();
                   while(!salir){
                       
                       System.out.println("1. El principito");
                       System.out.println("2. La odisea");
                       System.out.println("3. La divina comedia");
                       System.out.println("4. La iliada");
                       
                       System.out.println("Escribe una de las opciones");
                       opcion = sn.nextInt();
                       
                       switch(opcion){
                           case 1:
                            System.out.println(libro1.disponibilidad());
                               break;
                           case 2:
                               System.out.println(libro2.disponibilidad());
                               break;
                            case 3:
                               System.out.println(libro3.disponibilidad());
                               break;
                            case 4:
                            System.out.println(libro4.disponibilidad());
                            case 5:
                            salir=true;
                               break;
                            System.out.println("Solo números entre 1 y 5");
                       }
                       
                   }
                   break;
               case 2:
                     
                     System.out.println("digite el numero del libro");
                     int numero1 = sn.nextInt();
                   while(!salir){
                       
                       System.out.println("1. El principito");
                       System.out.println("2. La odisea");
                       System.out.println("3. La divina comedia");
                       System.out.println("4. La iliada");
                       
                       System.out.println("Escribe una de las opciones");
                       opcion = sn.nextInt();
                       
                       switch(opcion){
                           case 1:
                            System.out.println(libro1.devolucion());
                               break;
                           case 2:
                               System.out.println(libro2.devolucion());
                               break;
                            case 3:
                               System.out.println(libro3.devolucion());
                               break;
                            case 4:
                            System.out.println(libro4.devolucion());
                            case 5:
                            salir=true;
                               break;
                            default:
                               System.out.println("Solo números entre 1 y 5");
                   break;
                
                case 3:
                        
                        System.out.println("digite el numero del libro");
                        int numero2 = sn.nextInt();
                        while(!salir){
                       
                            System.out.println("1. El principito");
                            System.out.println("2. La odisea");
                            System.out.println("3. La divina comedia");
                            System.out.println("4. La iliada");
                            
                            System.out.println("Escribe una de las opciones");
                            opcion = sn.nextInt();
                            
                            switch(opcion){
                                case 1:
                                 System.out.println(libro1.prestamo());
                                    break;
                                case 2:
                                    System.out.println(libro2.prestamo());
                                    break;
                                 case 3:
                                    System.out.println(libro3.prestamo());
                                    break;
                                 case 4:
                                 System.out.println(libro4.prestamo());
                                 case 5:
                                 salir=true;
                                    break;
                                 default:
                                    System.out.println("Solo números entre 1 y 5");
                            }
                        }
                    }
                }
                
            }
        }
    }
 }

       
    
