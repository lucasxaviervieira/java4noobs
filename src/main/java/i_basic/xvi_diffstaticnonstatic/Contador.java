package i_basic.xvi_diffstaticnonstatic;

public class Contador {
    static int contagem = 0;

    public Contador() {
        contagem += 1;
    }

    public static int getContagem() {
        return contagem;
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Número total de instâncias: " + Contador.getContagem());
    }

}
