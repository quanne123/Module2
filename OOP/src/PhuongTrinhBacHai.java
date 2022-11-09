import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a,b,c;
    double delta;
     PhuongTrinhBacHai(){
         a = 0;
         b = 0;
         c = 0;

    }

    public PhuongTrinhBacHai(double a,double b, double c){
         this.a =a;
         this.b =b;
         this.c= c;
    }
    public double getDiscriminant(){

         return delta = b * b - (4 * a*c);
    }
    public double getRoot1(){
         if (this.getDiscriminant()<0) return 0;
         return (-b + Math.sqrt(delta)) / (2*a);


    }
    public double getRoot2(){
         if (getDiscriminant()<0) return 0;
         return (-b - Math.sqrt(delta)) / (2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println( "Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        PhuongTrinhBacHai PhuongTrinhBacHai = new PhuongTrinhBacHai(a,b,c);
        System.out.println("Your Discriminant is \n :" + PhuongTrinhBacHai.getDiscriminant());
        System.out.println(" Your getRoot1 is: "+ PhuongTrinhBacHai.getRoot1());
        System.out.println("Your getRoot2 is: " + PhuongTrinhBacHai.getRoot2());
         }

}
