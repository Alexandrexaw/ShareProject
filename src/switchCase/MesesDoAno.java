package switchCase;

import java.util.Scanner;

public class MesesDoAno {
	
        public static void main (String[] args){
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println ("Ol�! Digite o n�mero referente ao m�s desejado: ");
			int mes = scan.nextInt ();
			
			switch (mes) {
				case 1:
					System.out.println("M�s correspondente � janeiro");
					break ;
				case 2:
					System.out.println("M�s correspondente � fevereiro");
					break;
				case 3:
					System.out.println("M�s correspondente � mar�o");
					break ;
				case 4:
					System.out.println("M�s correspondente � abril");
					break ;
				case 5:
					System.out.println("M�s correspondente � maio");
					break ;
				case 6:
					System.out.println("M�s correspondente � junho");
					break ;	
				case 7:
					System.out.println("M�s correspondente � julho");
					break ;
				case 8:
					System.out.println("M�s correspondente � agosto");
					break;
				case 9:
					System.out.println("M�s correspondente � setembro");
					break ;
				case 10:
					System.out.println("M�s correspondente � outubro ");
					break ;
				case 11:
					System.out.println("M�s correspondente � novembro");
					break ;
				case 12:
					System.out.println("M�s correspondente � dezembro");
					break ;	
				default:
				   System.out.println("N�o localizado no calend�rio! Selecione um n�mero v�lido");
			}
		}	
	}
}

