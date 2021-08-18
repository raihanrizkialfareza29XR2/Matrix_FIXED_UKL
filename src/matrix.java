public class matrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}};
        int b[][] = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        int h[][] = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};

        for (int i=0; i<6; i++){
            for (int j=0; j<4; j++){
                for (int k=0; k<4; k++){
                    h[j][k] = h[j][k] + a[k][i] * b[i][j];
                }
            }
        }
        for (int j=0; j<4; j++){
            for (int k=0; k<4; k++){
                System.out.print(h[j][k] + "\t");
            }
            System.out.println();
        }
    }
}
