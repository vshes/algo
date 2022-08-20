package com.shesh;

import java.util.Objects;
import java.util.PriorityQueue;

public class KthSmallestBST {


   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();



    }

    public int kThSmallest(TreeNode root,int k){



       while(root != null){
           root =root.left;
           pq.add(root.val);
           root =root.right;
       }



       while(k > 0) {
           pq.poll();
           k--;
       }


       return pq.peek();
    }

    public void kthSmall(TreeNode t){


       if(t == null) return;

       kthSmall(t.left);
       if(Objects.nonNull(t))pq.offer(t.val);
       kthSmall(t.right);

    }


}
