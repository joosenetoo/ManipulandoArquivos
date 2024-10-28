import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraCSV {
    public static void main(String[] args) {
        // Caminho do arquivo CSV
        String caminhoArquivo = "alunos.csv";  // Use o caminho adequado no seu sistema

        try {
            // Criando FileReader e BufferedReader para ler o arquivo
            FileReader leitor = new FileReader(caminhoArquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            System.out.println("Lendo dados do arquivo CSV:");

            String linha;
            // Ignorando a primeira linha de cabeçalho
            buffer.readLine();

            int count = 0;

            // Lendo cada linha do arquivo CSV
            while ((linha = buffer.readLine()) != null) {
                // Separando os dados por ponto e vírgula (;)
                String[] dados = linha.split(";");

                // Verificando se há três colunas (Nome, Email e Matrícula)
                if (dados.length == 3) {
                    String nome = dados[0];
                    String email = dados[1];
                    String matricula = dados[2];
                    count++;

                    // Exibindo os dados no console
                    System.out.println("ID: " + count + " | Nome: " + nome + ", Email: " + email + ", Matrícula: " + matricula);
                }
            }

            // Fechando o buffer após a leitura
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
    }
}
