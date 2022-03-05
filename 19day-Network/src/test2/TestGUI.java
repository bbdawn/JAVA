package test2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TestGUI {
	private JFrame frame;
	public void showUI() {
		frame=new JFrame("gui test");
		frame.setSize(300, 100);
		frame.setLocation(300, 200);
		//gui 프로그램 종료 이벤트 처리 ( 익명anonymous 클래스를 이용 )
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				//시스템 종료
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new TestGUI().showUI();
	}
}
