import java.text.Format;

public abstract class Figura implements Comparable<Figura>{
    public abstract double area();

    @Override
    public int compareTo(Figura otraFigura){
        return Double.compare(this.area(), otraFigura.area());
    }
}
