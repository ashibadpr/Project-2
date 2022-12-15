package Advancelevel;

import java.util.Scanner;

class nameSingleLine  extends Thread {
  public void run() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a sentence");
  String str = sc.nextLine();    // AA
  char [] arr= str.toCharArray(); //  A A
  int n = 5 ;
  for (int i = 1; i <= n; i++) {
  for (int a = 0; a < arr.length; a++) {
char ch = arr[a]; // A
for (int j = 1; j <=n; j++) {
if(ch=='A'||ch=='a') {
if( ( i==1 && j!=1 && j!=n) || (j==1 && i!=1) || (j==n && i!=1)|| i==n/2+1) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
}
if(ch==' ') {
System.out.print("        ");
}

if(ch=='A'||ch=='a')
System.out.print("  ");

for (int j = 1; j <=n; j++) {
if(ch=='B'||ch=='b')
if( j==1 || i==1 || i==5 || j==n || i==n/2+1 ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='B'||ch=='b')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='C'||ch=='c')
if( j==1 || i==1 || i==5  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='C'||ch=='c')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='D'||ch=='d')
if( j==1 || (i==1&& j!=n )|| (i==n && j!=n) || (j==n && i!=1 && i!=n)  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='D'||ch=='d')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='E'||ch=='e')
if( j==1 || i==1 || i==n || i==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='E'||ch=='e')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='F'||ch=='f')
if( j==1 || i==1 || i==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='F'||ch=='f')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='G'||ch=='g')
if( j==1 || i==1 || i== n||( i==n/2+1 && j!=2)  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='G'||ch=='g')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='H'||ch=='h')
if( j==1 || j==n || i==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='H'||ch=='h')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='I'||ch=='i')
if( i==1 || i==n || j==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='I'||ch=='i')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='J'||ch=='j')
if( i==1 ||( i==n&& j<=n/2+1) || j==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='J' ||ch=='j')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='K'||ch=='k')
if( j==1 || (i==1&& j==4) || (i==2&& j==3)  || (i==3&&j==2|| (i==4&&j==3) || (i==5&& j==4))) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='K'||ch=='k')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='L'||ch=='l')
if( j==1 || i==n ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='L'||ch=='l')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='M'||ch=='m')
if( j==1 || j==n || (i==j&&j<=n/2+1)  || (i+j==6&& j>=n/2+1) ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='M'||ch=='m')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='N'||ch=='n')
if( j==1 || j==n || i==j  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='N'||ch=='n')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='O'||ch=='o')
if( (j==1&&i!=1&&i!=n) || (i==1&&j!=1&&j!=n) ||( i==n&&j!=1&&j!=n) || (j==n&&i!=1&&i!=n ) ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
    if(ch=='O'||ch=='o')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='P'||ch=='p')
if( j==1 || i==1 || (j==n&&i<=n/2+1) || i==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='P'||ch=='p')
System.out.print(" ");
for (int j = 1; j <=n; j++) {
if(ch=='Q'||ch=='q')
if( j==1 || i==1 || i==n || j==n || (i==j&& i>=n/2+1)  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='Q'||ch=='q')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='R'||ch=='r')
if( j==1 || (i==1&&j!=n) || i==n/2+1 ||(j==n && i!=1) ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='R'||ch=='r')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='S'||ch=='s')
if( (j==1&&i<=n/2+1) || (j==n&&i>=n/2+1) || i==n || i==n/2+1 ||i==1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='S'||ch=='s')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='T'||ch=='t')
if( i==1 || j==n/2+1  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='T'||ch=='t')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='U'||ch=='u')
if( j==1 || i==n || j==n  ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='U'||ch=='u')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='V'||ch=='v')
if( (j==1&&i!=4&&i!=5 )|| (j==n&&i!=4&&i!=5 )||(i==4&&(j==2||j==4)) ||(i==5&&j==3) ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
           if(ch=='V'||ch=='v')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='W'||ch=='w')
if( (j==1 || j==n|| (i==j&&i>=n/2+1) || (i+j==6&&i>=n/2+1)) ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}

if(ch=='W'||ch=='w')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='X'||ch=='x')
if(i==j||i+j==6 ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='X'||ch=='x')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='Y'||ch=='y')
if( (i==j&&i<=n/2+1)|| (i+j==6&&i<=n/2+1) || (j==n/2+1&&i>=3)) {
System.out.print("* ");
try {
Thread.sleep(50);
    } catch (InterruptedException e) {
}
} else {
System.out.print("  ");
}
}
if(ch=='Y'||ch=='y')
System.out.print("  ");
for (int j = 1; j <=n; j++) {
if(ch=='Z'|| ch=='z')
if(  i==1 || i==n || i+j==6 ) {
System.out.print("* ");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
    }
} else {
System.out.print("  ");
    }
     }
if(ch=='Z'||ch=='z')
System.out.print("  ");



}
      System.out.println();
}
 
  }  
 
 }

class DynamicSample {

public static void main(String[] args) {
	nameSingleLine p = new nameSingleLine();
Thread t = new Thread(p);
t.start();
}

}