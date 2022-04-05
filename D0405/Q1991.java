package D0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1991 {
    // tree 순회
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Tree tree=new Tree();
        for(int i=0;i<n;i++){
            String[] input=br.readLine().split(" ");
            tree.createNode(input[0], input[1], input[2]);
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
class Node{
    String data;
    Node left;
    Node right;
    public Node(String data){
        this.data=data;
    }
}
class Tree{
    Node root;
    public void createNode(String data, String left, String right){
        if(this.root==null){
            this.root=new Node(data);
            if(!left.equals("."))
                this.root.left=new Node(left);
            if(!right.equals("."))
                this.root.right=new Node(right);
        }else
            searchNode(this.root, data, left, right);
    }
    public void searchNode(Node root, String data, String left, String right){
        if(root==null)
            return;
        else if(root.data.equals(data)){
            if(!left.equals("."))
                root.left=new Node(left);
            if(!right.equals("."))
                root.right=new Node(right);
        }
        else{
            searchNode(root.left, data, left,right);
            searchNode(root.right, data, left,right);
        }
    }
    public void preOrder(Node root){
     System.out.print(root.data);
     if(root.left!=null) preOrder(root.left);
     if(root.right!=null) preOrder(root.right);
    }
    public void inOrder(Node root){
        if(root.left!=null) inOrder(root.left);
        System.out.print(root.data);
        if(root.right!=null) inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root.left!=null) postOrder(root.left);
        if(root.right!=null) postOrder(root.right);
        System.out.print(root.data);
    }
}

