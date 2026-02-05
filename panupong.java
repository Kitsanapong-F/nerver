public class panupong {
    public static void main(String[] args) {
       panupong_display.panupong_display();
         display.display();
         show.show();
            bek bek = new bek();
            bek.display();
    }
}

class panupong_display{
    public static void panupong_display(){
        System.out.println("panupong_display_method");
    }
}

class display{
    public static void display(){
        System.out.println("display_method");
    }
}

class show{
    public static void show(){
        System.out.println("hello_world");
    }
}

class bek{
    public void display(){
        System.out.println("bekk_display_method");
    }
}