#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int a = 0, b = 1, c;
    
    for(int i = 2; i <= n ; i++)
    {
        c = (a % 1234567) + (b % 1234567);
        a = b;
        b = c;
    }
    
    return (c % 1234567);
    
}