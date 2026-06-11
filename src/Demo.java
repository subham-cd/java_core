public class Demo<T> {
    private T data;

    public Demo(T data){
        this.data = data;
    }
    public T getData(){
        return data;

    }
    public void setData(T data){
        this.data = data;
    }
    public static void main(String[] args){
       Demo<Integer> d1 = new Demo<>(100);
        System.out.println(d1.getData());

        Demo<String> d2 = new Demo<>("subham");
        System.out.println(d2.getData());
    }
}
