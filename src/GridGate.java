import java.util.Scanner;

public class GridGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String color = sc.nextLine();
		if(color.equals("Green"))
			System.out.println("next page");
		else
			System.out.println("error page");
	}

	
}
