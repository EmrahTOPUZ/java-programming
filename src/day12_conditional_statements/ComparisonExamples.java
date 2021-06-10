package day12_conditional_statements;

public class ComparisonExamples {

    public static void main(String[] args) {

        int currentSpeed = 60;
        int speedLimit = 65;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        currentSpeed += 20;

        isSpeeding = currentSpeed >speedLimit;

        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 200.00;

        System.out.println(itemPrice <= accountBalance);
        System.out.println("The shoes i want it to purchase can i afford it " +(accountBalance >= itemPrice) );

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can Afford = " + canAfford);


        accountBalance = accountBalance -itemPrice;
        accountBalance -= itemPrice;


        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " +isBroke);


    }
}
