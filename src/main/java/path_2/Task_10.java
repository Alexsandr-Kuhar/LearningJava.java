package main.java.path_2;

public class Task_10 {
    public static void main(String[] args) {
int a=10,b=20,c=20,d=40,  e=40, f=30;
                   ///OMG)))
if ((b+c<=f && a<=e && d<=e)||(b+d<=f && a<=e && d<=e)||(a+d<=f && b<=e && c<=e)||(a+d<=e && d<=f && a<=f)||
    (b+d<=e && d<=f && b<=f)||(b+c<=e && a<=f && d<=f)||(a+c<=f && b<=e && d<=e)||(a+c<=e && b<=f && d<=f)||
    (b+d<=e && a<=f && d<=f)||(a+d<=e && b<=f && c<=f)||(a+d<=f && d <=e && a<=e)||(b+d<=f && d<=e && b<=e))

{System.out.println("Included");}
    else {
    System.out.println("Not included");
        }

    }
}
