public class SwitchCase {
    
    public static void main(String[] args) {
        int FullTimeHrs = 8;
        int partTimeHrs = 4;
        int wagePerHour = 20;
        int fullTimeWage, partTimeWage;

        fullTimeWage = FullTimeHrs * wagePerHour;
        partTimeWage = partTimeHrs * wagePerHour;

        Random random = new Random();
        int sc = random.nextInt(2);

        switch (sc){
            case(0) :
                System.out.println("Full time Employee Wage  " + fullTimeWage);
                break;
            case(1) :
                System.out.println("Part time Employee Wage  " + partTimeWage);
                break;
            default:
                System.out.println("Employee is Absent");

        }

    }
}