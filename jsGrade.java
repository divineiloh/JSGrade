	//Author: Divine Iloh
	//BINS 5312
	//Date: 04/15/2022

package jsGrade;

public class jsGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		double[] jsScore = {89, 79.9, 80, 90, 91};
		char [] jsGrade = new char [5];

		
		//use for loop to loop through the list of scores
		for(int i = 0; i<5; i++)
		{
			//use if and else statements to determine and assign the grades for each score
			if ((jsScore[i] >= 70) & (jsScore[i] <= 79.9))
			{
				jsGrade[i] = 'C';
			}
			
			else if ((jsScore[i] >= 80) & (jsScore[i] <= 89.9))
			{
				jsGrade[i] = 'B';
			}
			
			else if (jsScore[i] >= 90)
			{
				jsGrade[i] = 'A';
			}
		}
		
		//display the header as score and grade
		System.out.println("Score	Grade \n");
		
		//use for loop to print individual score and grade
		for(int i = 0; i<5; i++)
		{
			System.out.println( jsScore[i] + "	  " +   jsGrade[i]);
		}
		
	}

}
