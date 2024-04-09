public class Lt2678SeniorCitizens_count {
    public static int countSeniors(String[] details) {
        //https://leetcode.com/problems/number-of-senior-citizens/solutions/4983671/simple-and-easy-solution/
        int seniorCitizen=0;
        for(String s:details){
          
          int age=Integer.parseInt(s.substring(11,13));
          if(age>60){
            seniorCitizen++;
          }
        }
        return seniorCitizen;
    }

    public static void main(String args[]){
       String details[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
     System.out.println(countSeniors(details));
    }
}
