// Name :-Param Thumar
// Roll-no :-21ce144//
import java.util.ArrayList;
public class Prec3_2
{
    public static void main(String[] args)
    {
        Details d[]=new Details[5];
        d[0]=new Details();
        d[1]=new Details();
        d[2]=new Details();
        d[3]=new Details();
        d[4]=new Details();
        ArrayList<Details> object1 =new ArrayList<Details> ();
        object1.add(d[0]);
        object1.add(d[1]);
        object1.add(d[2]);
        object1.add(d[3]);
        object1.add(d[4]);
        for(int i=0;i<5;i++)
        {
            d[i].getPersonalDetails();d[i].getJobDetails();
            System.out.println("\n");
        }
        for(int j=0;j<5;j++)
        {
            d[j].displayPersonalDetails();
            d[j].displayJobDetails();
        }
    }
}