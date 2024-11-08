package ii_intermediary.iv_getandsetter;

public class UsingPerson {
    public static void main (String[] args) {
        String name = "Lucas";
        int age = 21;
        String cpf = "000.111.222-23";

        Person person = new Person();

        person.setName(name);
        person.setAge(age);
        person.setCpf(cpf);

        String name2 = "Xavier";
        int age2 = 20;
        String cpf2 = "000.111.222-23";

        Person person2 = new Person(name2,age2,cpf2);

        System.out.println(person.getName() + person.getAge() + person.getCpf());
        System.out.println(person2.getName() + person2.getAge() + person2.getCpf());


    }
}
