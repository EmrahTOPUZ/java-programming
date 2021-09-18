package day47_constructors;

public class  AddressList {
    public static void main(String[] args) {

        Address aliSamiYen = new Address();
        aliSamiYen.setStreet("Metin Oktay Tesisleri");
        aliSamiYen.setCity("Florya");
        aliSamiYen.setState("ISTANBUL");
        aliSamiYen.setZipCode("1905");

        System.out.println("GALATASARAY SPOR KULUBU: " +aliSamiYen.toString());
        aliSamiYen.setStreet("TURK TELEKOM SPOR KOMPLEKSI");

        System.out.println("Adres degisikliginden sonra magbet= " +aliSamiYen);
        System.out.println("Street info = " + aliSamiYen.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("Mecidiyekoy Ali Sami Yen Kompleksi");

        System.out.println(newAddress.toString());

        Address papaJon = new Address("1201 Woodlands", "TOMBALL", "TX", "22334");
        System.out.println("Pizzaci PapaJon = " + papaJon);





    }
}
