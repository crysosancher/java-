import java.util.Scanner;

public class zeroAtlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Style op=new Style();
		op.input();
		op.calculate();
		op.print();
		
		
				 

	}

}
class Style{
	int n;
	int array[];
	int count=0;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of terms");
		n=sc.nextInt();
		this.array = new int[n];  
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
	}
	public void calculate() {
		
		for(int i=0;i<n;i++) {
			if(array[i]!=0) {
				array[count++]=array[i];
			}
		}
			while(count<n) {
				array[count++]=0;
			}
	}
	public void print() {
		for(int i=0;i<n;i++)
		System.out.println(array[i]);
	}
}
