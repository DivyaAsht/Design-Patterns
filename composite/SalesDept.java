public class SalesDept implements Department{
    private int id;
    private String name;
    public SalesDept(String name, int id){
        this.name=name;
        this.id=id;
    }
    public void printDeptname(){
        System.out.println("Sales Department");
    }
    
}