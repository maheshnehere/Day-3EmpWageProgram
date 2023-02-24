public class WagesTillWorkingDays {
    // UC 6 = Calculate Wages till a condition of total working hours or days is reached for month.

    public static void main(String[] args) {
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int wagePerHour = 20;
        int fullTimeWageForMonth, partTimeWageForMonth;

        Random random = new Random() ;
        //Number of Working Days.

        int num1 = random.nextInt(20)+1;
        System.out.println("Numbers of Total Working Days in Month =" + num1);

        int workingDaysInMonth = num1 ;


        fullTimeWageForMonth = fullTimeHours * wagePerHour * workingDaysInMonth;
        partTimeWageForMonth = partTimeHours * wagePerHour * workingDaysInMonth;


        int num = random.nextInt(3);

        switch (num){
            case(0) :
                System.out.println("Full time Employee Wage for Month is = " + fullTimeWageForMonth);
                break;
            case(2) :
                System.out.println("Part time Employee Wage for Month is = " + partTimeWageForMonth);
                break;
            default:
                System.out.println("Employee is Absent");

        }
    }
}