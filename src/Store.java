/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class Store implements BookStore {
    MediaAdapter bookPurchase;

    @Override
    public void store(String bookGenre, String fileName) {

        if(bookGenre.equalsIgnoreCase("Ancient")){
            System.out.println("Selling Ancient Book... Name: " + fileName);
        }

        else if(bookGenre.equalsIgnoreCase("Modern")){
            System.out.println("Selling Modern Book... Name: " + fileName);
        }

        else{
            System.out.println("Invalid genre. " + bookGenre + " is unavailable");
        }
    }
}
