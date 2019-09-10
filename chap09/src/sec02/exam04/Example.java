package sec02.exam04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setTitle("나의 첫 자바 실행 파일");
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		frame.setSize(400,300);
		frame.setVisible(true);
		
		
		
		

	}

}
