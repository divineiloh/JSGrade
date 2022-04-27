package jsGradePoint;

public class jsGradePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variables
		double jsGPA;
		double totalGrades = 0;
		double[] jsGradePoint = {3.5, 4.0, 3.0, 2.5, 3.5};
		
		//double [] jsGPA = new double [5];
		
		for(int i = 0; i<5; i++)
		{
			totalGrades = totalGrades + jsGradePoint[i];
		}
		
		jsGPA = totalGrades / 5;
		System.out.println("Jill Smith's semester GPA is " + jsGPA);
		
	}

}
