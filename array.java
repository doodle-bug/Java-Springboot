public class array {
    public static void main(String[] args) {
         
        // int num[] = {3,7,2,4};
        // System.out.println(num[0]);

        // num[0] = 9;
        // System.out.println(num[0]);

        // for(int i = 0; i<=3; i++){
        //     System.out.print(num[i]);
        // }
        // System.out.println();

        int nums[][] = new int[3][4];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                nums[i][j] = (int)(Math.random()*10);
                // Math.random() returns a random double value ranging (0.0, 1.0)
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
