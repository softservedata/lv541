package RegularExpr;


public class Task_2 {
	public static void main (String[] args) {
		String sen = new String(" Nasa  has    started  assembling    the    first Space   Launch System (SLS)  rocket on    a   launch platform ");
		sen.trim().replaceAll("\\s{2,}", " ");
		System.out.println(sen);

		
	}
}
