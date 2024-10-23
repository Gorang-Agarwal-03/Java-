package Stacks;

import java.util.Stack;

public class celebrityProblem {
    public static int celebrity(int M[][] , int n){
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<n; i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2] == 0){// posiblity of v1 as celeb
                st.push(v1);
            }
            else if(M[v2][v1] == 0){ // posiblity of v2 as celeb
                st.push(v2);
            }

            if(st.size()==0){
                return -1;
            }
            int potential = st.pop();
            for(int j=0;j<n;j++){
                if(M[potential][j] == 1) return-1;
            }
            for(int i=0;i<n;i++){
                if(i==potential) continue;
                if(M[i][potential] == 0) return-1;
            }
            return potential;

        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] M ={{0 ,0 ,1},
                    {0 ,0 ,1},
                    {0 ,0 ,0}};
        int n = M.length;
        System.out.println("Celebrity = "+ celebrity(M, n));
    }
}
