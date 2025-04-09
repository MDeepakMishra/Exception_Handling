public class Null_Value_Exp {
    public static void main(String[] args) {
        String s  =null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("null value exception");
        }
    }
}
