class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int p = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                continue;
            }

            if(i != 0 && i != flowerbed.length - 1){
                if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                    p++;
                    flowerbed[i] = 1;
                }
            }
            else{
                if(i == 0 && flowerbed.length > 1){
                    if(flowerbed[i + 1] == 0){
                        flowerbed[i] = 1;
                        p++;
                    }
                }
                else{
                    if(flowerbed.length == 1){
                        p++;
                    }
                    else{
                        if(flowerbed[i - 1] == 0){
                            p++;
                        }
                    }
                }
            }
        }

        return p >= n;
    }
}
