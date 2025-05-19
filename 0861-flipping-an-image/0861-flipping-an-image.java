class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int dim = image.length;

        for(int i = 0; i < dim; i++){
            int start = 0;
            int end = dim - 1;

            while(start <= end){
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;

                start++;
                end--;
            }
        }
        return image;
    }
}