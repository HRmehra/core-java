package core;

class add{  
 void addi(int a , int b){
	System.out.println(a+b);
	}  
}  
class sub extends add{  
void subd(int c ,int d){
	System.out.println(c-d);}  
}  
class mult extends add{  
void multi(int z ,int x){
	System.out.println(z*x);
}  
} 
class H_inheritance{
public static void main(String args[]){  
mult m=new mult();  
m.multi(2,3);  
m.addi(1,2);

sub s =new sub();
s.subd(4,2);
s.addi(4,2);

}

}

