import java.util.*;
class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        NextGreaterElement nge = new NextGreaterElement();
        System.out.println("Enter the number of element into the array1:");
        int n=sc.nextInt();
        System.out.println("Enter the number of element into the array2:");
        int m=sc.nextInt();
        System.out.println("Enter the elements into the array1 :");
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements into the array2 :");
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nge.nextGreaterElement(nums1, nums2)));
    }
}
