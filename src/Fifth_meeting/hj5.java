package Fifth_meeting;

class Box<T> {
    T box;

    void set(T box) {
         this.box = box;
    }

    T get() {
        return box;
    }
}

public class hj5 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(new Integer(100)); //i.set(Integer.valueOf(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네");
        System.out.println(s.get());
    }
}
