
public interface User {
	public String getId();
	public String getName();
	public String getCompellation();
	public void accept(Visitor visitor);
}
