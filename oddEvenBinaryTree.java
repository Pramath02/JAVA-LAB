package digSum;

import java.util.LinkedList;
import java.util.Queue;

import digSum.OddEvenBinaryTree.Node;

public class oddEvenBinaryTree {
	
		public static class Node
		{
			int val;
			Node right;
			Node left;
			
			
			public Node(int val)
			{
				this.val=val;
				this.left=null;
				this.right=null;
			}
		}
		
		public Node root;
		
		public class Difference
		{
			int oddLevel=0;
			int evenLevel=0;
			int nodesInLevel=0;
			int currentLevel=0;
			
			Queue<Node> queue = new LinkedList<>();
			
			if(root==null)
			{
				System.out.println("Tree is Empty.");
			}
			
			else
			{
				queue.add(root);
				currentLevel++;
				
				 while(queue.size() != 0) {    
                     
	                  
	                  nodesInLevel = queue.size();    
	                      
	                  while(nodesInLevel > 0) {    
	                      Node current = queue.remove();    
	                          
	                    
	                      if(currentLevel % 2 == 0)    
	                      {
	                          evenLevel += current.data;    
	                      }
	                      else    
	                      {
	                          oddLevel += current.data;    
	                      }   
	                      
	                      if(current.left != null)    
	                      {
	                    	  queue.add(current.left);    
	                      }
	                      
	                      if(current.right != null)     
	                      {
	                    	  queue.add(current.right);    
	                      }
	                     nodesInLevel--;    
	                  }    
	                  currentLevel++;    
			}
				 
				int difference = Math.abs(evenLevel-oddLevel);
		}
			return difference;

			 public static void main (String[] args) {    
		            
			        Difference bt = new Difference();      
			        bt.root = new Node(1);    
			        bt.root.left = new Node(2);    
			        bt.root.right = new Node(3);    
			        bt.root.left.left = new Node(4);    
			        bt.root.right.left = new Node(5);    
			        bt.root.right.right = new Node(6);    
			         
			        System.out.println("Difference between sum of odd level and even level nodes: " + bt.difference());    
			}    
	}

