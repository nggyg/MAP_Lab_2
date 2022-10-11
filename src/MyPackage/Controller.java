package MyPackage;

public class Controller {
    private final Model model;
    private final Presentation pres;

    public Controller(Model model, Presentation pres) {
        this.model = model;
        this.pres = pres;
    }

    public void setModelName(String name){
        model.setName(name);
    }
    public void setModelID(String id){
        model.setId(id);
    }
    public void setModelCategory(String cat){
        model.setCategory(cat);
    }
    public String getModelName(){
        return model.getName();
    }
    public String getModelId(){
        return model.getId();
    }
    public String getModelCategory(){
        return model.getCategory();
    }
    public void updatePresentation(){
        pres.printDetails(model.getName(),model.getId(),model.getCategory());
    }
}
