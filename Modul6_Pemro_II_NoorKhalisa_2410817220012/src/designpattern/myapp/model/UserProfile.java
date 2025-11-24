package designpattern.myapp.model;

public class UserProfile {
    private String name;
    private int age;
    private String hobby;

    public UserProfile(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }
}
