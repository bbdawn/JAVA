package step14;

public class Theater implements Runnable{
	private int seatNum=1;
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		reserve(name);
	}
	public synchronized void reserve(String guestName) {
		System.out.println(guestName+"´Ô "+seatNum+"¹ø ¿µÈ­ÁÂ¼®¿¹¸Å");
		seatNum++;
	}
}
