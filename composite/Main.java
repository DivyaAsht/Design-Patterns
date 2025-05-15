public class Main {
    public static void main(String args[]){
        Department sales = new SalesDept("Sales Department", 1);
        Department finance = new FinanceDept("Finance Department", 2);
        HeadDept head = new HeadDept("Head Department", 3);
        HeadDept root = new HeadDept("root", 4);
        head.addDepartment(finance);
        root.addDepartment(sales);
        root.addDepartment(head);
        head.printDeptname();
    }
}
