public class get_set_clear_ith_bit {
    public static int getIthbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, newBit);
        // }

        // or
        n=clearIthBit(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }

    public static int clearIBits(int n,int i){
        int bitMask=( ~0 )<<i;
        return n&bitMask;
    }

    // clear bits in range
    public static int clearBitsInRange(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<j)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
    public static void main(String args[]){
        //get ith bit 
        System.out.println(getIthbit(10, 2)); //0
        // set ith bit 
        System.out.println(setIthBit(10, 0)); //11

        // clear ith bit
        System.out.println(clearIthBit(10, 2)); //10

        // update ith bit 
        System.out.println(updateIthBit(10, 2, 1)); //14

        // clear I no.of bit 
        System.out.println(clearIBits(10, 2)); //8

        // clear bits in range
        System.out.println(clearBitsInRange(10,2,4)); //10

    }
}
