public class nyoba_3x4 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4}, {2,3,4,5}, {6,7,8,9}};
        int b[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int h[][] = {{0,0,0}, {0,0,0}, {0,0,0}};

        for (int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<3; k++){
                    h[j][k] = h[j][k] + a[j][i] * b[i][k];
                }
            }
        }
        for (int j=0; j<3; j++){
            for (int k=0; k<3; k++){
                System.out.print(h[j][k] + "\t");
            }
            System.out.println();
        }
    }
}
