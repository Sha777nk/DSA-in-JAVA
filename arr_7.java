public class arr_7 {
    public static void reverseInGroup(int arr[],int n,int k){
       
        for(int i=0; i<n;i+=k){
            int left = i;
            int right = Math.min(i + k-1, n-1);

            // Reverse the sub-array group
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6};
        int n=arr.length;
        int k=3;
        reverseInGroup(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
