package Algoritmos;

//forma dinâmica

public class fibonacci_d {
	
	private static final int MAX_ELEMENTOS = 100;
	private static final long [] elementosFib = new long[MAX_ELEMENTOS];
	
	public static long encontrarElementoPD(int n) {
		for(int i = 0; i < MAX_ELEMENTOS; i++) {
			elementosFib[i] = -1;
		}
		
		return encontrarElemento(n);
	}
	
	public static long encontrarElemento(int n) {  
		if (elementosFib[n] == -1) {
		if(n <= 1) {
			elementosFib[n] = n;
		} else {
		elementosFib[n] =encontrarElemento(n-1) + encontrarElemento(n-2);
	}
	}
		return elementosFib[n];
	}
	
	public static void main(String[]args) {
		int n = 50;
		
	System.out.println("Elemento" + n + ":" + encontrarElementoPD(n));
	}

}

   // Na forma recursiva e para cada posição o cálculo é feito novamente. 
   // Na programação dinâmica, quando você calcula o fatorial de n, vc já terá o fatorial de n-1.
