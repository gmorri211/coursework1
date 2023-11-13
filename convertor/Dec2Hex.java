package convertor;

import java.util.logging.Logger;

class Dec2Hex
{
    private static final Logger log = Logger.getLogger(Dec2Hex.class.getName());

    static int status = 0;
    static String hexadecimal = "";

    public static void main(String[] args)
    {
        if(args.length==0){
            status = 1;
            log.info("Error: No input found.");
        }
        else {
            try {
                int arg1 = Integer.parseInt(args[0]);
                char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem;
                int num;
                num = arg1;
                String numString = "Converting the Decimal Value " + num + " to Hex...";
                log.info(numString);

                StringBuilder hexBuilder = new StringBuilder();
                while (num != 0) {
                    rem = num % 16;
                    hexBuilder.insert(0, ch[rem]);
                    num = num / 16;
                }
                hexadecimal = hexBuilder.toString();
                String hexadecimalMsg = "Hexadecimal representation is: " + hexadecimal;
                log.info(hexadecimalMsg);
            } catch (NumberFormatException e){
                status = 2;
                log.info("Error: Non-integer entered.");
            }
        }
    }
}
