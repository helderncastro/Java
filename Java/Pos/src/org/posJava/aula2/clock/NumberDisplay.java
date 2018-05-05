package org.posJava.aula2.clock;

public class NumberDisplay {
	private int limit;
	private int value;

	public NumberDisplay() {
		super();
	}

	public NumberDisplay(int limit, int value) {

		setLimit(limit);
		setValue(value);
	}

	public boolean incZera() {

		if (value == limit) {
			value = 0;
			return true;
		} else {
			value++;
			return false;
		}
	}

	public String getDisplayValue() {
		if (value < 10) {
			return "0" + value;
		} else {
			return "" + value;
		}
	}

	public int getValue() {
		
		return value;
	}

	public void setValue(int atualizaValor) {
		if ((atualizaValor >= 0) && (atualizaValor < limit)) {
			value = atualizaValor;
		}
	}

	public void increment() {
		value = (value + 1) % limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Override
	public String toString() {
		return (value < 10) ? "0" + value : String.valueOf(value);
	}
	
}
