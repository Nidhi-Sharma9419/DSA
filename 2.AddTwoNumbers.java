import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1s = new Stack<>();
        while(l1 != null){
            l1s.push(l1.val);
            l1 = l1.next;
        }
        String l1str ="";
        while(!l1s.isEmpty()){
            l1str += l1s.pop();
        }
        BigInteger l1int = new BigInteger(l1str);
        Stack<Integer> l2s = new Stack<>();
        while(l2 != null){
            l2s.push(l2.val);
            l2 = l2.next;
        }
        
        String l2str ="";
        while(!l2s.isEmpty()){
            l2str += l2s.pop();
        }
        BigInteger l2int = new BigInteger(l2str);
        BigInteger sum = l1int.add(l2int);
        String sumStr = String.valueOf(sum);
        
        ListNode ans = new ListNode();
        ListNode tmp = ans;
        for(int i = sumStr.length()-1 ; i>=0 ; i--){
            tmp.val = Integer.parseInt(String.valueOf(sumStr.charAt(i)));
            if( i != 0){
                tmp.next = new ListNode();
            }else{
                // for last element , set next null;
                tmp.next = null;
            }
            
            tmp = tmp.next;
            
        }
        
        return ans;
        
        
    }
}
