public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		SaveManager sm = new SaveManager(new Persister(user));
		SaveManager sm2 = new SaveManager(new SaveToText(user));
		user.report();
		sm.save(user.getName());
		sm2.save(user.getName());
	}
}