public class MultifunctionPrinter implements Printable, Scanable{

    @Override
    public void scan(String document) {
       System.out.println("Scanning Document: "+document);
    }

    @Override
    public void print(String document) {
     System.out.println("Printing document is: "+document);
    }
    
}
