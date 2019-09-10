package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		//System.out.println(args);
		if(args.length != 3) {
			System.out.println("[사용법]");
			System.out.println("java MainStringArrayArgument <arg> <arg> <arg>");
			System.exit(0);
		}
		String arg1 = args[0];
		String arg2 = args[1];
		String arg3 = args[2];
		System.out.println(arg1);
		System.out.println(arg2);
		System.out.println(arg3);

	}

}
