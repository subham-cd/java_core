public class SubDemo<T,S> extends Demo<T> {
    private S value;

    public SubDemo(T data,S value) {
        super(data);
        this.value = value;
    }

    public void setValue(S value) {
        this.value = value;
    }

    public S getValue() {
        return value;
    }

    public static void main(String[] args) {
        SubDemo<String,Integer> sd = new SubDemo<>("POLO",21);
        System.out.println(sd.getData()+ ","+sd.getValue());
    }
}
