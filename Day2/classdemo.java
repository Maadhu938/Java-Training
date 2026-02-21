class classdemo{
    int x;
    classdemo(int x){
        this.x=x;
    }
    void display(){
        System.out.println("Value of x: "+x);
    }
    public static void main(String args[]){
        classdemo obj=new classdemo(10);
        obj.display();
    }
}