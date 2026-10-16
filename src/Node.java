class Node {
    private Uchazec uchazec; // uložená hodnota
    private Node next; // odkaz na další prvek v seznamu
    private Node prev; // odkaz na předchozí prvek v seznamu
    Node(Uchazec uchazec) {
        this.uchazec = uchazec;
// next i prev mají defaultně hodnotu null – další 2 řádky je možné vynechat
        this.next = null;
        this.prev = null;
    }
    public Uchazec getUchazec() {
        return uchazec;
    }
    public Uchazec setSong() {
        this.uchazec = uchazec;
        return uchazec;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

}