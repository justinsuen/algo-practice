/*rotate array: http://www.practice.geeksforgeeks.org/problem-page.php?pid=360
* this is someone else's C solution that is a lot faster than my java one...
*/

#include<stdio.h>
 
int main()
{
	int tst;
	scanf("%d",&tst);
	while(tst--)
	{
	    int n, rot, i, first = 0,tmp;
	    scanf("%d %d",&n,&rot);
	    
	    rot %= n;
	    
	    int ar[n],j,pre = 0;
	    for (i = 0; i<n; i++)
	      scanf("%d",&ar[i]);
	    
	    /*1.Store first element because it will be overwrite.
	      2.Start from first element and move elements right
	        int rot steps.*/
	    tmp = ar[0];
	    for (i = 0; i<n-1; i++)
	    {
	        /*Assign current element as the element after
	          skipping (rot-1) elements*/
	        ar[first] = ar[(first+rot)%n];
	        
	        /*1.((first+rot)%n == pre) means we reached where
	            we started, but we are still left with some 
	            elements to rotate right now.*/
	        if (((first+rot)%n == pre) && pre != i)
	        {
	            /*Previously we started from first element
	              now we will start from second element
	              and move elements right in rot steps.*/
	            pre++;
	            
	            /*Element where we started needs to be 
	              assigned to end element of the cycle.*/
	            ar[first] = tmp;
	            
	            /*Next cycle from next element*/
                first = pre;
                
                /*Store element because it will be overwrite*/
	            tmp = ar[first];
	        }
	        else
	          /*Access element in steps of rot steps*/
	          first = (first+rot)%n;
	    }
	    
	    /*Element where we started needs to be 
	      assigned to end element of the cycle.*/
	    ar[first] = tmp;
	    
	    for (i = 0; i<n; i++)
	      printf("%d ",ar[i]);
	      
	    printf("\n");
	    
	}
	return 0;
}
