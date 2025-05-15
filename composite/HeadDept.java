import java.util.ArrayList;

public class HeadDept implements Department{
    private int id;
    private String name;
    private ArrayList <Department> childDepartment;
    public HeadDept(String name, int id){
        this.name=name;
        this.id=id;
        this.childDepartment=new ArrayList<>();
    }
    public void printDeptname(){
        System.out.println("Head Department");
    }
    public void addDepartment(Department department){
        childDepartment.add(department);
    }
    public void removeDepartment(Department department){
        childDepartment.remove(department);
    }
}