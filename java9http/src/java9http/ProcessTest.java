package java9http;

public class ProcessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessHandle p=ProcessHandle.current(); 
		/*long pid=p.pid(); 
		System.out.println("The PID of current running JVM instance :"+pid); 
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		ProcessHandle.Info info=p.info();
		System.out.println("Complete Process Inforamtion:\n"+info); 
		System.out.println("User: "+info.user().get()); 
		System.out.println("Command: "+info.command().get());
		System.out.println("Start Time: "+info.startInstant().get());
		System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());

	}

}
