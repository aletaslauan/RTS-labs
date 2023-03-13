package Lab1.ex1;

class ComplexNumber{
    int real, img;

    public ComplexNumber(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public void show()
    {
        System.out.print(this.real + " +i" + this.img);
    }

    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2)
    {
        ComplexNumber res = new ComplexNumber(0,0);

        res.real = n1.real + n2.real;
        res.img = n1.img + n2.img;

        return res;
    }

    //public static ComplexNumber product()
static void product(int a, int b, int c, int d)
{
    int prod1 = a*c;
    int prod2 = b*d;
    int imag = a*b+d*c;

    int real = prod1 - prod2;


    System.out.println("\nThe product is: "+real+ "+" + imag + "i");
}
}

public class Main {
    public static void main(String[] args) {

        //creating the complex numbers
        ComplexNumber c1 = new ComplexNumber(2,5);
        ComplexNumber c2 = new ComplexNumber(4, -1);

        ComplexNumber res = ComplexNumber.add(c1,c2);
        System.out.println("The addition of the numers : " +c1 +"+" +c2+
                "is" +res );
        res.show();

        int a = 2;
        int b = 5;
        int c = 4;
        int d = -1;

        // Function call
        ComplexNumber.product(a, b, c, d);

    }
}
