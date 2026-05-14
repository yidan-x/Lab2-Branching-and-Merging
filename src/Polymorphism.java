public class Polymorphism {

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        // TODO: right now for student, it is not returning the role to be student.
        return p.getRole();
    }
}

class Person {
    public final String role = "General";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return role;
    }
}


class Student extends Person {
    public final String role = "Student";
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getRole() {
        return role;
    }
}