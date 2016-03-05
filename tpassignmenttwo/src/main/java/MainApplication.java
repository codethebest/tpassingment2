/**
 * Created by student on 2016/03/05.
 */
public class MainApplication {

    public int testInt()
    {
        return 6;
    }

    public double testDouble()
    {
        return 10.0;
    }

    public String testString()
    {
        return ("Liyolo");
    }


    public boolean testTruth() throws Exception {
        String word="";
        if(word.equals(""))
            return true;
        else
            return false;
    }

    public boolean getFalse(){
        String name="";
        if (name.equals("LeoLee"))
        {

            return true;
        }
        else {
            return false;
        }
    }

    public String getName(){

        return null;
    }

    public String getSurname(){

        return "null";
    }

    public int getArrayNums()
    {
        int []nums= new int[5];


        nums[2]=22;
        return nums[5];

    }

    public void generateNums() {
        int count =2;

        while(count<2){


        }
    }





}
