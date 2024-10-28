import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeituraAlunos {
    public static void main(String[] args) throws IOException {
        // Nome do arquivo a ser lido
        String nomeArquivo = "alunos.txt";

        // Criando um objeto File e verificando se o arquivo existe
        File arquivo = new File(nomeArquivo);

        if (arquivo.exists()) {
            // Criando FileReader e BufferedReader para leitura eficiente
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
            System.out.println("-----------------------------------------");

            // Lendo e exibindo o conteúdo linha a linha
            String linha;
            while ((linha = buffer.readLine()) != null) {
                System.out.println(linha);
            }

            // Fechando o buffer após a leitura
            buffer.close();
        } else {
            System.out.println("O arquivo " + nomeArquivo + " não foi encontrado.");
        }
    }
}
