package BaiTap;
import java.util.Scanner;

public class IllegalTriangle {
    private String str;

    private int a ;
    private int b ;
    private int c ;

    public IllegalTriangle() {
    }

    public IllegalTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void triangleException() throws Triangle {
        if (a<=0 || b<=0 || c<=0 || a+b<=c|| a+c<=b||b+c<=a) {
            throw new Triangle() ;
        }
    }
}
