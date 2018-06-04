package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pshivra on 5/29/2018.
 */
public class LinkedListCycles {

    boolean hasCycle(Node head){
        if(head == null && head.next == null)
        {
            return false;
        }
        Node node = head;
        Map<Node,Integer> nodeMap = new HashMap<>();
        while(node.next!=null){
            if(nodeMap.containsKey(node)){
                return true;
            }else{
                nodeMap.put(node,1);
                node = node.next;
            }
        }
        return false;
    }


    class Node {
        int data;
        Node next;
    }
}
