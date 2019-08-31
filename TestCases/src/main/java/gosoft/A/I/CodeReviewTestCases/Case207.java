package gosoft.A.I.CodeReviewTestCases;

public class Case207 {
	public void doit() throws InterruptedException {
		Thread myThread = new Thread(new RunnableJob());
		myThread.wait(2000);
	}
}
