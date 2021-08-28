package switchCase;

import java.util.Scanner;

public class MesesDoAno {
	
        public static void main (String[] args){
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println ("Olá! Digite o número referente ao mês desejado: ");
			int mes = scan.nextInt ();
			
			switch (mes) {
				case 1:
					System.out.println("Mês correspondente é janeiro");
					break ;
				case 2:
					System.out.println("Mês correspondente é fevereiro");
					break;
				case 3:
					System.out.println("Mês correspondente é março");
					break ;
				case 4:
					System.out.println("Mês correspondente é abril");
					break ;
				case 5:
					System.out.println("Mês correspondente é maio");
					break ;
				case 6:
					System.out.println("Mês correspondente é junho");
					break ;	
				case 7:
					System.out.println("Mês correspondente é julho");
					break ;
				case 8:
					System.out.println("Mês correspondente é agosto");
					break;
				case 9:
					System.out.println("Mês correspondente é setembro");
					break ;
				case 10:
					System.out.println("Mês correspondente é outubro ");
					break ;
				case 11:
					System.out.println("Mês correspondente é novembro");
					break ;
				case 12:
					System.out.println("Mês correspondente é dezembro");
					break ;	
				default:
				   System.out.println("Não localizado no calendário! Selecione um número válido");
			}
		}	
	}
}

