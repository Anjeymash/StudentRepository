package by.htp.les05;



import java.util.Date;

public class Group {
	////private int id;
	private String name;
	private Date birthdate;
	private String telnumber;
	private String faculty;
	private int course;
	private double mark;

	public Group(String name, Date birthdate, String telnumber, String faculty, int course, double mark) {
		this.name = name;
		this.birthdate = birthdate;
		this.telnumber = telnumber;
		this.faculty = faculty;
		this.course = course;
		this.mark = mark;
	}

	public String getName() {
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
}