public class FinanceDept implements Department{
    private int id;
    private String name;
    public FinanceDept(String name, int id){
        this.name=name;
        this.id=id;
    }
    public void printDeptname(){
        System.out.println("Finance Department");
    }
    
}
