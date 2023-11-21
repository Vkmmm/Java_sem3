package pr18.ex123;
import java.io.Serializable;
public class Class<T extends Comparable<T>, V extends Animal & Serializable, K> {
    T t;
    V v;
    K k;
    Class(T t,V v,K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return t.getClass() + " " + v.getClass() + " " + k.getClass();
    }

}
