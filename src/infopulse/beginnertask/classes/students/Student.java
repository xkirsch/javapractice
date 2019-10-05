package infopulse.beginnertask.classes.students;

public class Student {
	private int id;
	private String nameSurname;
	private int dateBirth;
	private String adress;
	private String faculty;
	private int course;
	private String group;

	public Student(int id, String nameSurname, int dateBirth, String adress, String faculty, int course, String group) {
		this.id = id;
		this.nameSurname = nameSurname;
		this.dateBirth = dateBirth;
		this.adress = adress;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setDateBirth(int dateBirth) {
		this.dateBirth = dateBirth;
	}

	public int getDateBirth() {
		return dateBirth;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}
	public void print() {
		System.out.println("ID= " + this.id + ", Name|Surname = " + this.nameSurname + ", Year of birth = " + this.dateBirth
				+ ", Adress = " + this.adress+ ", Faculty = " + this.faculty+ ", Course = " + this.course+ ", Group = " + this.group);
	}
}