// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// // M             1000
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        s=s+'*';
     for(int i=0;i<s.length()-1;i++)
     {
        
         char ch=s.charAt(i);
         char ch2=s.charAt(i+1);
          if(ch=='*') return sum;  
         if(ch=='I')
         {
             if(ch2=='V')
             {
             sum=sum+4;
                 i++;
             }
             else if(ch2=='X')
             {
             sum=sum+9;
                 i++;
             }
             else
             sum=sum+1;
             
         }
         else if(ch=='V')
             sum=sum+5;
         else if(ch=='X')
         {
               if(ch=='X'&&ch2=='L')
               {
             sum=sum+40;
                   i++;
               }
         else if(ch=='X'&&ch2=='C')
         {
             sum=sum+90;
             i++;
         }
             else
             sum=sum+10;
         }
         else if(ch=='L')
             sum=sum+50;
         else if(ch=='C')
         {
            if(ch=='C'&&ch2=='D')
            {
             sum=sum+400;
                i++;
            }
         else if(ch=='C'&&ch2=='M')
         {
              sum=sum+900;
             i++;
         }
             else
             sum=sum+100;
         }
                  else if(ch=='D')
             sum=sum+500;
                  else if(ch=='M')
             sum=sum+1000;
     }
        return sum;
    }
}
