package Day13_SalaryAfterTax;
/*write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary  */
public class Browsers {
    public static void main(String[] args) {
        String browsersName = "firefox";
        // boolen, long, double, float

        switch(browsersName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;

            case "firefox":
                System.out.println("Opening firefox Browser");
                break;

            case "safari":
                System.out.println("Opening safari Browser");
                break;

            case "edge":
                System.out.println("Opening edge Browser");
                break;

            default:
                System.out.println("Invalid Browsers Name");


        }
    }

}
