import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class AddClickListener implements ActionListener {

	private JTextField firstNumber;  
	private Calculator calc;
	private JTextField secondNumber;
	private JTextField record;
	private List<String> operations;
	private String concat = "";
	private List<String> allOperations;
	private String everyOperation;
	private int tracking;
	
	public AddClickListener(JTextField firstNumber,JTextField secondNumber,JTextField record,Calculator calc) {
		
		this.calc = calc;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.record = record;
		this.operations = new ArrayList<>();
		this.allOperations = new ArrayList<>();
		this.tracking = 0;
		this.everyOperation = "";
	}	
	
	public void actionPerformed(ActionEvent ae) {
		
		String s = ae.getActionCommand();
		
		if(checkInput(s)) {
			
			numericalOperation(s);
			
		}else if (s.equals("+")) {
			
			operations(s);
			
		}else if (s.equals("-")) {
			
			operations(s);
			
		}else if (s.equals("x")) {
			
			operations(s);

		}else if (s.equals("/")) {
			
			operations(s);
			
		}else if (s.equals("=")) {
			
			this.allOperations.add(s);
			this.everyOperation = this.everyOperation + this.allOperations.get(tracking);
			this.record.setText(this.everyOperation);
			this.tracking++;
			String sNumber = this.firstNumber.getText();
			int intsNumber = Integer.parseInt(sNumber);
			
			if(this.operations.get(0)=="+") {
				
				this.calc.add(intsNumber);
			
			}else if (this.operations.get(0)=="-") {
				this.calc.subtract(intsNumber);
				
			}else if (this.operations.get(0)=="x") {
				
				this.calc.multiply(intsNumber);
				
			}else if(this.operations.get(0)=="/") {
				
				this.calc.divide(intsNumber);
			}
			
			this.secondNumber.setText(Double.toString(this.calc.getValue()));
		}
		
		if(s.equals("C")) {
			
			this.calc.clear();
			this.concat = "";
			this.everyOperation = "";
			this.firstNumber.setText(this.concat);
			this.secondNumber.setText(this.everyOperation);
			this.record.setText(this.everyOperation);
		}
	}
	
	public boolean checkInput(String s) {
		
		if(s=="1"||s=="2"||s=="3"||s=="4"||s=="5"||s=="6"||
				s=="7"||s=="8"||s=="9"||s=="0") {
			return true;
		}
		return false;
	}
	
	public void numericalOperation(String s) {
		
		this.concat = this.concat + s;
		this.firstNumber.setText(this.concat);
		this.allOperations.add(s);
		this.everyOperation = this.everyOperation + this.allOperations.get(tracking);
		this.record.setText(this.everyOperation);
		this.tracking++;
	}
	
	public void operations(String s) {
		
		this.operations.add(s);
		this.allOperations.add(s);
		this.everyOperation = this.everyOperation + this.allOperations.get(tracking);
		this.record.setText(this.everyOperation);
		this.tracking++;
		String fNumber = this.firstNumber.getText();
		int intfNumber = Integer.parseInt(fNumber);
		this.firstNumber.setText("");
		this.concat = "";
		this.calc.setValue(intfNumber);
	}
}