package by.htp.les05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentGetInf {

	  public static Date dateformat(String birthd){
          SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
          Date birthdate = null;
        try {
           birthdate = ft.parse(birthd); 
           //System.out.println(parsingDate); 
        }catch (ParseException e) { 
           System.out.println("Нераспаршена с помощью " + ft); 
        }
          return birthdate;
  }
        public static void main(String[] args) {
                // TODO Auto-generated method stub
        	
        	
        	
                Group[] list = { new Group("Andrey", dateformat("1981-08-24"), "80296685997", "energofak", 5, 2.5),
                                new Group("Petya", dateformat("1990-05-21"), "7777777777", "energofak", 3, 3.0),
                                new Group("Kostya", dateformat("1981-01-22"), "8888888888", "mashfak", 5, 5.0),
                                new Group("Andrey1", dateformat("1981-08-24"), "80296685997", "energofak", 5, 4.6),
                                new Group("Andrey2", dateformat("1981-08-24"), "80296685997", "energofak", 5, 4.1),
                                new Group("Andrey3", dateformat("1981-08-24"), "80296685997", "energofak", 5, 3.2),
                                new Group("Andrey4", dateformat("1981-08-24"), "80296685997", "energofak", 5, 5.0) };
                int ngroup1 = 0;
                int ngroup2 = 0;
                int ball = 0;
                int ball1 = 0;
                int ball2 = 0;
                int i = 0;
                int n5 = 0;
                int n2 = 0;
                for (Group x : list) {
                        // if (x.faculty.equals("energofak"))
                        // if (x.birthdate.equals(list[2].getBirthdate()))
                        // System.out.println("имя:" + x.name + " дата рождения: " +
                        // x.birthdate + " телефон: " + x.telnumber
                        // + " факультет: " + x.faculty + " курс: " + x.course);
                      
                        ball += x.getMark();
                        if (x.getMark() >= 2.5)
                                n5++;
                        if (x.getMark() <3 )
                                n2++;
                        i++;
                }
                double evmark = ball / i;
               // double evmark1 = ball1 / ngroup1;
                //double evmark2 = ball2 / ngroup2;
                System.out.println(" средний бал студентов: " + evmark + "\n число успевающих: " + n5 + "\n число неуспевающих: "
                                + n2);
                // int nmest = list.length - 2;
                listSort(list);
                for (int j = 2; j < list.length ; j++) {
                        System.out.println(list[j].getName());
                }
        }

        static void listSort(Group[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length -i- 1; j++) {
                                if (arr[j].getMark() > arr[j + 1].getMark()) {
                                        Group t = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = t;

                                }
                        }
                }
        }
}