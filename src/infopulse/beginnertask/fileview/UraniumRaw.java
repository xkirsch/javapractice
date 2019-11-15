package infopulse.beginnertask.fileview;

public class UraniumRaw {

private int year;
private int month;
private int code;
private double amount;
private String activity;

public UraniumRaw( int year, int month, int code, double amount, String activity) {
	super();
	this.year = year;
	this.month = month;
	this.code = code;
	this.amount = amount;
	this.activity = activity;
	
}

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}


public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}


public String getActivity() {
	return activity;
}

public void setActivity(String activity) {
	this.activity = activity;
}

@Override
public String toString() {
	return " [year=" + year + ", month=" + month + ", code=" + code+ ", amount=" + amount+   ", activity=" + activity+    "]";
}


}
