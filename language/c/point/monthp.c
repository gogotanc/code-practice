// monthp.c

#include<stdio.h>  
  
char *month_name(int n)  
{  
        /* 
         * 初始化指针数组, 指针数组中的元素指向一个字符串 
         */  
        static char *name[] = {  
                "Illegal month",   
                "January", "Febrary", "March",  
                "April", "May", "June",  
                "July", "August", "September",  
                "October", "November", "December"  
        };  
  
        printf("sizeof(name) = %lu \n", sizeof(name));  
        //返回一个指针, 这个指针指向字符串  
        return (n < 1 || n > 12) ? name[0] : name[n];  
}  
  
int main(int argc, char **argv)  
{  
        printf("month 2 is %s \n", month_name(2));  
        return 0;  
}
