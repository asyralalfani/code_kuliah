import java.util.Scanner;

public class check_odd_even {
    public static void main(String[] args) {
        int number = 1;

        Scanner input = new Scanner(System.in);
		
		try {
			while (number >= 1 && number <= 100) {
				System.out.print("Enter your number : ");
				number = input.nextInt();

				if (number > 100) {
					System.out.print("Your number is outside the range 1 - 100, please try again");
					number = 1;
				} else {
					if ( (number % 2 != 0) || (number % 2 == 0 && number >= 6 && number <= 20)) {
						System.out.println("AJAIB");
					} else if ( (number % 2 == 0 && number >= 2 && number <= 5) || (number % 2 == 0 && number >= 20) ) {
						System.out.println("tidak AJAIB");
					}
					System.out.print("Do you want to try again (y/n) ? : ");
					String confirm = input.next();
					number = confirm.equals("y") ? 1 : 0;
				}
			}
		} catch (Exception e) {
			System.out.println("Please enter number correctly, without decimal or text");
		}

    	input.close();
    }   
}
