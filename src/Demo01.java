
public class Demo01 {
	public static void printTriangle_1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	  printTriangle_1(5);
	  System.out.println("________________");
}
}
