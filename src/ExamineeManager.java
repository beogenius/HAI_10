import java.util.ArrayList;
import java.util.List;

public class ExamineeManager {

    List<Examinee> list = new ArrayList<>();

    public void add(Examinee e){
        this.list.add(e);
    }

    public void showInfo(){
        for (Examinee e : list ) {
            System.out.println(e.toString());
        }
    }

    public Examinee searchByID(String id) {
        for (Examinee e : list) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;

    }
}
