public class BSA {
    //Binary search on array
    public static int minEatingSpeed(int []piles,int h){
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int speed=Integer.MIN_VALUE;
    for(int i=0;i<piles.length;i++){
        if(piles[i]>max){
        max=piles[i];
        }
        if(piles[i]<min){
        min=piles[i];
        }
    }
    int start=0;
    int end=max;
    if(h==piles.length){
        return max;
    }
    while(start<=end){
        int mid=start+(end-start)/2; //mid=speed
        if(isPossible(piles,mid,h)){
            speed=mid;
            end=mid-1;
        }else {
            start=mid+1;
        }
    }
    return speed;
    }
    public static boolean isPossible(int []piles,int speed,int h){
        int time=0;
        for(int val:piles){
            time+=Math.ceil((double)val/speed);
        }
        return time<=h;
    }


    public static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h=5;
        int minSpeed=minEatingSpeed(piles, h);
        System.out.println(minSpeed);
    }
}
