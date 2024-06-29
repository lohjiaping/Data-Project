public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public void addStudent(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteStudent(String metricNumber) {
        if (head == null) return;

        if (head.student.getMetricNumber().equals(metricNumber)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.student.getMetricNumber().equals(metricNumber)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void updateStudent(String metricNumber, String name, double cgpa, String ictSkill) {
        Node current = head;
        while (current != null) {
            if (current.student.getMetricNumber().equals(metricNumber)) {
                current.student.setName(name);
                current.student.setCgpa(cgpa);
                current.student.setIctSkill(ictSkill);
                return;
            }
            current = current.next;
        }
    }

    public Student searchStudent(String metricNumber) {
        Node current = head;
        while (current != null) {
            if (current.student.getMetricNumber().equals(metricNumber)) {
                return current.student;
            }
            current = current.next;
        }
        return null;
    }

    public void sortStudentsByCgpa() {
        if (head == null || head.next == null) return;

        Node current;
        Node index;
        Student temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.student.getCgpa() > index.student.getCgpa()) {
                    temp = current.student;
                    current.student = index.student;
                    index.student = temp;
                }
            }
        }
    }

    public void displayStudents() {
        sortStudentsByCgpa(); // Ensure students are sorted by CGPA before displaying
        Node current = head;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}

