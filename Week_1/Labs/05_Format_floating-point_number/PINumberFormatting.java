/*
Implement console program which meet the following requirements:

a- Program starts and prints Math.PI five times in console output
b- The first Math.PI contains only one fraction digit
c- The second Math.PI contains two fraction digits
d- The third time Math.PI contains three fraction digits
e- The fourth time Math.PI contains four fraction digits
f- The fifth time Math.PI contains five fraction digits
*/
//Java
    public class PINumberFormatting {
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			System.out.println(String.format("%."+i+"f",Math.PI));
			
		}
		
	}

}


