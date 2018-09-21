//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Student {
    private int id;
    private String name;
    private String subject;
    private Double score;

    public Student(int id, String name, String subject, Double score) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String toString() {
        return "Student{id=" + this.id + ", name='" + this.name + '\'' + ", subject='" + this.subject + '\'' + ", score=" + this.score + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getScore() {
        return this.score;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }
}
