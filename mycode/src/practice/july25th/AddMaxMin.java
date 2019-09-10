package practice.july25th;

public class AddMaxMin {
	public static void main(String[] args) {
		
		String str = "0123456789";
		int[] arr = new int[5];
		String max = "";
		String min = "";
		
		for(int p=0; p<5; p++) {
			
			int q = 10-p;
			int r = (int)(Math.random()*q);
			arr[p] = str.charAt(r) - 48;
			str = str.substring(0, r) +  str.substring(r+1);		
		}
		
		for(int q=0; q<5; q++) {
			for(int r=q; r<5; r++) {
				
				int temp = arr[q];
				if(arr[q] < arr[r]) {
					arr[q] = arr[r];
					arr[r] = temp;
				}
			}
			max += arr[q];
		}
		
		for(int q=4; q>=0; q--) {
			min += arr[q];
		}
		System.out.println(max + " + " + min + " =");
		System.out.println(Integer.parseInt(max) + Integer.parseInt(min));
		
	}

}
