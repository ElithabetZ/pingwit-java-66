package org.example.lesson_10;

public class PowerOfTwo {
    public static void main(String[] args) {

    }

    public int power(int n)
    {
        if(n == 0){
            return 1;
        }
        return 2 * power(n-1);
    }

    static int powerIteration(int n)
    {
        int res = 1;
        for(int i = 0; i < n; i++)
        {
            res*=2;
        }
        return res;
    }
}
