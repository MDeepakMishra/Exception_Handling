public class Finaly_Execu {
    public static void main(String[] args) {
        try{
            int a = 10 ;
            int c = a / 0 ;
        }

        catch(Exception e){
            System.out.println("error");
        }
        finally{
            System.out.println("Finaly Block Execution");
        }
    }
}
