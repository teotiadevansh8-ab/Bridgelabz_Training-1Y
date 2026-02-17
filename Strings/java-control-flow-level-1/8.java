class ArrayIndexDemo {
    static void handle() {
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index handled");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}
