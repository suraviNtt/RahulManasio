package utilities.handler;

public class WaitHandler {

	public static void gethardWait() {
		try {
			Thread.sleep(3000);
			System.out.println("Wait of 3 seconds is applied");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
