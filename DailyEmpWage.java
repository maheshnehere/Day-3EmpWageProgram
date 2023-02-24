public class DailyEmpWage {
    // UC 2 = Calculate Daily Employee Wage
    public static void main(String[] args) {
		
        int fullDayHours = 8, wagePerHour = 20,dailyWage = 0;

        dailyWage = fullDayHours * wagePerHour;

        Random random = new Random();
        boolean num = random.nextBoolean();

        if (num == true) { // Employee is present.
            System.out.println("Daily Employee wage is = " + dailyWage);
        } else { // Employee is absent.
            System.out.println("Daily Employee wage is = 0");
        }
    }
}