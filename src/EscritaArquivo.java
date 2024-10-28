import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    public static void main(String[] args) {
        // Definir o nome do arquivo
        String nomeArquivo = "exemplo.txt";

        try {
            // Criar um objeto File
            File arquivo = new File(nomeArquivo);

            // Verificar se o arquivo já existe
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            // Criar FileWriter e BufferedWriter para escrever no arquivo
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escrever dados no arquivo
            bw.write("Primeira linha do arquivo.");
            bw.newLine();
            bw.write("Segunda linha do arquivo.");

            // Fechar o BufferedWriter
            bw.close();

            System.out.println("Arquivo escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}
