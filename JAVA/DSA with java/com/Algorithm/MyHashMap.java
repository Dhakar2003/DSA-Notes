package com.Algorithm;

class MyHashMap {
    Node head;
    
    class Node{
        int Key;
        int value;
        Node next;
        Node(int Key,int value){
            this.value=value;
            this.Key=Key;
        }
    }

    public MyHashMap() {
       
    }
    
    public void put(int key, int value) {
        Node  temp=head;
        while(temp!=null)
        {
            if(temp.Key==key){
                temp.value=value;
                return;
            }
        }
        Node node=new Node(key,value);
        node.next=head;
        head=node;
    }
    
    public int get(int key) {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.Key==key)
                return temp.value;
            temp=temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if(head.Key==key)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            if(temp.next.Key==key)
            {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */