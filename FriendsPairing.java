public class FriendsPairing {
    static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //kamm 
        //for single people
        int fnm1=friendsPairing(n-1);
        //for pairing pepole
        int fnm2=friendsPairing(n-2);
        int pairWay=(n-1)*fnm2;
        int totWays =fnm1+pairWay;
        return totWays;

    }
    
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
            
    }
    
}
