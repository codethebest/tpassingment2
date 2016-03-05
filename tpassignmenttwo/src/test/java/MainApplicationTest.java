import junit.framework.Assert;
import junit.framework.TestCase;

public class MainApplicationTest extends TestCase {

    MainApplication a = new MainApplication();
    public void testInt()throws Exception {
        {
            Assert.assertEquals(6, a.testInt());

        }
    }

    public void testdouble()throws Exception
    {
        Assert.assertEquals(10.0,a.testDouble());
    }

    public void testString() throws Exception {

        Assert.assertEquals(a.testString(),"Liyolo");
    }


    public void testObjectsEquality() throws Exception {
        String nam1=new String("a");
        String nam2=new String("a");
        Assert.assertEquals(nam1,nam2);

    }


    public void testObjectIdentity() throws Exception {

        String name1=new String("l");
        String name2= name1;
        Assert.assertSame(name1,name2);
    }

    public void testsTruth() throws Exception {
        Assert.assertTrue(a.testTruth());
    }









    public void testFalse() throws Exception {
        Assert.assertFalse(a.getFalse());
    }


    public void testNullness() throws Exception {
        Assert.assertNull(a.getName());
    }



    public void testNulless() throws Exception {
        Assert.assertNotNull(a.getSurname());

    }


/*filling test
    public void testFailing() throws Exception {

        a.getArrayNums();
    }

*/


    public void testExceptions() throws Exception {
        a.generateNums();
    }




    public void testDisabling() throws Exception {
        System.out.print("");
    }



    public void testArrayContent() throws Exception {
        int nums[]=new int[2];
        nums[1]=1;
        Assert.assertEquals(nums[1],nums[1]);
    }

}