package practice;


public class Pract {

    public static void main(String[] args) {
        dreYur(4, 5, 5, 6, 6, 7);
        dreYur();

    }

    public static void dreYur(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }

    public int[] makeEnds(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean double23(int[] nums) {
        return (nums.length > 1 && nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3));
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int[] fix24(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            } else if (nums[i + 1] == 2 && nums[i + 2] == 3) {
                nums[i + 2] = 0;
            }
        }
        return nums;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int a1 = a[0]+a[1];
        int b1 = b[0]+b[1];
        if(a1>b1){
            return a;
        } else if (a1==b1) {
            return a;
        }
        return b;
        }
    public int countCode(String str) {
        int count = 0;
        String co = "co";
        String e = "e";
        if(str.length()<4)
            return 0;
        for(int i=0; i<str.length()-3; i++){
            if(co.compareTo(str.substring(i,i+2))==0 && e.compareTo
                    (str.substring(i+3,i+4))==0)
                count++;
        }
        return count;
    }
}



