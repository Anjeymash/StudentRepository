package by.htp.les05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Group {
        int id;
        String name;
        Date birthdate;
        String birthd;
        String telnumber;
        String faculty;
        int course;

        public Group(String name, String birthd, String telnumber, String faculty, int course) {
                this.name = name;
                this.birthdate = dateformat(birthd);
                this.telnumber = telnumber;
                this.faculty = faculty;
                this.course = course;
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

        public Date dateformat(String birthd){
                SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
                //Date parsingDate;
              try {
                 this.birthdate = ft.parse(birthd); 
                 //System.out.println(parsingDate); 
              }catch (ParseException e) { 
                 System.out.println("Нераспаршена с помощью " + ft); 
              }
                return birthdate;
        }



        public void setBirthdate(String birthd) {
                this.birthdate = dateformat(birthd);
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

}