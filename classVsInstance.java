import java.util.*;

public class classVsInstance {
	    private int age;	
	  
		public classVsInstance(int initialAge) {

	        age = initialAge>0 ? initialAge : 0;
	        System.out.println("Age is not valid, setting age to 0.");
	        
	    
	    }
		public void amIOld() {


			
			System.out.println(age < 13 ? "You are young." : (age < 18 ? "You are teenager." : "You are old."));
		}

		public void yearPasses() {
	    this.age++;
	    }


	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			classVsInstance p = new classVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
