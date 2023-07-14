package Practice;

public class NestedSwitch {
	static void course_time(String course, String course_name)
	{
		switch(course)
		{
		case "B.Sc":
			switch(course_name)
			{
			case "ComputerScience":
				System.out.println("Your class time: 3hrs.");
				break;
			case "Chemistry":
				System.out.println("Your class time: 2hrs.");
				break;
			default:
				System.out.println("Your are out from class time.");
			}
			break;
		case "B.A":
			switch(course_name)
			{
			case "Tamil":
				System.out.println("Your class time: 1hr.");
				break;
			case "English":
				System.out.println("Your class time: 4hrs.");
				break;
			default:
				System.out.println("Your are out from class time.");
			}
			break;
		default:
			System.out.println("Your are out from course.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course = "B.A";
		String course_name = "English";
		course_time(course, course_name);
	}

}
