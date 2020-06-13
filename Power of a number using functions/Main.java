import java.util.Scanner;
class Main {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int base = in.nextInt();
int power = in.nextInt();
System.out.println(power(base,power));
	}
public static int power(int n1,int n2) {
	int ans = 1;
while(n2>=1) {
	ans = ans*n1;
	n2--;
}
return ans;
}
}
