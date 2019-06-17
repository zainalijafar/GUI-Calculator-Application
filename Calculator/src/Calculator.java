public class Calculator {

	private int value;

	public Calculator() {
	}
	
	public void setValue(int value) {
		
		this.value = value;
	}
	
	public void add(int number) {
		
		this.value = this.value + number;
	}
	
	public void subtract(int number) {
		
		this.value = this.value - number;
	}
	
	public void multiply(int number) {
		
		this.value = this.value * number;
	}
	
	public void divide(int number) {
		
		this.value = this.value/number;
	}
	
	public void clear() {
		
		this.value = 0;
	}
	
	public double getValue() {
		
		return this.value;
	}
}