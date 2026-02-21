public class NormalSwitchDemo {
    public static void main(String[] args) {

        int day = 2;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            default:
                dayName = "Invalid Day";
        }

        System.out.println("Day is: " + dayName);
    }
}