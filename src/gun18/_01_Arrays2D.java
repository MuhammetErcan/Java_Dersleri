package gun18;

public class _01_Arrays2D {
    public static void main(String[] args) {
        int [][]nums = new int[3][2];  // 3 satır 2 sütun

        nums[0][0]= 25;
        nums [0][1]=34;

        nums[1][0]=22;
        nums [1][1]=11;

        nums [2][0] =4;
        nums[2][1]=6;
        // nums.lenght => satir uzunluğunu verir.
        // nums [i]. lenght => sütun uzunluğu

        for (int satir = 0; satir < nums.length; satir++) {
            for (int sütun = 0; sütun < nums[satir].length; sütun++) {
                // nums[satir].lenght o an ki satırda kaç sütun olduğuna bakar
                System.out.print(nums[satir][sütun]);

            }
            System.out.println();

        }

    }
}
