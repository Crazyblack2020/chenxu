package day11.demo03;

public class Body {

    public class Heart{

        //内部类方法

        public void beat() {
            System.out.println("外部类方法");
            System.out.println("心脏跳动");


        }
    }

    public void methodBody() {



        new Heart().beat();

    }


}
