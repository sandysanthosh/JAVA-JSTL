
public class emplo implements Comparable {

	int id;
    String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public emplo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		emplo e=(emplo) o;
		return 0;
	}
	

    
}
