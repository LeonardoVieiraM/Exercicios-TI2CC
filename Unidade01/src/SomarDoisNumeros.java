import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		//declarar variavel
		int x, y, soma;
		
		//leitura
		System.out.println("Digite o primeiro numero");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero");
		y = sc.nextInt();
		
		//somar
		soma = x + y;
		
		//mostrar resultado
		System.out.println("Soma = " + soma);
	}
}