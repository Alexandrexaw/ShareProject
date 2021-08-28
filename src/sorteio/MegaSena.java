package sorteio;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class MegaSena {

	private static Scanner entradaScanner;

	public static void main(String[] args) {
		entradaScanner = new Scanner(System.in);
		

		System.out.println("Ol�! Digite a quantia de n�meros por cartela: ");
		int quantiaDeNumeros = entradaScanner.nextInt();
		
		System.out.println("Digite a quantia de cartelas que deseja gerar : ");
		int numeroDeCartelas = entradaScanner.nextInt();
		if (quantiaDeNumeros < 6 || quantiaDeNumeros > 12) {
			System.out.print("N�mero inv�lido! Jogo gera de 6 a 12 n�meros da sorte! ");
			return;
		}
		

		Random gerador = new Random();
		for(int i =0; i<numeroDeCartelas; i++){
			HashSet<Integer> sorteio = new HashSet<>();

			while (sorteio.size() < quantiaDeNumeros) {

				sorteio.add(gerador.nextInt(60)+1);
			}
			System.out.println("N�meros do sorteio : " + sorteio);
		}
		
	}
}