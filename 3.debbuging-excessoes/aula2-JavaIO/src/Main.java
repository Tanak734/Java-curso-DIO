import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FilePersistence persistence = new IOFilePersistence("user.csv");
		System.out.println(persistence.write("felipe;felipe@felipe.com;31/03/2007"));

	}
}
