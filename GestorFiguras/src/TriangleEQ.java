public class TriangleEQ extends Figura {
    double h;
    double b;

    public TriangleEQ (double b, double h){
        this.h = h;
        this.b = b;
    }
    public double area(){
        return ((this.h*this.b)/2);
    }
}
