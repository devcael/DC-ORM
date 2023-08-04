package org.example;

import java.io.IOException;
import java.io.OutputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        String command = "sudo mysqldump -u asnweb asn produto > /home/devcael/1.sql";

        try {
            Process process = new ProcessBuilder("bash",  command).start();

            OutputStream outputStream = process.getOutputStream();
            outputStream.write("webasnsoft@\n".getBytes());
            outputStream.flush();
            outputStream.close();

            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);

            if (exitCode == 0) {
                System.out.println("Comando executado com sucesso.");
            } else {
                System.out.println("Erro ao executar o comando.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}