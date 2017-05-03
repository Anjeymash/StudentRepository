package by.htp.les05;


import java.util.Date;
import java.lang.Enum;

public class Bakalavr extends Student {
	private static int group ;
	private String name;
	private Date birthdate;
	private String telnumber;
	private String faculty;
	private int course;
	private double mark;

	public Bakalavr(String name, Date birthdate, String telnumber, String faculty, int course, double mark) {
		super(name, birthdate, telnumber, faculty, course, mark);
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	*/
	public void test()
	{
	Fakultet fak = Fakultet.valueOf(getFaculty());
	
	switch(fak){
	case ENERGOFAK: System.out.println("Тест для студента энергофака (бакалавр)");break;
	case MASHFAK: System.out.println("Тест для студента машфака (бакалавр)");break;
	case FITR: System.out.println("Тест для студента ФИТР (бакалавр)");break;
	case STROYFAK: System.out.println("Тест для студента стройфака (бакалавр)");break;
	default: System.out.println("Нет такого факультета");break;
	}
	
	}
	
}
