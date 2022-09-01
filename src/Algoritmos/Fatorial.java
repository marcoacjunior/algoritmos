package Algoritmos;

//forma recursiva

public class Fatorial {
	
	public static void main(String[] args) {
		Fatorial r = new  Fatorial();
		int resp = r.fatorial(4);
		System.out.println(resp);
	}

	public int fatorial(int n) {
		if(n==0)
			return 1;
	
	return n * fatorial(n -1);
}
}
