 

public class Q2
  {
	 public static void main(String[] args) {
      for(int i=0;i<10;i++){
         if (i%2 == 0)
      continue;
     System.out.println(i+ " " + i * i);
}
}
    // output is odd numbers form 1 to 9 and their square because continue skips only the current irretation
    // if continue is replaced by break nothing will be printed because the first value of i
    // is 0 which will break the for loop not only the irretation 
  }