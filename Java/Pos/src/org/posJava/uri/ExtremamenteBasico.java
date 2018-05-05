package org.posJava.uri;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ExtremamenteBasico {
 
    public static void main(String[] args) throws IOException {
 
      Scanner scan = new Scanner(System.in);
      
      int a, b, x;
      a = Integer.parseInt(scan.nextLine());
      b = Integer.parseInt(scan.nextLine());
      
      x = a + b;
      
      System.out.println("X = " + x);
      
      scan.close();
 
    }
 
}