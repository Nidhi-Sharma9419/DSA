import java.util.* ;
import java.io.*; 
public class Deque  
{
    int dq[];
    int f,r,x;
    int size;
    public Deque(int n) 
    {
       
        dq=new int[n];
         size=n;
        f=-1;
        r=-1;

    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        if(isFull())
            return false;
        if(f==-1)
        {
            f=0;
            r=0;
        }
        else if(f==0)
        {
            f=dq.length-1;
        }
        else
            f=(f-1);
        dq[f]=x;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull())
            return false;
        if(r==dq.length-1)
            r=0;
        else if(r==-1)
        {
            f=0;
            r=0;
        }
        else
            r=(r+1)%dq.length;
        dq[r]=x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty())
            return -1;
        x=dq[f];
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else if(f==dq.length-1)
            f=0;
        else
            f=(f+1)%dq.length;
        return x;
        
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty())
            return -1;
        x=dq[r];
        if(r==f)
        {
            f=-1;
            r=-1;
        }
        else if(r==0)
            r=dq.length-1;
        else
            r=(r-1)%dq.length;
        return x;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(isEmpty())
            return -1;
        return dq[f];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(isEmpty())
            return -1;
        return dq[r];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        if(f==-1&&r==-1)
            return true;
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((r+1)%dq.length==f)
            return true;
        return false;
    }
}
