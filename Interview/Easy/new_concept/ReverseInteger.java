class Solution {
    public int reverse(int x) {
        int lastd=0;
      int rev=0;
        int ne=0;
        while(x!=0)
        {
            lastd=x%10;
            ne=(rev*10)+lastd;
            if((ne-lastd)/10!=rev)
                return 0;
            rev=ne;
            
            x=x/10;
        }
        return rev;
    }
}
