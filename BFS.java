import java.util.*;

import javax.swing.UIDefaults.ProxyLazyValue;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
import javax.xml.transform.Source;
public class treefrompreorder{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    static class buildTree
    {
        static int index=-1;
        public static Node buildtree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;



        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            System.out.println(-1+" ");
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            System.out.println(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");

    }
    public static void levelorder(Node root)
    {
        Queue<Node> list=new LinkedList<>();
        list.add(root);
        list.add(null);
        
        while(!list.isEmpty())
        {
            Node currNode=list.remove();
            if(currNode==null)
            {
                System.out.println();
                if(list.isEmpty())
                {
                    break;
                }
                else
                {
                    
                    list.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    list.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    list.add(currNode.right);
                }
            }
        }

    }
    public static int countofnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=countofnodes(root.left);
        int rightNodes=countofnodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sumofNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=sumofNodes(root.left);
        int rightNodes=sumofNodes(root.right);
        return leftNodes+rightNodes+root.data;

    }
    public static int heightofTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=heightofTree(root.left);
        int rightheight=heightofTree(root.right);
        return Math.max(leftheight,rightheight)+1;

    }
    public static int diaoftree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int dia1=diaoftree(root.left);
        int dia2=diaoftree(root.right);
        int dia3=heightofTree(root.left)+heightofTree(root.right)+1;
        return Math.max(dia3,Math.max(dia1,dia2));
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        buildTree tree=new buildTree();
        Node root =tree.buildtree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        levelorder(root);
        // System.out.println(countofnodes(root));
        // System.out.println(sumofNodes(root));
        // System.out.println(heightofTree(root));
        // System.out.println(diaoftree(root));




        }

    }
