package infopulse.beginnertask.classes.students;


public class StudentsInfo {

	public static void main(String[] args) {
		Student student1 = new Student (1,"Ivan Ivanov", 1989,"Darnytskyi boulevard 12, app.43, +380500124521", "Philosophy", 2,"12-A");
		Student student2 = new Student (2,"Valentina Korshunova", 1988,"Brovarskyi Avenue 10, app.12, +380672514875", "Cybernetics", 1,"2-SATR");
		Student student3 = new Student (3,"Olesya Alekseeva", 1989,"Aistova street 4, app.157, +380505253645", "Philosophy", 2,"12-A");
		student1.print();
	}

}
