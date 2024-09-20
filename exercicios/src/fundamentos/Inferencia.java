package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		// UM PONTO IMPORTE É QUE O JAVA É FORTEMENTE TIPADO
		
		// Aprendemos a declarar varaiveis no Java, onde é preciso definir o tipo dela
		double a = 4.5;
		System.out.println(a);
		
		// Também é possível declarar variaveis com a palavra reservada "var", sem dizer o tipo
		// Nesse caso, o Java vai Inferir qual é o tipo dessa variavel
		var b = 4.5; // como o valor é um número e tem ponto, o java vai entender que é uma variavel do tipo double
		System.out.println(b);
		
		var c = "Texto"; // Vai Inferir que é do tipo string
		System.out.println(c);
		
		// Também é possível declarar uma variavel sem valor
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d);
		
		// Isso já não é possível no "var", é preciso declarar e inicializar uma variavel na mesma sentença
	}
}
