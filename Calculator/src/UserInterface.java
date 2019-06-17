import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable{

	private JFrame Jframe;
	
	public UserInterface() {	
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Calculator");
		this.Jframe.setPreferredSize(new Dimension(350,450));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(this.Jframe.getContentPane());
		
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponents(Container container) {
		
		GridLayout layout = new GridLayout(4,1);
		container.setLayout(layout);
		
		JTextField record = new JTextField();
		JTextField output = new JTextField();
		JTextField input = new JTextField();
		
		JPanel panel = new JPanel(new GridLayout(4,5));			
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton division = new JButton("/");
		JButton multiplication = new JButton("x");
		JButton subtraction = new JButton("-");
		JButton addition = new JButton("+");
		JButton sqrt = new JButton("sqrt");
		JButton equal = new JButton("=");
		JButton decimal = new JButton(".");
		JButton power = new JButton("1/x");
		JButton percentage = new JButton("%");
		JButton rand = new JButton("C");
		
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(division);
		panel.add(sqrt);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(multiplication);
		panel.add(percentage);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(subtraction);
		panel.add(power);
		panel.add(zero);
		panel.add(rand);
		panel.add(decimal);
		panel.add(addition);
		panel.add(equal);
		
		Calculator calc = new Calculator();
		
		AddClickListener addClicker = new AddClickListener(output,input,record,calc);
		
		zero.addActionListener(addClicker);
		one.addActionListener(addClicker);
		two.addActionListener(addClicker);
		three.addActionListener(addClicker);
		four.addActionListener(addClicker);
		five.addActionListener(addClicker);
		six.addActionListener(addClicker);
		seven.addActionListener(addClicker);
		eight.addActionListener(addClicker);
		nine.addActionListener(addClicker);
		addition.addActionListener(addClicker);
		equal.addActionListener(addClicker);
		subtraction.addActionListener(addClicker);
		multiplication.addActionListener(addClicker);
		division.addActionListener(addClicker);
		rand.addActionListener(addClicker);
		
		container.add(record);
		container.add(output);
		container.add(input);
		container.add(panel,BorderLayout.SOUTH);
	}
	
	public JFrame getJframe() {
		
		return this.Jframe;
	}
}