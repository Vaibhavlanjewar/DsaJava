// Assuming this file is located in the Bank folder/package
package Bank;

public class Bank {

    public static class Accounts {
        String name;
        protected String email;
        private String password;
        public void setPass(String passWord){
            this.password = passWord;
        }
        public Accounts(String name) {
            this.name = name;
        }
        private String getPass(){
            return password;
        }

        public void printAcHolderName() {
            System.out.println("Account holder:"+this.name);
        }
    }
    public static void main(String[] args) {
        Accounts account1=new Accounts("Vnbl");
        account1.printAcHolderName();
        account1.email="vnbl@gmail.com";
       account1.setPass("xyz@4747");
      System.out.println( account1.getPass());

    }
}

// Data hidding can be achieved by Encapsulation 
// abstraction -->show important property ,methods to user

