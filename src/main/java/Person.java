import java.util.List;

class Person{
    private String name;
    private String phone;
    private List<String> skills;

    public Person(String name, String phone, List<String> skills) {
        this.name = name;
        this.phone = phone;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return name +" - " +phone;
    }
}