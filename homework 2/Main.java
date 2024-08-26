import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner GCD = new Scanner(System.in); // Greatest Common Divisor
        System.out.println("Enter two numbers (a and b) to find the Greatest Common Divisor: ");
        int a = GCD.nextInt();
        int b = GCD.nextInt();
        int Greatest_Common_Divisor = findGCD(a, b);
        System.out.print("Greatest Common Divisor of " + a + " and " + b + " is: ");
        System.out.println(Greatest_Common_Divisor);

        Scanner find_Sum = new Scanner(System.in); 
        System.out.print("Enter a natural number n (The Sum S): ");
        int n_sum = find_Sum.nextInt();
        int sum_a = 0; // Sum of a) i(i+1)
        for(int i=1; i<=n_sum; i++) {
            sum_a += i*(i+1);
        }
        System.out.println("a) The Sum S is: " + sum_a);
        
        int sum_b = 0; // Sum of b) i^2
        for(int i=1; i<=n_sum; i++) {
            sum_b += i*i;
        }
        System.out.println("b) The Sum S is: " + sum_b);
        
        double sum_c = 0; // Sum of c) 1/i
        if(n_sum==0) {
            System.out.println("c) n=0, the expression 1/0 cannot be evaluated, so the sum cannot be calculated.");
        } else {
        for (int i = 1; i <= n_sum; i++) {
            sum_c += 1.0 / i;
        }
        System.out.println("c) The Sum S is: " + sum_c);
        // find the number of divisors of a number
        Scanner find_Divisor = new Scanner(System.in);
        System.out.print("Enter a number to find the number of divisors: ");
        int n_divisor = find_Divisor.nextInt();
        if(n_divisor<=0) {
            System.out.println("cant find the number of divisors of a negative number.");
        } else{
            System.out.println("The number of divisors of " + n_divisor + " is: " + find_divisor(n_divisor));
        } 
        boolean check_prime = isPrime(n_divisor);
        if(check_prime ==true) {
            System.out.println("The number " + n_divisor + " is a prime number.");
        }
        else {
            System.out.println("The number " + n_divisor + " is not a prime number.");
        }
        }
        //a^b 
        Scanner find_Power = new Scanner(System.in);
        System.out.print("Enter two numbers (a is double and b int) to find the power a^b: ");
        double a_power = find_Power.nextDouble();
        int b_power = find_Power.nextInt();
        double power = Math.pow(a_power, b_power);
        System.out.println("The power of " + a_power + " raised to the power of " + b_power + " is: " + power);

        //find the population each year
        Scanner find_Population = new Scanner(System.in);
        System.out.print("Enter n (n is int): ");
        int n_population = find_Population.nextInt();
        int population = 100000;
        System.out.println("The population of the city after " + n_population + " years is: " + ((population*n_population)+5000000));

        //How long will it take to receive the target amount?
        Scanner find_Amount = new Scanner(System.in);
        System.out.print("Enter the initial amount (amount is int): ");
        int initialAmount = find_Amount.nextInt();
        System.out.print("Enter the interestRate amount (amount is double Ex:1.5%/month = 0.015): ");
        double interestRate = find_Amount.nextDouble();
        System.out.print("Enter the target amount (amount is int): ");
        int targetAmount = find_Amount.nextInt();
        double currentAmount = initialAmount;
        int month = 0;
        while(currentAmount < targetAmount) {
            currentAmount += currentAmount * interestRate;
            month++;
        }
        System.out.println("It will take " + month + " months to receive the target amount.");
}

public static int findGCD(int a, int b) {
    int min = Math.min(a, b);
    for(int i = min; i>=1; i--) {
        if(a%i == 0 && b%i == 0) {
            return i;
        }
    }
    return 1;
}

public static int find_divisor(int n) {
    int count = 0;
    for(int i=1; i<=n; i++) {
        if(n%i == 0) {
            count++;
        }
    }
    return count;
}

public static boolean isPrime(int n) {
    if(n<=1) return false;
    if(n == 2) return true;
    if(n%2 == 0) return false;
    int sqrt = (int) Math.sqrt(n);
    for(int i =3;i<=sqrt;i++) {
        if(n%i == 0){
            return false;
        }
    }
    return true;
}

}