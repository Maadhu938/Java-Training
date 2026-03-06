public class JumpSearchAlgo {
    public static int jumpSearch(int[] arr,int target) {

        int n = arr.length;
        int jump = (int) (Math.sqrt(n));
        int prev = 0;
        while (prev < n && arr[Math.min(jump, n) - 1] < target) {
            prev = jump;
            jump += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }

        }
        for (int i = prev; i < Math.min(jump, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args){
            int[] arr={10,20,30,40,50,60,70,80,90,100,110};
            int target=110;
            System.out.println(jumpSearch(arr,target));
        }
    }