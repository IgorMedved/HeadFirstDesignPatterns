package pattern03b_decorator_javaio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App {

	public static void main(String[] args) throws IOException
	{
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir + " " + File.separator);
		File file = new File (workingDir + File.separator +"test.txt");
		int c;
		
		InputStream stream = new FileInputStream(file);
		stream = new BufferedInputStream(stream);
		stream = new LowerCaseInputStream(stream);
		while ((c= stream.read())>=0)
			System.out.print((char)c);

	}

}
