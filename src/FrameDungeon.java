import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDungeon {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
		WebElement bingSearchElement = driver.findElement(By.className("red"));
		System.out.println(bingSearchElement.getText());
//		bingSearchElement.sendKeys("gauravshukla");
		
		
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		String firstColor = sc.next();
		String secondColor = sc.nextLine();
		String option = "";
		
		while((option = sc.next()) != null) {
			switch (option) {
			case "reload":
				secondColor =  rePaint(sc);
				break;

			case "proceed":
				proceed(firstColor, secondColor);
				break;
				
			default:
				break;
			}
		}	
	}
	
	public static String rePaint(Scanner sc) {
		return sc.nextLine();
	}
	
	public static void proceed(String firstColor, String secondColor){
		if(firstColor.equals(secondColor))
			System.out.println("next");
		else
			System.out.println("error");*/
	}

}
