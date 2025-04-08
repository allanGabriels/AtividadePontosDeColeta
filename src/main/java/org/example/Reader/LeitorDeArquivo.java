package org.example.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorDeArquivo {

    private Scanner leitor;

    //Construtor também abre o arquivo
    public LeitorDeArquivo(String nomeArquivo) {
        try { //Tenta atribuir o aquivo e cria um scanner para ele
            File arquivo = new File(nomeArquivo);
            leitor = new Scanner(arquivo);
        } catch (FileNotFoundException e) { //se não conseguir, demonstra o erro.
            System.out.println("Erro ao abrir o arquivo: " + nomeArquivo);
            e.printStackTrace();
        }
    }

    public String lerProximaLinha() {
        if (leitor != null && leitor.hasNextLine()) { //se o leitor existir e a próxima linha existir
            return leitor.nextLine(); //retorna a próxima linha
        }
        return null; // se não, retorna null
    }

    public void fechar() {
        if (leitor != null) { // se leitor existir
            leitor.close(); //fecha o leitor
        }
    }
}
