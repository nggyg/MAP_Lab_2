package MyPackage;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Model> mlist=new ArrayList<Model>();
        Presentation pres=new Presentation();
        for(int i=0;i<10;i+=2){
            Model m=getModelFromDB("name"+i,""+i,"C"+i);
            mlist.add(m);
        }
        for(Model m:mlist){
            Controller ctr=new Controller(m,pres);
            ctr.updatePresentation();
            //mlist.remove(0);
            System.out.println(mlist.size());
        }
    }

    private static Model getModelFromDB(String name,String id,String cat){
        Model model=new Model();
        model.setName(name);
        model.setId(id);
        model.setCategory(cat);
        return model;
    }
}