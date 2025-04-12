package Pertemuan7;

public class StrukturList {
	    private Node HEAD;

	    private boolean isEmpty() {
	        return HEAD == null;
	    }

	    public void addTail(int data) {
	        Node posNode = null, curNode = null;

	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        }
	        else {
	            curNode = HEAD;
	            while (curNode != null) {
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newNode);
	        }
	    }

	    public void displayElement() {
	        Node curNode = HEAD;
	        while (curNode != null) {
	            System.out.print(curNode.getData() + " ");
	            curNode = curNode.getNext();
	        }
	    }

	    public void addHead(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        }
	        else {
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        }
	    }

	    public void addMid(int data, int position) {
	        Node posNode = null, curNode = null;
	        int i = 0;
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            curNode = HEAD;
	            if (position == 1) {
	                newNode.setNext(curNode);
	                HEAD = newNode;
	            } else {
	                i = 1;
	                while(curNode != null && i < position) {
	                    posNode = curNode;
	                    curNode = curNode.getNext();
	                    i++;
	                }
	                posNode.setNext(newNode);
	                newNode.setNext(curNode);
	            }
	        }
	    }

	    public void dispose(Node temp) {
	        temp.setNext(null);
	    }

	    public void removeHead() {
	        if (isEmpty()) {
	            System.out.println("List kosong");
	        } else {
	            Node temp = HEAD;
	            HEAD = HEAD.getNext();
	            dispose(temp);
	        }
	    }

	    public void removeTail() {
	        Node preNode = null, lastNode;

	        if (isEmpty()) {
	            System.out.println("List kosong");
	        } else {
	           if (HEAD.getNext() == null) {
	               HEAD = null;
	           } else {
	               lastNode = HEAD;
	               while (lastNode.getNext() != null) {
	                   preNode = lastNode;
	                   lastNode = lastNode.getNext();
	               }
	               preNode.setNext(null);
	               dispose(lastNode);
	           }
	        }
	    }

	    public void removeMid(int x) {
	        Node preNode = null, delNode = null;
	        int i;
	        boolean ketemu;
	        if (isEmpty()) {
	            System.out.println("Element list kosong");
	        } else {
	            ketemu = false;
	            i = 1;
	            delNode = HEAD;

	            while (delNode != null && !ketemu) {
	                if (delNode.getData() == x) {
	                    ketemu = true;
	                } else {
	                    preNode = delNode;
	                    delNode = delNode.getNext();
	                    i++;
	                }
	            }

	            if (ketemu == true) {
	                if (i == 1) {
	                    HEAD = null;
	                }
	                else {
	                    preNode.setNext(delNode.getNext());
	                    dispose(delNode);
	                }
	            } else {
	                System.out.println("List kosong");
	            }
	        }
	    }
	}
