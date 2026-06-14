class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        p = 0
        for i in range(len(flowerbed)):
            if flowerbed[i] == 1:
                continue

            if i != 0 and i != len(flowerbed) - 1:
                if flowerbed[i - 1] == 0 and flowerbed[i + 1] == 0:
                    p += 1
                    flowerbed[i] = 1
            else:
                if i == 0 and len(flowerbed) > 1:
                    if flowerbed[i + 1] == 0:
                        flowerbed[i] = 1
                        p += 1
                else:
                    if len(flowerbed) == 1:
                        p += 1
                    else:
                        if flowerbed[i - 1] == 0:
                            p += 1
        return p >= n;
