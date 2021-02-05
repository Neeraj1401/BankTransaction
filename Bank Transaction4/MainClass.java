package maccess;
import test.SubClass1;
public class MainClass {
public static void main(String[] args) {
	SubClass1 ob1=new SubClass1();
	SubClass1.SubClass2 ob2=ob1.new SubClass2();
	ob2.m2();
}
}
