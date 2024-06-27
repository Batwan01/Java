import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_4 implements ActionListener {
	JButton btn_up;
	JButton btn_down;
	JButton btn_reset;
	JTextField txt;
	
	class MyPanel extends JPanel {
		MyPanel() {
			setBackground(Color.gray);
			setPreferredSize(new Dimension(400, 400));
		}
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.drawRect(50,50,300,300);
		}
	}
	STEP_10_GUI_4() {
		JFrame frame = new JFrame("GUI_10_4");
		
		JPanel panel = new MyPanel();
		//panel.setBackground(Color.gray);
		//panel.setPreferredSize(new Dimension(300,300));

		txt = new JTextField("Click count : " + 0);
		txt.setBounds(100 , 100, 200, 30);
		
		btn_up = new JButton("Up");
		btn_up.setBounds(150, 150, 80, 30);

		btn_down = new JButton("Down");
		btn_down.setBounds(150, 200, 80, 30);

		btn_reset = new JButton("reset");
		btn_reset.setBounds(150, 250, 80, 30);

		btn_up.addActionListener(this);
		btn_down.addActionListener(this);
		btn_reset.addActionListener(this);
		JButton btn_end = new JButton("End");
		btn_end.setBounds(150, 300, 80, 30);
		btn_end.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.setLayout(null);
		panel.add(txt);
		panel.add(btn_up);
		panel.add(btn_down);
		panel.add(btn_reset);
		panel.add(btn_end);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	int nc1 = 0;

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Up"))
			txt.setText("count : " + ++nc1);
		else if(e.getActionCommand().equals("Down"))
			txt.setText("count : " + --nc1);
		else{
			txt.setText("count : reset");
			nc1=0;
		}
	}
	public static void main(String[] args) {
		STEP_10_GUI_4 main_obj = new STEP_10_GUI_4();
		System.out.println("Console thread is going out !!!");
	}
}