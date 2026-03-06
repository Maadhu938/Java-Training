public class InterpolationSearch {
    public static int InterpolationSearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high && target>=arr[low] && target<=arr[high]){
            if(low==high){
                if(arr[low]==target){
                    return low;
                }
                else{
                    return -1;
                }
            }
            int pos=low+((target-arr[low])*(high-low))/(arr[high]-arr[low]);
            if(arr[pos]==target){
                return pos;
            }else if (arr[pos]<target){
                low=pos+1;
            }
            else{
                high=pos-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int target=40;
        System.out.println(InterpolationSearch(arr,target));
    }


}