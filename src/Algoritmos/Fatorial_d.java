package Algoritmos;

import java.math.BigInteger;

//forma dinâmica

public class Fatorial_d {

	public static void main(String[] args) {

		BigInteger[] fat = new BigInteger[100];
		fat[0] = BigInteger.ONE;

		for (int i = 1; i < fat.length; i++) {
			fat[i] = fat[i - 1].multiply(BigInteger.valueOf(i));
		}

		for (int i = 0; i < fat.length; i++) {
			System.out.printf("%d! = %d\n", i, fat[i]);
		}

	}

}
//A programação dinâmica é um método de otimização usado para resolução de problemas; 
//os problemas são divididos em subproblemas menores para serem resolvidos. 
//Enquanto a recursão é quando uma função pode ser chamada e executada por si mesma.