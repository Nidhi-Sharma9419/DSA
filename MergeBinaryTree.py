if(root2==null){
            return root1;
        }
        else if(root1==null){
            return root2;
        }
        else{
            root1.val=root1.val+root2.val;
            root1.left = mergeTrees(root1.left,root1.left);
            root1.right = mergeTrees(root1.right, root1.right);
            return root1;
        }
