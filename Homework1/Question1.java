import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        Scanner Student = new Scanner(System.in);
        Scanner Math_Input = new Scanner(System.in);

        System.out.println("Enter your point: ");
        double Point = Student.nextDouble();
        String Compare = Point>=5 ? "pass" : "false";
        System.out.println(Compare); // check đậu rớt

        String Check_Average = (Point>=8) ? "GIỎI" : (Point<8 &&Point>=6.5) ? "KHÁ" : (Point<6.5 &&Point>=5) ? "TRUNG BÌNH" : (Point<5 &&Point>=3.5) ? "YẾU" : "KÉM";
        System.out.println(Check_Average); //Check học sinh loại gì

        System.out.println("Enter a,b,c to ax+b=? and ax^2 +bx +c=? : ");
        double a = Math_Input.nextDouble();
        double b  = Math_Input.nextDouble();
        double c = Math_Input.nextDouble();
        double x = -b/a;
        System.out.println("Linear Equation:");
        String linear_equation = a==0 ? "The equation has no real solutions." : Double.toString(x);
        System.out.println("The equation has a solution x = "+linear_equation);
        double delta = b*b - 4*a*c;
        System.out.println("Quadratic Equation: ");
        if(delta == 0){
            double x1 = -b/(2*a);
            System.out.println("The equation has one double root x1 = x2 = " + x1);
    } else if (delta >0 ){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The equation has two distinct solutions x1 = " + x1 + " and x2 = " + x2);
        } else {
            System.out.println("The equation has no real solutions.");
        }
    }
}