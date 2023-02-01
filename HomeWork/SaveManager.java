public class SaveManager {
    Saveable saveable;

    public SaveManager(Saveable saveable) {
        this.saveable = saveable;
    }

    public void save(String name){
        saveable.save(name);
    }

}
