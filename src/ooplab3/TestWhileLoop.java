package ooplab3;

public class TestWhileLoop {
    public static void main(String[] args) {
        //whileloop
        int i=1 ;
        while (i<10){
            if (i % 3 == 0 || i % 5 == 0 )
            System.out.println(i+"");
            i++;

        }//while
        System.out.println();
        int j=i;
        do {
            if (i % 3 == 0 && 5 == 0)
                System.out.println(j + "'");
        }while (++j<=100);
        }
    }



