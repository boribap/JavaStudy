import orange.cal.calculator;

class calculateMain
{
    public static void main(String [] args)
    {
        calculator cal = new calculator();
        System.out.println("1+2 = " + cal.addTwoNumber(1,2));
        cal.showOperatingTimes();
    }
}
