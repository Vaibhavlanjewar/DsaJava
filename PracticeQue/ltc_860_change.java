public class ltc_860_change{
    public boolean lemonadeChange(int[] bills) {
        int fcnt=0;
        int tcnt=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fcnt++;
            }
            else if(bills[i]==10){
                
                if(fcnt==0){
                return false;    
                }
                 fcnt--;
                 tcnt++;
            }
            else{
                
                 if(fcnt>0 && tcnt>0){
                    fcnt--;
                    tcnt--;
                }
                else if(fcnt>=3){
                    fcnt-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}