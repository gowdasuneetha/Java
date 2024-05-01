class Employee{
	private int id;
	private String name;
	private String city;
	private long no;
	public void setid(int a) {
		id = a;
	}
	public int  getid() {
		return id;
	}
	
	public void setname(String b) {
		name = b;
	}
	public String getname() {
		return name;
	}
	public void setcity(String c) {
		city = c;
	}
	public String getcity() {
		return city;
	}
	public void setno(long d) {
		no = d;
	}
	public long getno() {
		return no;
		
	}
}
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj = new Employee();
obj.setid(414);
obj.setname("sunitha");
obj.setcity("rajahmundry");
obj.setno(9392627682l);
System.out.println(obj.getid());
System.out.println(obj.getname());
System.out.println(obj.getcity());
System.out.println(obj.getno());
	}

}
