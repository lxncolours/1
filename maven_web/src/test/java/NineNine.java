import org.junit.Test;

public class NineNine {
    @Test
    public void NineNine(){
        int x = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = x; j < 10; j++) {
                System.out.print(i+"*"+j +"="+(i * j) +"   ");
            }
            System.out.println();
            x++;
        }
    }

    @Test
    public void test(){
        int x = 3;
        int y = 10;

        x = x ^ y;
        System.out.println(x);
        y = x ^ y;
        System.out.println(y);
        x = x ^ y;
        System.out.println(x);
    }
}
