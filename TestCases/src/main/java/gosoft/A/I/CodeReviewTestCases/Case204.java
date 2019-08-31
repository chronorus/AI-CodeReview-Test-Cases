package gosoft.A.I.CodeReviewTestCases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Case204 {
	private String fileName;

	public void doit() throws IOException {
		FileOutputStream fos = new FileOutputStream (fileName , true);  // fos opened in append mode
		ObjectOutputStream out = new ObjectOutputStream(fos);  // Noncompliant

	}
}
