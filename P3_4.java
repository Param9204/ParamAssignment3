// Name :-Param Thumar
// Roll-no :-21ce144
class P3_4
{
    private int number1;
    private int number2;
    //creating constructor
    P3_4(int n1, int n2)
    {
        number1=n1;
        number2=n2;
    }
    //creating method toPrint numbers
    public void toPrint()
    {
        System.out.println("Number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
    }
}
class SubClass extends P3_4
{
    private int number3;
    //creating constructor
    SubClass(int n1, int n2, int n3)
    {
        super(n1,n2);
        number3=n3;
    }
    //override method toPrint numbers
    public void toPrint()
    {
        System.out.println("Number 3 is: "+number3);System.out.println("This is Overridden Method");
    }
}
