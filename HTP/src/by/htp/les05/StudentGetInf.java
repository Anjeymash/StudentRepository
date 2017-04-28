package by.htp.les05;

public class StudentGetInf {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Group[] list = { new Group("Andrey", "1981-08-24", "80296685997", "energofak", 5),
                                new Group("Petya", "1990-05-21", "7777777777", "energofak", 3),
                                new Group("Kostya", "1981-01-22", "8888888888", "mashfak", 5),
                                new Group("Andrey1", "1981-08-24", "80296685997", "energofak", 5),
                                new Group("Andrey2", "1981-08-24", "80296685997", "energofak", 5),
                                new Group("Andrey3", "1981-08-24", "80296685997", "energofak", 5),
                                new Group("Andrey4", "1981-08-24", "80296685997", "energofak", 5) };
                int ngroup1 = 0;
                int ngroup2 = 0;
                int ball = 0;
                int ball1 = 0;
                int ball2 = 0;
                int i = 0;
                int n5 = 0;
                int n2 = 0;
             /*   for (Group x : list) {
                        // if (x.faculty.equals("energofak"))
                        // if (x.birthdate.equals(list[2].getBirthdate()))
                        // System.out.println("имя:" + x.name + " дата рождения: " +
                        // x.birthdate + " телефон: " + x.telnumber
                        // + " факультет: " + x.faculty + " курс: " + x.course);
  /*                      if (x.group == 1) {
                                ngroup1++;
                                ball1 += x.mark;
                        } else {
                                ngroup2++;
                                ball2 += x.mark;
                        }
                        ball += x.mark;
                        if (x.mark == 5)
                                n5++;
                        if (x.mark == 2)
                                n2++;
                        i++;
                }
                double evmark = ball / i;
                double evmark1 = ball1 / ngroup1;
                double evmark2 = ball2 / ngroup2;
                System.out.println(" средний бал студентов: " + evmark + "\n средний балл группы  1: " + evmark1
                                + "\n средний балл группы  2: " + evmark2 + "\n число отличников: " + n5 + "\n число двоечников: "
                                + n2);
                // int nmest = list.length - 2;
                listSort(list);
                for (int j = 2; j < list.length ; j++) {
                        System.out.println(list[j].name);
                }
        }

        static void listSort(Group[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length -i- 1; j++) {
                                if (arr[j].mark > arr[j + 1].mark) {
                                        Group t = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = t;

                                }
                        }
                }*/
        }
}