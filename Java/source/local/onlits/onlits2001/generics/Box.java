package local.onlits.onlits2001.generics;

public class Box<T> {
    private T t;            //instance variable

    public void set(T t) {this.t = t;}
    public T get() { return t; }
}