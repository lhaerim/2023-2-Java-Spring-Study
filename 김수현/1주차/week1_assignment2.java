
public class week1_assignment2 {

	public static void main(String[] args) {
		char alp = 'A';
		for (int i = 0; i < 'Z'-'A'+1; i++) {
			System.out.print(alp + " ");
			alp++;
			if((i+1) % 5 == 0) System.out.println();
		}

	}

}
