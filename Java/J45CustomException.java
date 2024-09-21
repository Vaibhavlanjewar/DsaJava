class CustomException extends Exception{
    public CustomException(String str){
          super(str);
    }
    }
    class A{
        public void show(){
            try{
                Class.forName("Demo");
            }
            catch(ClassNotFoundException e){
                System.out.println("Not ble to find the class "+e);
            }
        }
    } 
public class J45CustomException {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/20;
            if(j==0){
                throw new CustomException("Custom exception");
            }
        }
        catch(Exception e){
        //    handle exception
        j=18/2;
        System.out.println( e);
        }
    }
}
