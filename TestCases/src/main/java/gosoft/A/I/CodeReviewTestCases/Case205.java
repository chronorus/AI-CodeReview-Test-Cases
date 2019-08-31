package gosoft.A.I.CodeReviewTestCases;

public class Case205 {
	private Object monitor;

	public void doSomething() throws InterruptedException{
	  synchronized(monitor) {
	    while(notReady()){
	      Thread.sleep(200);
	    }
	    process();
	  }
	}

	private void process() {
	}

	private boolean notReady() {
		return false;
	}
}
