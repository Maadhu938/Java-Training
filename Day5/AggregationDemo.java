class Department {
    String name;
    int id;

    Department(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Department Name: " + name);
        System.out.println("Department ID: " + id);
    }
}

class College {
    String collegeName;
    Department department;   // Aggregation (HAS-A relationship)

    College(String collegeName, Department department) {
        this.collegeName = collegeName;
        this.department = department;  // Passing existing object
    }

    void displayCollege() {
        System.out.println("College Name: " + collegeName);
        department.display();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        // Department object created independently
        Department dept = new Department("Computer Science", 101);

        // Passing Department object to College
        College college = new College("Sapthagiri College", dept);

        college.displayCollege();
    }
}