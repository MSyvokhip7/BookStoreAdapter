/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class AncientBook implements UltimateWorldBookStore {
    @Override
    public void sellAncientBook(String fileName) {
        System.out.println("Selling Ancient Book... Name: "+ fileName);
    }

    @Override
    public void sellModernBook(String fileName) {
    }
}
