package classwork.chapter14;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    void showType(){
        System.out.println(" Type T is" + ob.getClass().getName());
    }
}
