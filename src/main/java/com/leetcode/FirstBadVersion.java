package com.leetcode;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int lowerBadVersion = n;
        int upperGoodVersion = 0;
        do {
            int currentIndex = (upperGoodVersion+(lowerBadVersion-upperGoodVersion)/2);
            if(upperGoodVersion+1 == lowerBadVersion){break;}
            boolean isBad = isBadVersion(currentIndex);
            if(isBad){
                lowerBadVersion = currentIndex;
                continue;
            }
            if(!isBad){
                upperGoodVersion = currentIndex;
            }

        }while(true);
        return lowerBadVersion;
    }

    private boolean isBadVersion(int version){
        if(version>=70){return true;}
        return false;
    }
}
