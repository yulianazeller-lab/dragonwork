package dragonwork;

public class Dragon {
    private String name;
    private int age;
    private double weight;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Створено повноцінного дракона");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Ім’я: " + name + ", Вік: " + age + ", Вага: " + weight);
    }
}
