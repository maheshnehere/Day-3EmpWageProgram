public class PartTimeWage {
   
    public static void main(String[] args) {
        int partTime = 4,FullTimeHrs = 8,wagePerHour = 20,partTimeWage = 0,wageFullTime = 0;

        partTimeWage = partTime * wagePerHour;
        wageFullTime = FullTimeHrs * wagePerHour;


        Random random = new Random();
        int num = random.nextInt(3);

        if (num == 0) { // Employee is present.
            System.out.println("Part time Employee Wage  : " + partTimeWage);
        } else if(num == 1){ // Employee is absent.
            System.out.println("Full time Employee Wage  : "+wageFullTime);
        }else {
            System.out.println("Employee is Absent");
        }
    }
}