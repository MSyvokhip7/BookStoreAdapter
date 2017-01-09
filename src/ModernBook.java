/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class ModernBook implements UltimateWorldBookStore {
    @Override
    public void sellAncientBook(String fileName) {
    }

    @Override
    public void sellModernBook(String fileName) {
        System.out.println("Selling Modern Book... Name: "+ fileName);
    }
}
