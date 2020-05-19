package Pro4;

class Solution {
    public long solution(int n, int r, int c) {
         long[][] arr = new long[n][n];

            arr[0][0] = 1;

            arr[n-1][n-1] = n*n;

            long count=1;
            long total = n*n;

            int x = 0;
            int y = -1;
            boolean check = false;
            while(y != r || x != c) {

                if(x == n-1 && count <= total) {
                    arr[++y][x] = count++;
                    check =false;
                }

                if(y==n-1&&count<=total) {
                    arr[y][++x]=count++;
                    check = true;
                }
                if(y==0&&count<=total) {
                    arr[y][++x]=count++;
                    check = false;
                }
                if(x == 0 && count <= total) {
                    arr[++y][x] = count++;
                    check = true;
                }

                if(check && x != n-1 && y != 0 && count <= total) {
                    arr[--y][++x] = count++;
                }
                if(!check && y != n-1 && x != 0 && count <= total) {
                    arr[++y][--x] = count++;
                }
            }


            return arr[r-1][c-1];
    }
}