/**
 * Created by c2614 on 20.10.2014.
 */
import junit.framework.Assert;
import org.testng.annotations.Test;
import java.util.Scanner;
@Test

public class Prime_nubmers {

    public static boolean isPrimeTest (int x) {
         boolean var=false;
        for
                (int i = 2; i < x; i++) {
            if (x % i == 0) {
              var = false;
            } else
               var = true;
        }
        return var;
    }

        @Test
        private void isPrimeTest()  {
            Assert.assertEquals(isPrimeTest(5), true) ;

        }
    }

