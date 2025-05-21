package DAY_10;


class DeviceFailureException extends Exception {
    public DeviceFailureException(String message) {
        super(message);
    }
}


public class Device {
    public static void main(String[] args) {
        try {
           
            if (args.length == 0) {
                throw new IllegalArgumentException("No device name provided");
            }
            String c = args[0];
            if (c.equals("printer1") || c.equals("printer3")) {
                System.out.println("Available");
            } else {
                throw new DeviceFailureException("Not Available");
            }
        } catch (DeviceFailureException e) {
            System.out.println("Device failure: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


