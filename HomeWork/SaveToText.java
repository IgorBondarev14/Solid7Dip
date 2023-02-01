public class SaveToText implements Saveable{

    private User user;

    public SaveToText(User user) {
        this.user = user;
    }
    @Override
    public void save(String name) {
        System.out.println("Save user to file .txt: " + user.getName());
    }
}
