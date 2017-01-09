/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class MediaAdapter implements BookStore {
    UltimateWorldBookStore advancedBookStore;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("Ancient") ){
            advancedBookStore = new AncientBook();

        }else if (audioType.equalsIgnoreCase("Modern")){
            advancedBookStore = new ModernBook();
        }
    }

    @Override
    public void store(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("Ancient")){
            advancedBookStore.sellAncientBook(fileName);
        }
        else if(audioType.equalsIgnoreCase("Modern")){
            advancedBookStore.sellModernBook(fileName);
        }
    }
}
