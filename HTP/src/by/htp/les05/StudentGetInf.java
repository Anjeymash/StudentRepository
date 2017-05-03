package by.htp.les05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StudentGetInf {

	public static Date dateformat(String birthd) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdate = null;
		try {
			birthdate = ft.parse(birthd);
			} catch (ParseException e) {
			System.out.println("Нераспаршена с помощью " + ft);
		}
		return birthdate;
	}

	public static void main(String[] args) {
	

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("Andrey", dateformat("1981-08-24"), "80296685997", "ENERGOFAK", 5, 2.5));
		list.add(new Student("Petya", dateformat("1990-05-21"), "7777777777", "ENERGOFAK", 3, 3.0));
		list.add(new Student("Kostya", dateformat("1981-01-22"), "8888888888", "MASHFAK", 5, 5.0));
		list.add(new Bakalavr("Andrey1", dateformat("1981-08-24"), "80296685997", "ENERGOFAK", 5, 4.6));
		list.add(new Bakalavr("Martin", dateformat("1981-08-24"), "80296685997", "STROYFAK", 5, 4.1));
		list.add(new Bakalavr("Alex", dateformat("1981-08-24"), "80296685997", "ENERGOFAK", 5, 4.1));
		list.add(new Student("Anjey", dateformat("1981-08-24"), "80296685997", "MASHFAK", 5, 3.2));
		list.add(new Bakalavr("Andrey4", dateformat("1981-08-24"), "80296685997", "FITR", 5, 5.0));

		int ball = 0;
		int i = 0;
		int n5 = 0;
		int n2 = 0;
		double evmark;

		for (Student x : list) {
			
			ball += x.getMark();
			if (x.getMark() > 2.5)
				n5++;
			else 
				n2++;
			i++;
		}
		evmark = ball / i;

		System.out.println(	" средний бал студентов: " + evmark + "\n число успевающих: " + n5 + "\n число неуспевающих: " + n2);

		listSort(list);
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j).getName());
			list.get(j).test();
		}
	
	
	
	}

	static void listSort(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j).getMark() > list.get(j + 1).getMark()) {
					Student t = list.get(j);
					list.set(j, list.get(j + 1));
					list.set((j + 1), t);
				//////	

				}
			}
		}
	}
}