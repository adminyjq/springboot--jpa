import org.hamcrest.internal.ArrayIterator;
import org.junit.Test;
import org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfiguration;

public class TestArray {
    @Test
    public void test() throws Exception{
        int[] array = new int[]{5,7,6,2,3,4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();

        int i = 0;
        do {
            System.out.print(array[i++]);
        }while (i!=array.length);
        System.out.println();

        int j = 0;
        while(j!=array.length){
            System.out.print(array[j++]);
        }
        System.out.println();
    }

    @Test
    public void test2() throws Exception{

    }
}
