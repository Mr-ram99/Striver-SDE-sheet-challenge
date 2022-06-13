public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int count=0;
        while(amount>0){
            if(amount>=1000){
                count += amount/1000;
                amount = amount%1000;
            }
            else if(amount>=500){
                count += amount/500;
                amount = amount%500;
            }
            else if(amount>=100){
                count += amount/100;
                amount = amount%100;
            }
            else if(amount>=50){
                count += amount/50;
                amount = amount%50;
            }
            else if(amount>=20){
                count += amount/20;
                amount = amount%20;
            }
            else if(amount>=10){
                count += amount/10;
                amount = amount%10;
            }
            else if(amount>=5){
                count += amount/5;
                amount = amount%5;
            }
            else if(amount>=2){
                count += amount/2;
                amount = amount%2;
            }
            else {
                count += amount;
                amount = 0;
            }
        }
    return count;
    }
}
