package DSA.RecursionAssignment;

public class AssignmentOne {
    public static void main(String[] args) {
        System.out.println(isPowerOfFive(55));
        System.out.println(isPowerOfFive(25));
    }
    static boolean isPowerOfFive(int n){
        if(n==1){
            return true;
        }
        System.out.println(n);
        if(n <= 0){
            return false;
        }
        return isPowerOfFive(n/5);
    }
}
