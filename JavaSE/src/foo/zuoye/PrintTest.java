package foo.zuoye;

class NumThread extends Thread{
	Count ct = new Count();
	private int i;
	public void run() {
		ct.printNum();
		
	}
}
class AlphaThread extends Thread{
	Count ct = new Count();
	public void run() {
		ct.printAlpha();
		
	}
}


public class PrintTest{
	private String[] alphas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
			"W","X","Y","Z"};
	private int i = 0;
	public static void main(String[] args) {
		new NumThread().start();
		new AlphaThread().start();
	}
}
