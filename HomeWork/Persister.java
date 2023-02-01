public class Persister implements Saveable{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}

	public void save(String name){
		System.out.println("Save user: " + user.getName());
	}
}