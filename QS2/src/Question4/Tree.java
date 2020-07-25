package Question4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	/**
	 * @param args
	 */
	private int value;
	public Tree left, right;
	public Tree(int value) {
		this.value=value;
		left = null;
		right = null;
	}
	public void insert(int x) {
		if(x<value){
			if(left==null){
				left=new Tree(x);
			}else{
				left.insert(x);
			}
			
		}else if(x>value){
			if(right==null){
				right=new Tree(x);
			}else{
				right.insert(x);
			}
		}else{
			System.out.println("Duplicated element.");
		}
		
	}
	public Tree remove(int x) {
		
		while(left!=null&&right!=null){
			if(x<value){
				left=left.left;
			}
			if(x>value){
				right=right.right;
			}
		}
		if(x<value){
			if(left==null){
				System.out.println("No such element!");
				return this;
			}else{
				left=left.left;
			}		
		}else if(x>value){
			if(right==null){
				System.out.println("No such element!");
				return this;
			}else{
				right.remove(x);
			}
		}else{
			if(left==null&&right==null){
				
			}
			Tree last=right;
			while(last!=null&&last.right!=null){
				last=last.right;
			}
			value=last.value;
			
		}
		return this;
	}
	public void preorderTraverse() {
		System.out.println(value);
		if(left!=null){
			left.preorderTraverse();
		}
		if(right!=null){
			right.preorderTraverse();
		}	
	}
	public void inorderTraverse() {
		if(left!=null){
			left.inorderTraverse();
		}
		System.out.println(value);
		if(right!=null){
			right.inorderTraverse();
		}	
	}
	public void postorderTraverse() {
		if(left!=null){
			left.postorderTraverse();
		}	
		if(right!=null){
			right.postorderTraverse();
		}
		System.out.println(value);
	}
	public void traverseByLevel() {
		Queue<Tree> q = new LinkedList<Tree>();
		q.offer(this);
		//Tree node=q.poll();
		//System.out.println(node.value);
		while(!q.isEmpty()){
			Tree node=q.poll();
			System.out.println(node.value);
			//System.out.println(node.left.value);
			//System.out.println(node.right.value);
			if(node.left!=null){
				q.offer(node.left);
			}
			if(node.right!=null){
				q.offer(node.right);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree(5);
		t.insert(3);
		t.insert(8);
		t.insert(7);
		t.insert(10);
		//t.insert(7);
		//t.preorderTraverse();
		t.inorderTraverse();
		//t.postorderTraverse();
		t.traverseByLevel();
	}

}
