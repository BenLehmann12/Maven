import java.util.ArrayList;
import java.util.Scanner;
public class GradeBook { //Ben Lehmann
	private ArrayList<Character> letter;  //Create an Array List of the Letter Grade
	private ArrayList<Integer> GradeScore; //Create an Array List of Grade Scores
	
	GradeBook(ArrayList<Integer>gradesArr){
		GradeScore = gradesArr;   //Call Back Method, Constructor with an array
		letter = calculateGrades(gradesArr);  //This will call back an array
	}
	
	
	public ArrayList<Character> calculateGrades(ArrayList<Integer> gradesArr){
		ArrayList<Character>GradeLetter = new ArrayList<Character>();  //This will be the size of the array
		for(int i=0; i < gradesArr.size();i++) {   //Traverse through the arraylist
			if(gradesArr.get(i) >= 90) {
				GradeLetter.add('A');
			}
			else if(gradesArr.get(i) >= 80) {
				GradeLetter.add('B');
			}
			else if(gradesArr.get(i) >= 70) {
				GradeLetter.add('C');
			}
			else if(gradesArr.get(i) >= 60) {
				GradeLetter.add('D');
			}
			else {
				GradeLetter.add('F');
			}
		}
		return GradeLetter;
	}


	public ArrayList<Character> getLetter() {   //Getters and Setters
		return letter;
	}


	public void setLetter(ArrayList<Character> letter) {
		this.letter = letter;
	}


	public ArrayList<Integer> getGradeScore() {
		return GradeScore;
	}


	public void setGradeScore(ArrayList<Integer> gradeScore) {
		GradeScore = gradeScore;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How Many Scores would you like to enter");  //This will ask for the number of Scores to enter
		int numberOfGrades = scan.nextInt(); //Could be any integer
		ArrayList<Integer>gradesArr = new ArrayList<Integer>(); //This will be an Nth array list, Nth based on the input
		for(int i=0; i < numberOfGrades; i++) {  //Go though the number of Grades inputed, this will print out N Grades
			System.out.println("Enter a Score:");
			int UserScore = scan.nextInt();
			gradesArr.add(UserScore);  //We will add each score to the gradesArr arraylist
		}
		GradeBook grades = new GradeBook(gradesArr);  //We will Create a new Gradebook Object
		ArrayList<Character> letter = grades.getLetter();  //We will use the Getters
		ArrayList<Integer> GradeScore = grades.getGradeScore();
		for(int i = 0; i < GradeScore.size(); i++) {
			System.out.println(GradeScore.get(i) + " ----------- " + letter.get(i));  //Get each Index from the list
		}
	}
}
