class MyQueue {
     int n = 1001;
        int arr[] = new int[n];
        int f=0;
        int r=0;

    public MyQueue() {
       
        

    }
    
    public void push(int x) {
        if(isfull()){
            return;
        }
       arr[r]=x;
       r+=1;
    }
    
    public int pop() {

        if (empty()){
            return 0;
        }
        int k = this.arr[f];
        f+=1;
        return k;


      
    }
    
    public int peek() {
        return this.arr[f];
    }
    
    public boolean empty() {
        if(this.f==this.r){
            return true;
        }
        return false;
    }

    public boolean isfull(){
        if(this.r==this.arr.length){
            return true;
        }
        return false;

    }

}
