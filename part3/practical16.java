import java.util.Scanner;

class Complex {
    int r, i;
    Scanner s = new Scanner(System.in);

    Complex() {
    }

    Complex(int real, int imag) {
        r = real;
        i = imag;
    }

    void setr() {
        System.out.print("Enter the real part: ");
        r = s.nextInt();
    }

    void seti() {
        System.out.print("Enter the imaginary part: ");
        i = s.nextInt();
    }

    void add(Complex Cx) {
        int sumr = r + Cx.r;
        int sumi = i + Cx.i;
        System.out.println("Sum = " + sumr + " + " + "i" + sumi);
    }

    void product(Complex Cx) {
        int prodr = r * Cx.r - i * Cx.i;
        int prodi = r * Cx.i + i * Cx.r;
        System.out.println("Product = " + prodr + " + " + "i" + prodi);
    }

    void difference(Complex Cx) {
        int diffr = r - Cx.r;
        int diffi = i - Cx.i;
        System.out.println("Difference = " + diffr + " + " + "i" + diffi);
    }
}

class practical16 {
    public static void main(String args[]) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter for c1:");
        c1.setr();
        c1.seti();
        System.out.println("Enter for c2:");
        c2.setr();
        c2.seti();
        c1.add(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}
