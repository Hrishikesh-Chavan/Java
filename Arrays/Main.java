import java.util.*;
public class Main
{
static int isPerfectSquare(int number)
{
int iVar;
float fVar;

if(Math.sqrt(number) == Math.floor(Math.sqrt(number)))
return number;
else
return 0;
}

public static void main(String[] args)
{
int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int[]arr = new int[n];
for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}

int num=0;
boolean isInArray = false;
for(int i = 0; i < n; i++)
{
    num = isPerfectSquare(arr[i]);
    if(arr[i] == num){
        isInArray = true;
    } 
      
  
}

int count=0;
for(int i = 0; i < n; i++){
    if(isInArray){
        count++;
    }
}

System.out.println("count: " + count);


}
}