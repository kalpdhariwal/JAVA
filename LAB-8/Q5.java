import java.util.Scanner;
interface StackInterface{
void push(int item);
int pop();
void display();
}
class StackClass implements StackInterface{
int[] stack=new int[5];
int top=-1;
public void push(int item){
if(top==4){
System.out.println("Stack Overflow");
}else{
stack[++top]=item;
System.out.println("Pushed: "+item);
}
}
public int pop(){
if(top==-1){
System.out.println("Stack Underflow");
return -1;
}else{
int item=stack[top--];
System.out.println("Popped: "+item);
return item;
}
}
public void display(){
if(top==-1){
System.out.println("Stack is empty");
}else{
for(int i=top;i>=0;i--){
System.out.print(stack[i]+" ");
}
System.out.println();
}
}
public static void main(String[] args){
System.out.println("24BIT106 Kalp N Dhariwal");
Scanner sc=new Scanner(System.in);
StackClass s=new StackClass();
int choice,item;
while(true){
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
System.out.println("4.Exit");
choice=sc.nextInt();
switch(choice){
case 1:
item=sc.nextInt();
s.push(item);
break;
case 2:
s.pop();
break;
case 3:
s.display();
break;
case 4:
return;
default:
System.out.println("Invalid choice");
}
}
}
}