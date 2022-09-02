package logic_java_exercises;

public class TestaLaco {
	public static void main(String[] args) {
		
		for (int linha = 0; linha < 10; linha ++) {
			for (int coluna = 0; coluna < 20; coluna++) {
				
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int linha = 0; linha < 10; linha ++) {
			for (int coluna = 0; coluna < 20; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
