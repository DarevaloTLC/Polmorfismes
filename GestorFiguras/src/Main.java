import java.util.Arrays;
public static void main(String[] args) {
    Figura[] v = new Figura[4];

    v[0] = new Rectangle(10,3);
    v[1] = new Cercle(10);
    v[2] = new Quadrat(20);
    v[3] = new TriangleEQ(20,5);

    double res = suma(v);

    System.out.println(STR."suma: \{res}");
    System.out.println(" ");

    print(v);
    System.out.println(" ");

    sort(v);

    print(v);

}

public static double suma(Figura[] fig){
    double res = 0;
    for(Figura figura : fig){
        res+= figura.area();
    }
    return res;
}

public static void sort(Figura[] figures){
    Arrays.sort(figures);
}
public static void print(Figura[] fig){
    for(Figura figura : fig){
        System.out.println((figura.area()));
    }
}



