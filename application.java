import java.util.Scanner;
public class application {

    // Method for the welcome page
    public static void welcomePage() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome Page");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Forgotten Credentials");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    signup();
                    break;
                case 2:
                    if (login()) {
                        homePage();
                    } else {
                        System.out.println("Login Failed.");
                    }
                    break;
                case 3:
                    forgottenCredentials();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    // Signup method
    public static void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Signup Page");
        System.out.print("Enter UID: ");
        String uid = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Signup successful!");
    }

    // Login method
    public static boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Page");
        System.out.print("Enter UID: ");
        String uid = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        // Add actual login logic here
        return true;  // Assuming login is successful for now
    }

    // Forgotten Credentials method
    public static void forgottenCredentials() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Forgotten Credentials");
        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.next();
        // Add contact number verification logic here
        System.out.print("Enter new UID: ");
        String newUID = sc.next();
        System.out.print("Enter new Password: ");
        String newPassword = sc.next();
        System.out.println("Credentials updated successfully.");
    }

    // Home page method
    public static void homePage() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Home Page");
            System.out.println("1. Number Program");
            System.out.println("2. Pattern Program");
            System.out.println("3. Swiggy Project");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    numberProgram();
                    break;
                case 2:
                    patternProgram();
                    break;
                case 3:
                    swiggyProject();
                    break;
                case 4:
                    System.out.println("Redirecting to Welcome Page...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    // Number program method
    public static void numberProgram() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Number Program");
            System.out.println("1. Prime Number");
            System.out.println("2. Factorial");
            System.out.println("3. Perfect Number");
            System.out.println("4. Xylem");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkPrimeNumber();
                    break;
                case 2:
                    calculateFactorial();
                    break;
                case 3:
                    checkPerfectNumber();
                    break;
                case 4:
                    checkXylemNumber();
                    break;
                case 5:
                    System.out.println("Returning to Home Page...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }

    public static void checkPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }

    public static void calculateFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1L;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void checkPerfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }

    public static void checkXylemNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int firstDigit = 0, lastDigit = 0, sum = 0;
        lastDigit = num % 10;
        num /= 10;

        while (num >= 10) {
            sum += num % 10;
            num /= 10;
        }
        firstDigit = num;

        if (firstDigit + lastDigit == sum) {
            System.out.println("The number is a Xylem number.");
        } else {
            System.out.println("The number is not a Xylem number.");
        }
    }

    // Pattern program method
    public static void patternProgram() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Pattern Program");
            System.out.println("1. Square with *");
            System.out.println("2. Left Triangle with *");
            System.out.println("3. Right Triangle with *");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Square pattern logic here
                    System.out.print("Enter the pattern: ");
                    int n = sc.nextInt();

                    for (int i=0; i<n; i++){
                        for (int j=0; j<n; j++){
                            if (j==i || i==j+1) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    // Add Left Triangle pattern logic here
                    break;
                case 3:
                    // Add Right Triangle pattern logic here
                    break;
                case 4:
                    System.out.println("Returning to Home Page...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    // Swiggy project placeholder
    public static void swiggyProject() {
        class Swiggy
        {
            static String happyEmoji = "\uD83D\uDE0A";
            static Scanner sc = new Scanner(System.in);
            public static void main(String[] args) throws Exception

            // Welcome message
            {
                System.out.println("-----------------------------------------");
                System.out.println("\t\t\tWelcome to Swiggy!");
                System.out.println("\t\t\t Select the Hotel");
                System.out.println("-----------------------------------------");
                System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Thalapakattu Biryani");
                int hotel = sc.nextInt();//Hotel Selection

                // Entering to the Buhari hotel
                switch (hotel) {
                    case 1: {

                        System.out.println("\t\t\tGreeting from Buhari" + happyEmoji);
                        System.out.println("\t\t\tSelect your Favorite Food");
                        System.out.println("------------------------------------------------");
                        System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Chicken 65");
                        int food = sc.nextInt();//Selecting the Food

                        //Entering to the ordering page for Buhari
                        switch (food) {
                            case 1: {
                                //Quantity
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 380);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 380;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();//Confirmation

                                //Select the payment method
                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000); // Simulate delay for OTP generation
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    // Order Cancelled
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Buhari" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 2: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 280);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 280;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Buhari" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 3: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 180);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 180;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Buhari" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            default: {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("\t\t\tFood Item Selection Failed!!!");
                                System.out.println("------------------------------------------------------------");
                            }
                            break;
                        }
                        break;
                    }

                    case 2: {
                        String happyEmoji = "\uD83D\uDE0A";
                        System.out.println("\t\t\tGreeting from A2B" + happyEmoji);
                        System.out.println("\t\t\tSelect your Favorite Food");
                        System.out.println("------------------------------------------------");
                        System.out.println("1.Mushroom Noodles\n2.Dosa\n3.Pongal");
                        int food = sc.nextInt();

                        switch (food) {
                            case 1: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 250);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 250;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Buhari" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 2: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 100);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 100;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Buhari" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 3: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 140);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 140;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing A2B" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            default: {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("\t\t\tFood Item Selection Failed!!!");
                                System.out.println("------------------------------------------------------------");
                            }
                            break;
                        }
                        break;
                    }


                    case 3: {
                        String happyEmoji = "\uD83D\uDE0A";
                        System.out.println("\t\t\tGreeting from Amma Canteen" + happyEmoji);
                        System.out.println("\t\t\tSelect your Favorite Food");
                        System.out.println("------------------------------------------------");
                        System.out.println("1.Idly\n2.Dosa\n3.Pongal");
                        int food = sc.nextInt();

                        switch (food) {
                            case 1: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 5);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 5;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Amma Canteen" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 2: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 15);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 15;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Amma Canteen" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 3: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 25);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 25;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Amma Canteen" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            default: {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("\t\t\tFood Item Selection Failed!!!");
                                System.out.println("------------------------------------------------------------");
                            }
                            break;
                        }
                        break;
                    }


                    case 4: {
                        String happyEmoji = "\uD83D\uDE0A";
                        System.out.println("\t\t\tGreeting from Thalapakatty Biryani!!!" + happyEmoji);
                        System.out.println("\t\t\tSelect your Favorite Food");
                        System.out.println("------------------------------------------------");
                        System.out.println("1.Chicken Biryani\n2.Chettinad Chicken Masala\n3.Prawn Gravy");
                        int food = sc.nextInt();

                        switch (food) {
                            case 1: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 280);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 280;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Thalapakatty Biryani" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 2: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 310);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 310;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Thalapakatty Biryani" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            case 3: {
                                System.out.print("\t\t\t  Enter the Quantity:");
                                int quantity = sc.nextInt();
                                System.out.println("\t\t\tTotal Bill Amount: " + quantity * 290);
                                System.out.println("------------------------------------------------");
                                double Bill_amount = quantity * 290;
                                System.out.println("1.Continue\n2.Exit");
                                int choice = sc.nextInt();

                                if (choice == 1) {
                                    System.out.println("\t\t\tSelect Payment Method");
                                    System.out.println("------------------------------------------------");
                                    System.out.println("1.Gpay\n2.Phonepe");
                                    int payment = sc.nextInt();

                                    switch (payment) {
                                        case 1: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\t\t\tEnter the Bill amount: ");
                                            double User_Entered_Bill_amount = sc.nextDouble();

                                            if (User_Entered_Bill_amount == Bill_amount) {
                                                System.out.println("\t\t\tEnter the OTP");
                                                System.out.println("------------------------------------------------");
                                                Thread.sleep(2000);
                                                int sys_otp = (int) (Math.random() * 9000 + 1000); // Generate OTP between 1000 and 9999
                                                System.out.println("System OTP: " + sys_otp);
                                                System.out.print("User OTP: ");
                                                int user_otp = sc.nextInt();

                                                if (sys_otp == user_otp) {
                                                    System.out.println("------------------------------------------------");
                                                    System.out.println(" Your Order has been Placed Successfully!!!"+ happyEmoji);
                                                    System.out.println("\tIt will be delivered within 25-30 Mins");
                                                    System.out.println("------------------------------------------------");
                                                } else {
                                                    System.out.println("OTP Mismatch. Order Failed!!!");
                                                }
                                            } else {
                                                System.out.println("Amount Mismatch! Please try again.");
                                            }
                                        }
                                        default: {
                                            System.out.println("------------------------------------------------");
                                            System.out.println("\t\tPayment Method not selected!");
                                            System.out.println("\t\t\tOrder Failed!");
                                            System.out.println("------------------------------------------------");
                                        }
                                        break;
                                    }
                                } else if (choice == 2) {
                                    String happyEmoji_1 = "\uD83D\uDE0A";
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("\t\t\t  Order Cancelled!!!");
                                    System.out.println("\t\tThank you for choosing Thalapakatty Biryani" + happyEmoji_1);
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    System.out.println("------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tInvalid Option!");
                                    System.out.println("\t Your order got cancelled!!! Plesase try again.");
                                    System.out.println("------------------------------------------------------------");
                                }
                            }
                            break;
                            default: {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("\t\t\tFood Item Selection Failed!!!");
                                System.out.println("------------------------------------------------------------");
                            }
                            break;
                        }
                        break;
                    }
                    default: {
                        String sadEmoji = "\uD83D\uDE22";
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Invalid Hotel Selection!!! Please try Again" + sadEmoji);
                        System.out.println("------------------------------------------------------------");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        welcomePage();
    }
}