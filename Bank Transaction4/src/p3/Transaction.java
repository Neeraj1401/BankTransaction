package p3;
import p2.Balance;
public interface Transaction {
	public static Balance b1=new Balance();
	public abstract int process(double  amt);
	

}
