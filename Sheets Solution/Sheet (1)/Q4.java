
public class Q4 {
	 public static void main(String[] args) {
	int     maxWidth = 5 ;
	
for( int i = 1; i <= maxWidth ; i++) {
	for ( int j = 0; j < i ; j++) {
	System.out.print("* ");
	
	}
	System.out.println(" ");
	}

}
}
class AnotherQuestion {
	 public static void main(String[] args) {
			int     maxWidth = 5,
					numStars = 1,
					numSpaces = maxWidth - 1 ;
			
		for( int i = 0; i <= maxWidth ;i++) {
			// repeat method repeats the selected string 'int' times that is defined between () 
				String Line = " ".repeat(numSpaces) + " *".repeat(numStars);
				System.out.println(Line);
				numSpaces-- ;
				numStars++;
			}

		}
}
