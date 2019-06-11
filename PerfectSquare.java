import java.util.Scanner;

public class PerfectSquare{

	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer str = reader.nextInt();
		Perfect perfect = new Perfect();
		System.out.println(perfect.isPerfect(str));
	}

	public interface Square{
		boolean isPerfect(int x);
}

	public static class Perfect implements Square{

		int number;
		double s;

		public boolean isPerfect(int a){
			number = a;
			s = Math.sqrt(number);
			if(((s-Math.floor(s))==0))
			return true;
			else
			return false;
		}

	}



}