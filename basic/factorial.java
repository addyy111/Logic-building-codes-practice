package basic;

public class factorial {
    public static void main(String[] args) {
        int input = 5;
        int ans = 1;
        while(input != 1){
            ans *= input--;
        }
        System.out.println(ans);
        System.out.println(ans);

    }
}