package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			
			keyCode = System.in.read();
			
			System.out.println(keyCode);
			
			if(keyCode == 113)	{
			
				System.out.println("끝~");

				break;
			}
			else if (keyCode == 81) {
				
				System.out.println("끝~");

				break;
			}
		}

	}

}