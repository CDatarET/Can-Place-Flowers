public class Solution {
    public bool CanPlaceFlowers(int[] flowerbed, int n) {
        int p = 0;
        for(int i = 0; i < flowerbed.Length; i++){
            if(flowerbed[i] == 1) continue;

            if(i != 0 && i != flowerbed.Length - 1){
                if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                    p++;
                    flowerbed[i] = 1;
                }
            }
            else{
                if(i == 0 && flowerbed.Length > 1){
                    if(flowerbed[i + 1] == 0){
                        flowerbed[i] = 1;
                        p++;
                    }
                }
                else{
                    if(flowerbed.Length == 1) p++;
                    else if(flowerbed[i - 1] == 0) p++;
                }
            }
        }

        return p >= n;
    }
}
