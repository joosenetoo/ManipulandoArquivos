import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeituraAlunosComVariaveis {
    public static void main(String[] args) throws IOException {
        // Nome do arquivo a ser lido
        String nomeArquivo = "alunos.txt";

        // Verifica se o arquivo existe
        File arquivo = new File(nomeArquivo);

        if (arquivo.exists()) {
            FileReader leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);

            // Lista para armazenar os nomes e matrículas
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<String> matriculas = new ArrayList<>();

            System.out.println("Lendo dados do arquivo e capturando variáveis...");

            // Lendo o conteúdo do arquivo linha a linha
            String linha;
            while ((linha = buffer.readLine()) != null) {
                // Ignorar linhas de cabeçalho
                if (linha.startsWith("Lista") || linha.startsWith("-")) {
                    continue;
                }

                // Separar nome e matrícula com base no delimitador " - Matrícula: "
                String[] partes = linha.split(" - Matrícula: ");
                if (partes.length == 2) {
                    String nome = partes[0];           // Nome do aluno
                    String matricula = partes[1];      // Matrícula do aluno

                    // Armazenar nas listas
                    nomes.add(nome);
                    matriculas.add(matricula);
                }
            }

            // Fechar o buffer após a leitura
            buffer.close();

            // Exibir os dados capturados
            System.out.println("\nDados capturados:");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println("Nome: " + nomes.get(i) + ", Matrícula: " + matriculas.get(i));
            }

        } else {
            System.out.println("O arquivo " + nomeArquivo + " não foi encontrado.");
        }
    }
}
