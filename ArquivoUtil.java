package appNotas;

public class ArquivoUtil {
	public static void salvarTexto(String texto, String caminhoArquivo) throws Exception {

		java.io.FileWriter writer = new java.io.FileWriter(caminhoArquivo);

		writer.write(texto);

		writer.close();
	}
}