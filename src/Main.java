public class Main {
    public static void main(String[] args) {
       //Implementation of Student Class
       Student s1 = new Student();
       Student s2 = new Student("Mohammad","Alshibli", new myDOB(3,30,2022));
       System.out.println(s2.toString());

       //Implementation of Faculty Class
       Faculty f1 = new Faculty("Maaz", "Khan", new  myDOB(1, 1, 2023));
        f1.setFacultyID("123446");
        f1.setHiringDate(new myDOB(02, 15, 2024));
        System.out.println(f1.toString());
        System.out.println("F1 Faculty ID is: " + f1.getFacultyID());
        System.out.println("F1 was hired on " + f1.getHiringDate());

        //Implementation of Admin Class
        Admin a1 = new Admin("Bob", "Lee", new myDOB(18,3,2000));
        a1.setAdminID("456789");
        a1.setHiringDate(new myDOB(8, 6, 2022));
        System.out.println(a1.toString());
        System.out.println("A1's Admin ID is: " + a1.getAdminID());
        System.out.println("A1's was hired on " + a1.getHiringDate());


    }
}