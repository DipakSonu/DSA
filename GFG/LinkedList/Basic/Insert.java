//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    
    class Node{
        int data;
        Node next;
        
        Node(int x){
            data = x;
            next = null;
        }
    }
    class Insert{
        static void printList(Node node) 
        { 
            while (node.next != null) 
            { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
            System.out.println(); 
        }
        public static void main(String args[]) throws IOException { 
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                Node head = null;
                for(int i=0; i<n; i++)
                {
                    int value = sc.nextInt();
                    int indicator = sc.nextInt();
    
                    Solution ob = new Solution();
                    if(indicator == 0)
                        head = ob.insertAtBeginning(head, value);
                    else
                        head = ob.insertAtEnd(head, value);
                }
                printList(head); 
                t--;
            }
        } 
    } 
    
    class Solution{
        //Function to i
        //Insert a node at the beginning of the linked list.
        Node insertAtBeginning(Node head, int x){
            
            // code here
            Node new_node = new Node(x);
            new_node.next=head;
            head=new_node;
            
            return head;
        }
        
        //Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x){
            // code here
            Node new_node = new Node(x);
            
            if(head==null){
                new_node.next=head;
                head=new_node;
            }
            else{
                Node tnode=head;
                while(tnode.next!=null){
                    tnode=tnode.next;
                }
                tnode.next=new_node;
            }
            
            return head;
        }
    }