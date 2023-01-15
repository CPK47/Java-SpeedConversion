public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Speed conversion: ");
        System.out.print("Test Data: ");
        SpeedConverter.printConversion(1.5);
        System.out.print("Test Data: ");
        SpeedConverter.printConversion(10.25);
        System.out.print("Test Data: ");
        SpeedConverter.printConversion(-5.6);
        System.out.print("Test Data: ");
        SpeedConverter.printConversion(25.42);
        System.out.print("Test Data: ");
        SpeedConverter.printConversion(75.114);
    }

    public class SpeedConverter
    {
        public static long toMilesPerHour(double kilometersPerHour)
        {
            if (kilometersPerHour < 0) return -1;
            else
            {
                double milesPerHour = kilometersPerHour / 1.609;
                return Math.round(milesPerHour);
            }
        }

        public static void printConversion(double kilometersPerHour)
        {
            if (kilometersPerHour < 0) System.out.println("Invalid Value");
            else System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
        }
    }
}