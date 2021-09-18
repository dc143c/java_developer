public class Students {
    private String name;
    private String course;
    private int age;

    public Students(String name, int age, String courseName){
        this.name = name;
        this.age = age;
        this.course = courseName;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years, " + this.course + " student";
    }
}
