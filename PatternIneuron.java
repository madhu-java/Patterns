//To print INEURON
public class PatternIneuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n) / 2 || i == n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i == j)) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j ==0 ||i==0||i==n-1 || i==(n-1)/2) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i!=n-1) || (j == n - 1&&i!=n-1)||( i==n-1 && j!=0 && j!=n-1)) {
					//if (( i==n-1 && j!=0 && j!=n-1)) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i==0&&j!=n-1)||(j==n-1&&i>0&&i<(n)/2)||i==(n-1)/2&&j!=n-1||i-j+1 ==(n)/2) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((i==0&&j>0&&j<n-1)||(j==0&&i>0&&i<n-1)||(j==n-1&&i>0&&i<n-1)||(i==n-1&&j>0&&j<n-1)) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i == j)) {

					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");
			System.out.println( );
		}
		System.out.println("------------------------------------------------------------------------------");
		n=4;
		for(int i=1;i<=n;i++ ) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------");
		n=16;
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1||(i+j<=(n-1)/2)||(j-i>=(n-1)/2)) {
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------");
		n=16;
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
				if(i==n-1||(j==0 && i>=(n-1)/2)||(j==n-1 &&i>=(n-1)/2)||(i-j>=(n-1)/2)||(i+j>= (n-1)+(n-1)/2)) {
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------");
		n=16;
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||(i+j<=(n-1)/2)||(i-j>=(n-1)/2)) {
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	

}
