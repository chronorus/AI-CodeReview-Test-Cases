package gosoft.A.I.CodeReviewTestCases;

public class Case202 {
	private Object mon1 = null;
	private Object mon2;

	public void doit() throws InterruptedException {
		synchronized (this.mon1) {
			synchronized (this.mon2) {
				this.mon2.wait();
			}
		}
	}
}

