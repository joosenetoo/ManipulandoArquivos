import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        // Definir o nome do arquivo a ser lido
        String nomeArquivo = "exemplo.txt";

        try {
            // Criar um objeto File e FileReader
            File arquivo = new File(nomeArquivo);
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            // Ler e imprimir o conteúdo do arquivo
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            // Fechar o BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
