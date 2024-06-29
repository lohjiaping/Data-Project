public class Student {
    private String name;
    private String metricNumber;
    private double cgpa;
    private String ictSkill;

    public Student(String name, String metricNumber, double cgpa, String ictSkill) {
        this.name = name;
        this.metricNumber = metricNumber;
        this.cgpa = cgpa;
        this.ictSkill = ictSkill;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetricNumber() {
        return metricNumber;
    }

    public void setMetricNumber(String metricNumber) {
        this.metricNumber = metricNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getIctSkill() {
        return ictSkill;
    }

    public void setIctSkill(String ictSkill) {
        this.ictSkill = ictSkill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + name + '\'' +
                ", Metric Number ='" + metricNumber + '\'' +
                ", CGPA =" + cgpa +
                ", ICT Skill ='" + ictSkill + '\'' +
                '}';
    }
}

