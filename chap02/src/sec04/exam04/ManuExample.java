package sec04.exam04;

public class ManuExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode = 0;
		
		while(true) {
			if(keyCode != 13 && keyCode !=10) {
				System.out.println("---------------------------------");
				System.out.println("1:목록\t2:생성\t3:삭제\t4:종료");
				System.out.println("---------------------------------");
			}
			/*System.out.println("---------------------------------");
			System.out.println("1:목록\t2:생성\t3:삭제\t4:종료");
			System.out.println("---------------------------------");*/
						
			keyCode = System.in.read();
			if (keyCode == 49) {
				System.out.println("목록이 나옵니다.");
			}
			else if (keyCode == 50) {
				System.out.println("생성을 시작합니다.");
			}
			else if (keyCode == 51) {
				System.out.println("삭제를 시작합니다.");
			}
			else if(keyCode == 52) {
				//System.out.println("종료합니다.");
				//break;
				System.exit(0);
			}
			/*else {
				continue;
			}*/
		}
		//System.out.println("종료");

	}

}
