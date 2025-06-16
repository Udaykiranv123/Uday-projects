
package app;

public class PriorityExample {

	public static void main(String[] args) {
		Thread lowpriorityThread = new Thread(() ->{
		for(int i=0;i<=7;i++) {
			System.out.println("Low priority Thread"+i);
		}
		});
		Thread highPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("High priority Thread");
			}
		});
			lowpriorityThread.setPriority(Thread.MIN_PRIORITY);
			highPriorityThread.setPriority(Thread.MAX_PRIORITY);
			
			lowpriorityThread.start();
			highPriorityThread.start();
		}

	}


