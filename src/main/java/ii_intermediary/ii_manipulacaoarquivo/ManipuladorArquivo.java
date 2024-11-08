package ii_intermediary.ii_manipulacaoarquivo;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    public static void leitor(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String row = reader.readLine();

        while (row != null) {

            System.out.println(row);

            row = reader.readLine();

        }
        reader.close();
    }

    public static void escritor(String path) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva alguma coisa: ");
        String row = reader.nextLine();

        writer.append(row).append(String.valueOf('\n'));

        writer.close();
    }
}
