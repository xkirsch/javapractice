package infopulse.beginnertask.classes.students;

public class StudentsGroup {

	private Student[] students;
	private int size; 
	public StudentsGroup(){
		students = new Student [10];
		size =-1; 
	}
	public void add (Student student){
		if (size<students.length-1)
		students[++size]= student;
	}

	}


