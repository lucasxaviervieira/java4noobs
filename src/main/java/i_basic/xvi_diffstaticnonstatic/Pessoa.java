package i_basic.xvi_diffstaticnonstatic;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Nome: " + age);
    }

    public static void main(String[] args) {
        Pessoa person1 = new Pessoa("João", 25);
        Pessoa person2 = new Pessoa("Maria", 30);

        person1.showInfo();
        person2.showInfo();

    }
}
