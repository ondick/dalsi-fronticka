import java.util.Scanner;

class Fronta {
    private Node front;
    private Node rear;
    private int size;
    private Uchazec frontaUchazec;
    private int pocetObslouzeni;
    Scanner sc = new Scanner(System.in);

    public Fronta() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public void add(Uchazec uchazec) {
        Node newNode = new Node(uchazec);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    public void obslouzeni() {
        if (front == null) { // fronta je prázdná
            return;
        }
        /*Uchazec prvek = front.getUchazec();
        front = front.getNext();
        if (front == null) { // fronta je prázdná
            rear = null;
        }
        size--;*/
        if (front != null) {
            Node current = front;
            System.out.println("Uchazec "+current.getUchazec().getJmeno()+" byl obslouzenej");
            pocetObslouzeni++;
            System.out.println("Pocet obslouzenych: "+pocetObslouzeni);
        }
        front = front.getNext();
        System.out.println("");
    }

    public void printAll() {
        Node current = front;
        System.out.println("--------Vypis vseho--------");
        while (current != null) {
            System.out.println(current.getUchazec());
            current = current.getNext();
        }
    }

    public void nahled(){
        if (front == null) { // fronta je prázdná
            return;
        }

        if (front != null) {
            Node current = front.getNext();
            System.out.println("Dalsi uchazec: "+current.getUchazec().getJmeno()+", pozice: "+current.getUchazec().getPozice());
        }
        System.out.println("");
    }
    public void removeFirst() {
        if (front == null) {
            return;
        }
        if (front != null) {
            front = front.getNext();
        }
    }

    public void removeVsech(){
        if (front == null) {
            return;
        }
        for (int i = 0;i<size;i++) {
            removeFirst();
        }
        System.out.println("Fronta byla vymazana");
    }

    public void vypisPodlePozice(String pozice) {
        Node current = front;
        boolean nalezen = false;
        System.out.println("--------Uchazeci na pozici: " + pozice + "--------");
        while (current != null) {
            if (current.getUchazec().getPozice().equalsIgnoreCase(pozice)) {
                System.out.println(current.getUchazec());
                nalezen = true;
            }
            current = current.getNext();
        }
        if (!nalezen) {
            System.out.println("Zadny uchazec na pozici '" + pozice + "' nebyl nalezen.");
        }
        System.out.println("");

    }
}