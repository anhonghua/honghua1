package edu.yust.ceceom;

public class Order {

	private int tableNum;
	private String orderedNum;
	private double prive;
public int getTableNum() {
		return tableNum;
	}

	public String getOrderedNum() {
	return orderedNum;
}

public void setOrderedNum(String orderedNum) {
	this.orderedNum = orderedNum;
}

public double getPrive() {
	return prive;
}

public void setPrive(double prive) {
	this.prive = prive;
}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

}
