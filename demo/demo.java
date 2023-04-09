mport java.util.*;

public class exception_02 {
	    public static void main(String[] args) {
		            try {
				                int a, b;
						            Scanner sc = new Scanner(System.in);
							                a = sc.nextInt();
									            b = sc.nextInt();
										                System.out.println("sum" + (a + b) + "div" + (a / b));

												        } catch (InputMismatchException e) {
														            System.out.println("Dont use the name ONLY enter Number");
															            }

			            catch (ArithmeticException e) {
					                System.out.println("PLZ enter current number");
							        }

				        }
}
