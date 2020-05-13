package Object;

public class Student01 {
    private String name;
    private int age;
    public Student01() {
    }

    public Student01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student01 student01 = (Student01) o;

        if (age != student01.age) return false;
        return name != null ? name.equals(student01.name) : student01.name == null;
    }

}
