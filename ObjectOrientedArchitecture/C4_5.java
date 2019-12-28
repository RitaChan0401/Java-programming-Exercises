import java.util.Iterator;
import java.util.ArrayList;

public class C4_5 {
	public static void main(String[] args){
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Teacher("T999","高橋"));
		employees.add(new Staff("S100","高田"));
		C4_5.print(employees.iterator());
	}
	public static void print(Iterator<Employee> itr){
		String[] Teach = {"助手","講師","助教授","教授"};
		String[] Staff = {"無し","係長","課長","部長"};
		String msg = "";
		
		for(; itr.hasNext();){
			Employee employee = itr.next();
			if(employee instanceof Teacher){
				msg = Teach[employee.getPostNumber()];
			}else if(employee instanceof Staff){
				msg = Staff[employee.getPostNumber()];
			}
			System.out.print(msg + " ");
			System.out.println(employee.getId() + " " + employee.getName());
		}
	}
}
