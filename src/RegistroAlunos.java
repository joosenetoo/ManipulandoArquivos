import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RegistroAlunos {
    public static void main(String[] args) throws IOException {
        // Criando uma lista de alunos com nome e matrícula
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Ana Silva - Matrícula: 202301");
        alunos.add("João Souza - Matrícula: 202302");
        alunos.add("Maria Oliveira - Matrícula: 202303");
        alunos.add("Carlos Santos - Matrícula: 202304");

        // Nome do arquivo onde os dados serão gravados
        String nomeArquivo = "alunos.txt";

        // Criando o arquivo e o escritor
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        // Utilizando FileWriter e BufferedWriter para escrever no arquivo
        FileWriter escritor = new FileWriter(arquivo);
        BufferedWriter buffer = new BufferedWriter(escritor);

        // Escrevendo os dados do ArrayList no arquivo
        buffer.write("Lista de Alunos:\n");
        buffer.write("-----------------\n");
        for (String aluno : alunos) {
            buffer.write(aluno);
            buffer.newLine();
        }

        // Fechando o buffer para garantir que os dados sejam gravados
        buffer.close();

        System.out.println("Os dados dos alunos foram gravados em " + nomeArquivo);
    }
}
