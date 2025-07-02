class LTC_plusOne66{
    public static int[] plusOne(int[] digits) {
        // int n=digits.length;
        // int lastDigit=digits[n-1];

        // if(lastDigit>=0 && lastDigit<=8){
        //     int res[]=new int[n];
           
        //     for(int j=0;j<n-1;j++){
        //         res[j]=digits[j];
        //     }
        //      res[n-1]=digits[n-1]+1;
        //     return res;
        // }
        // // IQ start from here Vaibhav
        // // else {
        // //     int res[]=new int[n+1];
        // //     int j=0;
        // //     for(int i:digits){

        // //         res[j++]=i+1;
        // //     }
        // //     res[j]=0;
        // //     return res;
        // // }

        // else{
        // int num=lastDigit;
        // num=num+1;
        // StringBuilder newS=new StringBuilder("");
        // while(num!=0){
        //       int x=num%10;
        //       num/=10;
        //       newS.append((char)(x+'0'));
        //    }
           
        //   String newSRev=newS.reverse().toString(); 
        // //   System.out.println(newSRev);
        //   int sz=newSRev.length();
        //   int res[]=new int[sz];
        //   int i=0;
        //   for(char c:newSRev.toCharArray()){
        //       res[i++]=c-'0';
        //   }
        //    return res;

        // }


    //      StringBuilder xtr=new StringBuilder("");
    //    for(int i:digits){
    //        xtr.append((char)(i+'0'));
    //    }
      
    //     int num=Integer.parseInt(xtr.toString());
    //     num=num+1;
    //     StringBuilder newS=new StringBuilder("");
    //     while(num!=0){
    //           int x=num%10;
    //           num/=10;
    //           newS.append((char)(x+'0'));
    //        }
           
    //       String newSRev=newS.reverse().toString(); 
    //     //   System.out.println(newSRev);
    //       int sz=newSRev.length();
    //       int res[]=new int[sz];
    //       int i=0;
    //       for(char c:newSRev.toCharArray()){
    //           res[i++]=c-'0';
    //       }
          
    //        return res;


      int n=digits.length;

        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }


        // if we are here , it mease we have something like 99,9999...
        int res1[]=new int[n+1];
        res1[0]=1;
        return res1;

}



    public static void main(String args[]){
       // int []digits={1,2,3};
        // int []digits={9,8,7,6,5,4,3,2,1,0};
                int []digits={9,1,9};
        int res[]=plusOne(digits);
        for(int i:res){
            System.out.print(i);
        }
    }
}
