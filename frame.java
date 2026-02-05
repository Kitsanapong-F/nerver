public class frame {
    public static void main(String[] args) {
        System.out.println("frame");
        display.display();
        show.show();
        bekk bell = new bekk() ;
        bell.display();
        dev.dev();
        bruh.bruh();
        hello_world.hello_world();

        
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

class dev{
    public static void dev(){
        System.out.println("dev_method");
    }
}

class bruh{
    public static void bruh(){
        System.out.println("frame");
    }
}

class hello_world{
    public static void hello_world(){
        System.out.println("hello_world_method");
    }
}