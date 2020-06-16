import java.util.Scanner;

public class JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int linha1;
		int coluna1;
		int linha2;
		int coluna2;
		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite a linha que a torre se encontra: ");
		linha1 =leitor.nextInt();
		
		System.out.println("Digite a coluna que a torre se encontra: ");
		coluna1 = leitor.nextInt();
		
		System.out.println();
		System.out.println();
		
		System.out.println("    1  2  3  4  5  6  7  8  ");
		System.out.println("    ----------------------  ");
		System.out.println(" 1 | - - x - - - - - - - -  ");
		System.out.println(" 2 | - - x - - - - - - - -  ");
		System.out.println(" 3 | - - x - - - - - - - -  ");
		System.out.println(" 4 | - - x - - - - - - - -  ");
		System.out.println(" 5 | - - x - - - - - - - -  ");
		System.out.println(" 6 | x x x x x x x x x x x  ");
		System.out.println(" 7 | - - x - - - - - - - -  ");
		System.out.println(" 8 | - - x - - - - - - - -  ");
		
		
		if (linha1 >= 1 && coluna1 >=1 && linha1 <= 8 && coluna1 <= 8) {
			
		}
		
		for (linha2 = 1; linha2 <=8; linha2++) 
			System.out.println(linha2+ "|");
		
		for (coluna2 = 1; coluna2 <= 8; coluna2++) {
			
			if (linha1 == linha2 || coluna1 == coluna2)
				System.out.println("x");
			
			else System.out.println("-");
		}
				
		System.out.println();
	 
			

		
		
	}

}
