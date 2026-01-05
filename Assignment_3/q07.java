public class q07 {
    static class Rectangle{
        int w;
        int l;
        Rectangle(int w,int l){
            this.w = w;
            this.l = l;
        }

        public int area(){
            return w*l;
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(8, 22);

        if(rect1.area()>rect2.area()){
            System.out.println("rectangle 1 is grater");
        }else{
            System.out.println("Rectangle 2 is grater ");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
}
