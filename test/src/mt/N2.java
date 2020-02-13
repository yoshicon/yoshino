package mt;

/*
 * if -> switch
 * 
 */
 

public class N2 {

	public static void main(String[] args) {
		int score = 83;
		char grade = ' ';
		
		switch (score) {
		case 90 :
			grade = 'A';
			break;
			
		case 80 :
			grade = 'B';
			break;
			
		case 70 :
			grade = 'C';
			break;
			
		case 60 :
			grade = 'D';
			break;
			
		default :
			grade = 'F';
		}
		
		System.out.println(grade);
	}

}

