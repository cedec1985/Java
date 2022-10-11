public class unary{
    public static void main(String[] args){
int x=10;
System.out.println(x++);
System.out.println(++x);
System.out.println(x--);
System.out.println(--x);
int a=10;
int b=-10;
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true
System.out.println(10*10/5+3-1*4/2);
System.out.println(10<<2);
System.out.println(10<<3); 
System.out.println(20<<2);
System.out.println(15<<4);  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
System.out.println(-20>>2);  
System.out.println(-20>>>2);  
int f=10;  
int g=5;  
int e=20;  
System.out.println(f<g&&f++<e);//false && true = false  
System.out.println(f);//10 because second condition is not checked  
System.out.println(f<g&f++<e);//false && true = false  
System.out.println(f);//11 because second condition is checked  
short h=10;  
short i=10;  
h=(short)(h+i);//20 which is int now converted to short  
System.out.println(h);
// TODO Auto-generated method stub    
    x:    
    for(int l = 0; l<= 10; l++) {    
    y:    
    for(int j = 0; j<=15;j++) {    
    z:    
    for (int k = 0; k<=20; k++) {    
    System.out.println(k);    
    if(k==5) {    
    break x;    
    }    
    }    
    }   }    
for(int o = 0; o<= 2; o++) {  
  
for (int j = o; j<=5; j++) {  
  
if(j == 4) {  
continue;  
}  
System.out.println(j);  
}  
}  
}   
}
