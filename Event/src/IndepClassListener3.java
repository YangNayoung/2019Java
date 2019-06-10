import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener3 extends JFrame {
	IndepClassListener3() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);
	}
	
	public static void main(String [] ages) {
		new IndepClassListener3();
	}
}