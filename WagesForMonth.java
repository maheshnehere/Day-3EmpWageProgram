public class WagesForMonth {
    // UC 5 = Calculating Wages for a month.

    public static void main(String[] args) {
        int FullTimeHrs = 8,partTimeHrs = 4,wagePerHour = 20;
        int workingDaysInMonth = 20,wageForMonth, wageForMonthPartTime;

        wageForMonth = FullTimeHrs * wagePerHour * workingDaysInMonth;
		
        wageForMonthPartTime = partTimeHrs * wagePerHour * workingDaysInMonth;

        Random random = new Random() ;
        int num = random.nextInt(3);

        switch (num){
            case(0) :
                System.out.println("Full time Employee Wage for Month is = " + wageForMonth);
                break;
            case(2) :
                System.out.println("Part time Employee Wage for Month is = " + wageForMonthPartTime);
                break;
            default:
                System.out.println("Employee is Absent");

        }



    }
}
