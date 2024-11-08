package ii_intermediary.ii_manipulacaoarquivo;

import java.io.IOException;

public class Main {
    private static final String path = "src/main/java/ii_intermediary/ii_manipulacaoarquivo/file.txt";

    public static void main(String[] args) throws IOException {

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }

}