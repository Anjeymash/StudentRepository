package by.htp.les05;

import java.util.Date;

public class Bakalavr extends Student {

	public Bakalavr(String name, Date birthdate, String telnumber, String faculty, int course, double mark) {
		super(name, birthdate, telnumber, faculty, course, mark);
	}

	public void test() {
		try{
		Fakultet fak = Fakultet.valueOf(getFaculty());
		

		switch (fak) {
		case ENERGOFAK:
			System.out.println("Тест для студента энергофака (бакалавр) " + getName());
			break;
		case MASHFAK:
			System.out.println("Тест для студента машфака (бакалавр) "+ getName());
			break;
		case FITR:
			System.out.println("Тест для студента ФИТР (бакалавр) " + getName());
			break;
		case STROYFAK:
			System.out.println("Тест для студента стройфака (бакалавр) "+  getName());
			break;
		default:
			System.out.println("Нет такого факультета");
			break;
		}
		}
		catch(IllegalArgumentException e){System.out.println("Перехвачено исключение"+ e);}
	}

}
