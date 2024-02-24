public static void main(String[] args) {
    Figura[] v = new Figura[4];

    v[0] = new Rectangle(5,3);
    v[1] = new Cercle(5);
    v[2] = new Quadrat(5);
    v[3] = new Cercle(120);

    double res = suma(v);

    System.out.println("suma: "+res);

    print(v.area);

    sort(v.area);

    print(v.area);

}

public static double suma(Figura[] fig){
    double suma = 0;
    for(Figura area : fig){
        suma += fig.area();
    }
    return suma;
}

public static void sort(Figura[] fig){
    Array.sort(fig);
}