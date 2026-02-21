class Specialnumber{
    public static void main(String args[]){
        int n=19;
        int first=n/10;
        int last=n%10;
        int sum=first+last;
        int product=first*last;

        if(sum+product==n)//if((n%10)+(n/10)+((n%10)*(n/10))==n)
        {
            System.out.println("It is a special number");
        }
        else{
            System.out.println("not a special number ");
        }
    }
}