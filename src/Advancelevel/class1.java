package Advancelevel;

public class class1 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			System.out.print(i+""+j+" ");
		}
		System.out.println();
	}
	System.out.println("----------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1 && j<=3||i==3 && j<=3 ||j==1 && i<=3||
				j==3 && i<=3|| i-j==0 && i>=3){
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("----------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1 && j>=2 && j!=n||j==n && i>=2 && i!=n||
				j==1 && i>=n/2 && i!=n||i==n && j>=2 && j!=n){
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------------------");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1 && i<=3||j==n && i<=3||i-j==2 && i>=3
				||j==4 && i==4){
				System.out.print("* ");
				}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("----------------");
}
}
