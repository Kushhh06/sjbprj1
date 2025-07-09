package dsa.mca.demo;

import dsaprj.mca.dsa.Product;

public class Demo {

	static void f1(int a) {
		System.out.println(a);
	}

	static void f1(int a, int b) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Product p1 = new Product(0, null, 0);
		System.out.println(p1.prdId);
	}
}
