// Name :-Param Thumar
// Roll-no :-21ce144
interface P3_7
{
    public void Details();
    default void Address()
    {
        System.out.println("Address :-\n'PARAM', Block No.- A/15,\nMiranagar,\nJamnavad Road,\nDhoraji - 360410.");
    }
}
class Demo implements P3_7
{
    public void Details()
    {
        System.out.println("Details:-");
        System.out.println("Name : PARAM THUMAR");
        System.out.println("ID No. : 21CE144");
        System.out.println("Collage name : CSPIT");
        System.out.println("Branch : Computer Engineering");
        System.out.println("Current Sem. : 3");
    }
}
