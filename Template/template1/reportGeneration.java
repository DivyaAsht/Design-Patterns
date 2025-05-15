public abstract class reportGeneration {
    protected String name;
    public reportGeneration(String name){
        this.name=name;
    }
    final void prepareReport(){
        fetchdata(name);
        processdata(name);
        formatdata(name);
    }
    abstract void formatdata(String name);
    public void fetchdata(String name){
        System.out.println("Fetching data : "+name);
    }
    public void processdata(String name){
        System.out.println("Processing data :"+name);
    }  
}
