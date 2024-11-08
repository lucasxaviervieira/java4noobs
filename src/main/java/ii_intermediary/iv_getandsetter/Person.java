package ii_intermediary.iv_getandsetter;

class Person {

    private String name;
    private int age;
    private String cpf;

    public Person() {
        this.name = "";
        this.age = 0;
        this.cpf = "";
    }

    public Person(String name, int age, String cpf ) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public void increaseAge() {
        this.age++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }
}


