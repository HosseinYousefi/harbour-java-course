public class Task1 {
        
    private static int giveMeOne() {
        return 1;
    }
    
    public static void main(String[] args) {
        int one = giveMeOne();
        int two = one * 2;
        System.out.println(two);
    }
}