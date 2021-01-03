
//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        if(A>B&&A<C||A>C&&A<B)
        {
            return A;
        }
        if(B>A&&B<C||B>C&&B<A)
        {
            return B;
        }
        //if(C>B&&C<A||C>A&&C<B)
        //{
            return C;
        //}
    }
}
