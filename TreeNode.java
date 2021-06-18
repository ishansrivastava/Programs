import java.io.*;
import java.util.*;
public class TreeNode {

	 	 /* int val;
	 	  TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }*/

public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	String s="",str="";
	while((str=sc.nextLine()).compareTo("end")!=0)
	{
	
		s+=str;
	}
	
	String insert="INSERT INTO FCT_PRODUCT_MASTER("+s+")  VALUES(";

//int product_instance_id=50000;
//String product_instance_bkey="DUMMYACCT";

for(int i=50000;i<=80000;++i)
{
insert+=i+","+"20180522,6000,8,'LOAN',9954252,58454,17280,null,null,null,null,null,null,2,null,null,0,99,162143.37,3,'10-05-2019',3268220,374500,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,null,null,821,null,0,1,null,null,5,null,'02#',0,0,null,null,0,0,null,null,'N',null,null,-1,4,null,null,null,null,null,null,0,3,2,null,'17-05-2016',1,1,4,null,null,null,null,null,null,null,null,'ONB',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,-1,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,'DUMMYACCT"+i+"',"+null+")";
System.out.println(insert);
insert="INSERT INTO FCT_PRODUCT_MASTER("+s+")  VALUES(";
}
}
}

