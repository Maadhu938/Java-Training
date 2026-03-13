public class IndirectRecursion {
    static void odd(int n,int limit){
        if(n > limit) return;
        System.out.print(n+1 + " ");
        even(n + 1, limit);//what is the next odd number? it's n+2 but we are calling even with n+1 because even will print n-1 which is the next odd number
    }

    static void even(int n,int limit){
        if(n > limit) return;
        System.out.print(n-1 + " ");
        odd(n + 1, limit);
    }
public static void main(String[] args) {
    int limit = 10;
    odd(1, limit);
}
}