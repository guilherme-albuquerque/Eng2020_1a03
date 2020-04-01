package ex_5_1;

import java.io.*;

public class IOFacade {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("arquivo.txt");
        try {
            if (!arquivo.exists()) {

                arquivo.createNewFile();
            }

            File[] arquivos = arquivo.listFiles();

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("IOFacade");
            bw.newLine();
            bw.close();
            fw.close();

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {

                String linha = br.readLine();

                System.out.println(linha);
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
