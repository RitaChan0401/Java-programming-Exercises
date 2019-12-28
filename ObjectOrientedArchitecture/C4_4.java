import java.util.Iterator;
import java.util.ArrayList;

public class C4_4 {
	public static void main(String[] args){
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Teacher("T999","高橋"));
		employees.add(new Staff("S100","高田"));
		C4_4.print(employees.iterator());
	}
	public static void print(Iterator<Employee> itr){
		for(; itr.hasNext();){
			Employee employee = itr.next();
			System.out.print(employee.getPostNumber());;
			System.out.print(" " + employee.getId());
			System.out.println(" " + employee.getName());
		}
	}
}