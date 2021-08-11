class CPU{
    double price;
    RAM robj;
    Processor pobj;
    CPU(double p,String rmemory,String rmanufacturer,String pmanufacturer,int pcores){
        price=p;
        robj=new RAM(rmemory,rmanufacturer);
        pobj=new Processor(pcores,pmanufacturer);
    }
    class Processor{
        int pcores;
        String pmanufacturer;
        Processor(int pcores,String pmanufacturer){
            this.pcores=pcores;
            this.pmanufacturer=pmanufacturer;
        }
        void pdisplay(){
            System.out.println("Processor Core = "+pcores);
            System.out.println("Processor manufacturer = "+pmanufacturer);
        }
    }
    static class RAM{
        String rmemory;
        String rmanufacturer;
        RAM(String rmemory, String rmanufacturer){
            this.rmemory=rmemory;
            this.rmanufacturer=rmanufacturer;
        }
        void rdisplay(){
            System.out.println("RAM Memory = "+rmemory);
            System.out.println("RAM manufacturer = "+rmanufacturer);
        }
    }
    void display(){
        System.out.println("CPU Price = "+price);
        robj.rdisplay();
        pobj.pdisplay();
    }
}
class Java_8_CPU {
    public static void main(String args[]) {
        CPU c=new CPU(7500,"8 GB","RAMmanufacturer","Processormanufacturer",4);
        c.display();

    }
}