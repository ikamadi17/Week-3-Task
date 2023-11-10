package org.example;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.serviceImplematn.LibraryServiceImplementation;
import org.example.serviceImplematn.PrincipalServiceImpl;
import org.example.serviceImplematn.StudentDetailsImpl;
import org.example.serviceImplematn.TeacherServiceImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.example.serviceImplematn.StudentDetailsImpl.readExcelDetails;
import static org.example.serviceImplematn.TeacherServiceImpl.readExcelDetail;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TeacherServiceImplementation//
        System.out.println("------------------------------------Teacher Details-------------------------");
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        List<Person> teacher = readExcelDetail("/Users/decagon/Documents/Week3/WeekThree/src/main/java/org/example/TeacherData.csv");

        //PrincipalServiceImplementation//
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();


        //StudentDetailsImplementation//
        System.out.println("---------------------------------Student Details--------------------------");
        List<Person> studentDetails = readExcelDetails("/Users/decagon/Documents/Week3/WeekThree/src/main/java/org/example/StudentData.csv", "");


//        writeDataToCSV(teacher, "teachers.csv");
//
//        // Write student data to CSV
//        writeDataToCSV(studentDetails, "students.csv");
//    }
//
//    public static void writeDataToCSV(List<Person> data, String filePath) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
//            // Write header row if necessary
//            // bw.write("Column1,Column2,Column3,Column4"); // Example header row
//
//            // Write data rows
//            for (Person person : data) {
//                // Construct a CSV row for the current person
//                String csvRow = person.toCSV(); // Assuming Person class has a toCSV() method
//
//                // Write the CSV row to the file
//                bw.write(csvRow);
//                bw.newLine(); // Move to the next line
//            }
//
//            System.out.println("Data has been written to " + filePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }

//        System.out.println("////////............................BOOK LIBRARY.........................//////");
//        Book book1 = new Book("Things Fall Apart", 5, "Chinua Achebe");
//        Book book2 = new Book(" Modern Biology", 4, "Janet L. Hopson");
//
//        LibraryServiceImplementation librarianService = new LibraryServiceImplementation();
//        System.out.println("....................PRIORITY QUEQUE..............");
//        librarianService.teacherSeniorJuniorPriority(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book1);
//        System.out.println();
//        System.out.println("FIFO");
//        librarianService.firstComeFirstServed(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book2);
        System.out.println("////////............................BOOK LIBRARY.........................//////");
        Book book1 = new Book("Forex Psychology", 3, "Chinenye");
        Book book2 = new Book(" Data Science", 3, "James George");
        Book book3 = new Book(" World Politics", 4, "Barracks Jacob");




        LibraryServiceImplementation librarianService = new LibraryServiceImplementation();
        System.out.println("PRIORITY QUEQUE");
        librarianService.teacherSeniorJuniorPriority(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book1);
        System.out.println();
        System.out.println("FIFO");
        librarianService.firstComeFirstServed(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book2);
    }
}
//
//        LibraryServiceImplementation LibraryService = new LibraryServiceImplementation();
//        TeacherServiceImpl teacher = new TeacherServiceImpl();
//        StudentDetailsImpl student = new StudentDetailsImpl();
//
//        //LibraryService.teacherSeniorJuniorPriority(teacher.teachers, seniorStudents, juniorStudents, book);
//
//      // List<Teachers> teachers = new ArrayList<>();
//        List<Person> seniorStudents = new ArrayList<>();
//        List<Person> juniorStudents = new ArrayList<>();
//        Book book = new Book("Indu Paradigm", 4, "Sanjay Singania"); // Sample book with 5 copies
//        List<Book> books = new ArrayList<>();
//        {
//            books.add(new Book("Forex Psychology", 5, "Unknown Author"));
//            books.add(new Book("Geometry", 5, "Unknown Author"));
//            books.add(new Book("Data Science", 5, "Unknown Author"));
//            books.add(new Book("Agile", 5, "Unknown Author"));
//            books.add(new Book("Quality Assurance", 5, "Unknown Author"));
//            // Populate the lists with sample data (teachers, senior students, junior students)
//
//            // Instantiate LibraryServiceImplementation
//            LibraryServiceImplementation libraryService = new LibraryServiceImplementation();
//
//
//
//            // Call the methods
//            System.out.println("Using teacherSeniorJuniorPriority method:");
//          //  libraryService.teacherSeniorJuniorPriority(teachers, seniorStudents, juniorStudents, book);
//
//            // Reset book quantity for the second method
//            book.setQuantity(2);
//
//            System.out.println("\nUsing firstComeFirstServed method:");
//            //libraryService.firstComeFirstServed(teachers, seniorStudents, juniorStudents, book);







// Add some teachers, senior students, and junior students to the lists

//        LibraryServiceImplementation LibraryService = new LibraryServiceImplementation();
//        PriorityQueue<Person> person =

//}TeacherServiceImpl teacherService = new TeacherServiceImpl();
//    List<Person> teacher = readExcelDetail("Dataset.csv");

//PrincipalServices principalServices = new PrincipalServiceImpl();

//        // Admitting students
//        Student student1 = new Student("John", 30);
//        String admissionStatus1 = principalServices.admitStudents(student1);
//        System.out.println(admissionStatus1);
//
//
//
//        // Employing teachers
//        Teacher teacher1 = new Teacher("Michael", Qualification.PHD);
//        String employmentStatus1 = principalServices.employTeacher(teacher1);
//        System.out.println(employmentStatus1);
//
//        Teacher teacher2 = new Teacher("Sarah", Qualification.HND);
//        String employmentStatus2 = principalServices.employTeacher(teacher2);
//        System.out.println(employmentStatus2);
//
//        // Paying salary
//        Principal principal = new Principal("James");
//        principalServices.paySalary(principal, teacher1);
//
//
//
//        // Awarding or expelling a student
//        Student student3 = new Student("Mark", Behaviour.EXCEPTIONAL.ordinal());
//        String awardStatus1 = principalServices.awardOrExpel(student3);
//        System.out.println(awardStatus1);
//
//        Student student4 = new Student("Emily", Behaviour.WORSE.ordinal());
//        String awardStatus2 = principalServices.awardOrExpel(student4);
//        System.out.println(awardStatus2);


//            ArrayList<Course> subject = new ArrayList<>();
//            subject.add(new Course());
//            subject.add(new Course());
//            subject.add(new Course());
//            subject.add(new Course());
//
//            HashMap<String, Student> students = new HashMap<>();
//            students.put("Bayo", new Student("Bayo"));
//            students.put("Collins", new Student("Collins"));
//            students.put("Bright", new Student("Bright"));
//            students.put("Williams", new Student("Williams"));
//
//            for (Student student : students.values()) {
//                for (Course course : student.getCourses()) {
//                    student.addCourse(course);
//                }
//            }
//
//            // Print student names and their courses
//            for (Student student : students.values()) {
//                System.out.println("Student: " + student.getName());
//                System.out.println("Courses: ");
//                for (Course course : student.getCourses()) {
//                    System.out.println(course.getName());
//                }
//                System.out.println();
//}
