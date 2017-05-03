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
	

		ArrayList<Group> list = new ArrayList<Group>();

		list.add(new Group("Andrey", dateformat("1981-08-24"), "80296685997", "energofak", 5, 2.5));
		list.add(new Group("Petya", dateformat("1990-05-21"), "7777777777", "energofak", 3, 3.0));
		list.add(new Group("Kostya", dateformat("1981-01-22"), "8888888888", "mashfak", 5, 5.0));
		list.add(new Group("Andrey1", dateformat("1981-08-24"), "80296685997", "energofak", 5, 4.6));
		list.add(new Group("Martin", dateformat("1981-08-24"), "80296685997", "stroyfak", 5, 4.1));
		list.add(new Group("Alex", dateformat("1981-08-24"), "80296685997", "energofak", 5, 4.1));
		list.add(new Group("Anjey", dateformat("1981-08-24"), "80296685997", "energofak", 5, 3.2));
		list.add(new Group("Andrey4", dateformat("1981-08-24"), "80296685997", "energofak", 5, 5.0));

		int ball = 0;
		int i = 0;
		int n5 = 0;
		int n2 = 0;
		double evmark;

		for (Group x : list) {
			// if (x.faculty.equals("energofak"))
			// if (x.birthdate.equals(list[2].getBirthdate()))
			// System.out.println("имя:" + x.name + " дата рождения: " +
			// x.birthdate + " телефон: " + x.telnumber
			// + " факультет: " + x.faculty + " курс: " + x.course);

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
		for (int j = 2; j < list.size(); j++) {
			System.out.println(list.get(j).getName());
		}
	}

	static void listSort(ArrayList<Group> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j).getMark() > list.get(j + 1).getMark()) {
					Group t = list.get(j);
					list.set(j, list.get(j + 1));
					list.set((j + 1), t);
				//////	

				}
			}
		}
	}
}