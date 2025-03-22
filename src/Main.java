class Queue{
    int front;
    int rear;
    int size;
    int []arr;
Queue(int capacity)
{
    front = rear = -1;
    size = capacity;
    arr = new int[size];
}

boolean isFull()
{
    return rear == size-1;
}
boolean isEmpty(){
    return front == -1;
}


void pushRear(int data)
{

    if(isFull())
    {
        System.out.println("queue is full");
        return;
    }
    rear++;
    arr[rear] = data;
    if(front == -1)
    {
        front = 0;
    }
}
void popFront()
{
    if(isEmpty())
    {
        System.out.println("queue is empty");
        return;
    }
    front++;
    if(front>rear)  //check
    {
        front = rear = -1;
    }

}
 void print()
 {
     int i;
     for( i = front;i<=rear;i++)
     {
         System.out.print(arr[i] + " ");

     }
     System.out.println();
 }


}
public class Main {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        //q1.popFront();
        q1.pushRear(1);
        q1.pushRear(2);
        q1.pushRear(3);
        q1.pushRear(4);
        q1.pushRear(5);
        //q1.pushRear(6);
        q1.print();
        q1.popFront();
        q1.popFront();
        q1.print();
    }
}