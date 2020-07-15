/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Mini
{
    void charge(int distance)
    {
        int base=50;
        int cost=0;
        if(distance>75)
        {
            cost+=distance*8;
            System.out.println("cost="+cost);
        }
        else if(distance>15 && distance<=75)
        {
            int temp_distance=distance-15-3;
            int temp_cost=(50)+150;
            cost+=temp_cost+(8*distance);
             System.out.println("cost="+cost);
        }
        else if(distance>3 && distance>=15)
        {
            int temp_distance=distance-3;
            int temp_cost=50;
            cost+=temp_cost+(temp_distance*10);
             System.out.println("cost="+cost);
        }
        else if(distance<=3)
        {
            cost+=base; 
            System.out.println("cost="+cost);
        }
        
    
    }
}

class Sedan
{
    void charge(int distance)
    {
        int base=80;
        int cost=0;
        
        if(distance>100)
        {
            cost=distance*10;
             System.out.println("cost="+cost);
        }
        else if(distance>15 && distance<=75)
        {
            int temp_distance=distance-15-5;
            int temp_cost=(80)+(12*15);
            cost=cost+temp_cost+(10*distance);
             System.out.println("cost="+cost);
        }
        else if(distance>5 && distance>=15)
        {
            int temp_distance=distance-5;
            int temp_cost=80;
            cost+=temp_cost+(temp_distance*12);
             System.out.println("cost="+cost);
        }
        else if(distance<=5)
        {
            cost+=base;
             System.out.println("cost="+cost);
        }
        
    
        
    }
    
} 

class Suv
{
    void charge(int distance)
    {
        int base=100;
        int cost=0;
        
        if(distance>15 )
        {
            int temp_distance=distance-15-5;
            int temp_cost=(100)+(15*15);
            cost=cost+temp_cost+(12*distance);
            System.out.println("cost="+cost);
        }
        else if(distance>5 && distance>=15)
        {
            int temp_distance=distance-5;
            int temp_cost=100;
            cost=cost+temp_cost+(temp_distance*15);
            System.out.println("cost="+cost);
        }
        else if(distance<=5)
        {
            cost+=base;
            System.out.println("cost="+cost);
        }
    
    }
}


public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch;
	System.out.println("Enter the choice");
	ch=sc.nextInt();
	int distance;
	System.out.println("Enter th no of km");
	distance=sc.nextInt();
	Mini mini=new Mini();
	Suv suv=new Suv();
	Sedan sedan=new Sedan();
	
	    if(ch==1)
	    {
	        mini.charge(distance);
	    }
	    else if(ch==2)
	    {
	      sedan.charge(distance);  
	    }
	    else if(ch==3)
	    {
	        suv.charge(distance);
	        
	    }
	}
}
