class Demo {
    static int x;    
    static {
        x=10;
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
