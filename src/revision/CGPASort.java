package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String fname, double cgpa){
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
        }
}
public class CGPASort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        ArrayList <Student> studentList = new ArrayList<Student>();
        while (testCases<0){
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }


        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s2.getCgpa()> s1.getCgpa()){
                    return 1;
                }
                else if
                    (s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                return s1.getFname().compareTo(s2.getFname());
                }
            });
        for (Student st : studentList){
            System.out.println(st.getFname());
        }
    }
}
