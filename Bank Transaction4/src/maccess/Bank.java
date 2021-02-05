package maccess;
import java.util.Scanner;
import p1.PinCheck;
import p4.Display;
import p3.Transaction;
public class Bank {
public static void main(String[] arsg) {
	Scanner s=new Scanner(System.in);
	int count=0;
	xyz:
	while(true) {
		System.out.println("Enter the pinNo:");
		String pinNo=s.nextLine();
	
		if(pinNo.length()==4) {
			PinCheck pc=new PinCheck();
			boolean k=pc.verify(Integer.parseInt(pinNo));
			
			if(k) {
			
				System.out.println("...CHOICE...");
				System.out.println("1.WithDraw\n2.Deposit\n3.Payment:");
				int choice=Integer.parseInt(s.nextLine());
				Display d1=new Display();
				 
				switch(choice) 
				 {
				    case 1:         
				    	 System.out.println("Enter the Amt:");
						 int a1=Integer.parseInt(s.nextLine()); 
						 if(a1>0&&a1%100==0) 
						 {
						    
							 d1.dis(a1, new Transaction() {
								 public int process(double amt) {
									if(amt<b1.bal) {
									System.out.println("Amt WithDraw:"+amt);
									 b1.bal=b1.bal-amt;
									 b1.getBalance();
									 System.out.println("Transaction Completed:");
									}else {
										System.out.println("Insufficient bal:");
									}return 0;
							 }
			                   });
				 }else {
				 System.out.println("InValid amt:");
				 }
		         break xyz;
				case 2:
				    System.out.println("Enter the Amt:");
					int a2=Integer.parseInt(s.nextLine());
					if(a2>0&&a2%100==0) {
					
						d1.dis(a2,new Transaction() 
					{
						public int process(double amt) {
						
							System.out.println("Amt Deposited:"+amt);
						b1.bal=b1.bal+amt;
						b1.getBalance();
						System.out.println("Transaction Completed:");
						return 0;
						}
					});
					}else {
					System.out.println("Invalid amt:");
					}
					break xyz;
				case 3:
					System.out.println("Enter the Amt:");
					float a3=Float.parseFloat(s.nextLine());
					if(a3>0)
					{
					
						d1.dis(a3,new Transaction()
					{
						public int process(double amt) {
						if(amt<=b1.bal) {
							System.out.println("Amt Paid:"+amt);
							b1.bal=b1.bal-amt;
							b1.getBalance();
							System.out.println("Transaction Completed:");
						    	
						}else {
							System.out.println("Insufficient fund:");
						}return 0;
						    
				}
						
							});
					}else {
						System.out.println("Invalid amt:");
					}
						break xyz;
			    default:
			    	System.out.println("Wrong choice:");
			    	break xyz;
	
				}
			}
			}else {
			System.out.println("Invalid PinNo:");
            count ++;
	       }
		if(count==3) {
			System.out.println("Sorry! Transaction Blocked:");
			break xyz;
		}
    }
s.close();
    }
}


