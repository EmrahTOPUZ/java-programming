package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---- Start deployment of etsy app to AWS zones-----");

        String [] zoneArray = zones.split(",");

        for (String zones1 : zoneArray){
            System.out.println("Deploying [" +app+"] to " + zones1 + "...");
            System.out.println("Deployment completed for " + zones1 + "...");
        }

        System.out.println("--All deployment complete, traffic enabled----");


    }
}
