package com.emz.leetcode;

/**
 * Created by gongming on 15-12-17.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        if (n > 0 && n < 4)
            return true;

        return !(n % 4 == 0);

    }
}
