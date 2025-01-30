class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the Singly Linked List class
class SinglyLinkedList {
    Node head;

    // Function to add a new node to the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // 1. Find the length of the SLL
    int findLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    // 2. Print the middle node of the SLL
    void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }

    // 3. Reverse the SLL and return a new reversed list
    SinglyLinkedList reverseList() {
        SinglyLinkedList reversedList = new SinglyLinkedList();
        Node current = head;

        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            current = current.next;
        }

        return reversedList;
    }

    // 4. Remove duplicates from a sorted SLL
    void removeDuplicates() {
        if (head == null) return;

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // 5. Merge two sorted SLLs
    static SinglyLinkedList mergeLists(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                mergedList.addNode(temp1.data);
                temp1 = temp1.next;
            } else {
                mergedList.addNode(temp2.data);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            mergedList.addNode(temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            mergedList.addNode(temp2.data);
            temp2 = temp2.next;
        }

        return mergedList;
    }

    // 6. Delete the complete SLL
    void deleteList() {
        head = null;
    }

    // Helper function to print the SLL
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the functions
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes to the list
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        System.out.println("Original list:");
        list.printList();

        // 1. Find length
        System.out.println("Length of list: " + list.findLength());

        // 2. Print middle
        list.printMiddle();

        // 3. Reverse list
        SinglyLinkedList reversedList = list.reverseList();
        System.out.println("Reversed list:");
        reversedList.printList();

        // 4. Remove duplicates
        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.printList();

        // 5. Merge two lists
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addNode(1);
        list2.addNode(3);
        list2.addNode(5);
        System.out.println("Second list:");
        list2.printList();

        SinglyLinkedList mergedList = mergeLists(list, list2);
        System.out.println("Merged list:");
        mergedList.printList();

        // 6. Delete list
        list.deleteList();
        System.out.println("List after deletion:");
        list.printList();
    }
}
