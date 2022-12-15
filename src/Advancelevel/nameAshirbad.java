package Advancelevel;

public class nameAshirbad {
	private static java.lang.Thread Mil;
	private final static Thread Thread=Mil;
public static void main(String[] args) throws InterruptedException {
	System.out.println("I WANT TO PRINT ASHIRBAD");
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||i==1||j==n||i==n/2+1){
			System.out.print("* ");
			Thread.sleep(100);
			}
			else{
				System.out.print("  ");  
		}
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||(i<n/2+2 && j==1)||i==3||i>n/2+2 && j==n
					||i>n/2 && j==n){
				System.out.print("* ");
			Thread.sleep(100);
				}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==3||j==n){
				System.out.print("* ");
			Thread.sleep(100);
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++){
		if(i==1||j==3||i==n){
			System.out.print("* ");
			Thread.sleep(100);
		}
		else
			System.out.print("  ");
	}
	System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||j==1||i==3||i<n/2+1 && j==n||i==n-1 && j==n/2+1
					||i==n && j==n){
				System.out.print("* ");
				Thread.sleep(100);
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1 && j<=n/2+2||j==1||i==3 && j<=n/2+2
				||i==n && j<=n/2+2||j==n && i==n/2
				||j==n && i==n/2+2){
				System.out.print("* ");
				Thread.sleep(100);
			}
			else
			System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||i==1||j==n||i==n/2+1){
			System.out.print("* ");
			Thread.sleep(100);
			}
			else{
				System.out.print("  ");  
		}
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1 && j<=n/2+2||j==1||i==n && j<=n/2+2
					||i==2 && j==n||i==3 && j==n||i==4 && j==n){
				System.out.print("* ");
				Thread.sleep(100);
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("I DID IT...");
	}
}

