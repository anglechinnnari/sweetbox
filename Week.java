import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the week number:");
				int Week=sc.nextInt();
				String WeekString;
				switch(Week) {
				case 1:WeekString="Sunday->Holiday";
				break;
				case 2: WeekString="Monday->Go for a walk";
				break;
				case 3:WeekString="Tuesday->Do  homework";
				break;
				case 4:WeekString="Wednesday->Do grocery shopping";
				break;
				case 5:WeekString="Thursday->Go for work";
				break;
				case 6:WeekString="Friday->Do cleaning";
				break;
				case 7:WeekString="Saturday->Take Classes";
				break;
		        default:WeekString="Invalid week";
		        break;
				}
				System.out.println(WeekString);

			}
	}

