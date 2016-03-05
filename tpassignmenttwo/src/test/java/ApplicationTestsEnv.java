import junit.framework.Assert;

/**
 * Created by student on 2016/03/05.
 */
public class ApplicationTestsEnv {

    MainApplication a = new MainApplication();

    public void testInt()
    {
        Assert.assertEquals(2,a.testInt());

    }
}
