import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){

	    int a, b;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Operador 1: ");
	    a = sc.nextInt();
	    System.out.print("Operador 2: ");
	    b = sc.nextInt();
	    System.out.print("Seleccione la operacion\n1. Suma\n2. Resta\n3. Multiplicación\n4. Division\n5. Módulo\nOPCION: ");
	    int opcion = sc.nextInt();

	    switch(opcion){

	        case 1:
	            System.out.println(add(a, b));
	        break;
	        
	        case 2:
	            System.out.println(sub(a, b));
	        break;
	   
	        case 3:
	            System.out.println(mul(a, b));
	        break;
	   
	        case 4:
	            System.out.pritnln(div(a, b));
	        break;
	 
	        case 5:
	            System.out.println(mod(a, b));
	        break;
	    }
	}
	//Funcion add(+)
	public static int add(int a, int b){
		return a + b;
	}
	//Funcion sub(-)
	public static int sub(int a, int b){
		return a - b;
	}
	//Funcion div(/)
	public static int div(int a, int b){
		return a / b;
	}
	//Funcion mul(*)
	public static int mul(int a, int b){
		return a*b;
	}
	//Funcion mod(%)
  public static int mod(int a, int b) {
		return a % b;
	}
}
