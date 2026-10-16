void main() {
    Scanner sc = new Scanner(System.in);
    Fronta fronta = new Fronta();
    boolean power = true;
    Uchazec uchazec1 = new Uchazec("Ondra","Vysoka skola zivota","Uklizec",18);
    Uchazec uchazec2 = new Uchazec("Michal","Zakladni skola","Uklizecka",18);
    fronta.add(uchazec1);
    fronta.add(uchazec2);

    while (power) {
        System.out.println("=====MENU=====");
        System.out.println("1. Pridat noveho uchazece");
        System.out.println("2. Obslouzeni prvniho uchazece");
        System.out.println("3. Vypis vsech");
        System.out.println("4. Nakouknuti na dalsiho");
        System.out.println("5. Nalezeni pozice");
        System.out.println("6. Vymazani cele fronty");
        System.out.println("0. Konec");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Napis jmeno");
                String jmeno = sc.nextLine();
                System.out.println("Napis vzdelani");
                String vzdelani = sc.nextLine();
                System.out.println("Napis pozici");
                String pozice = sc.nextLine();
                System.out.println("Napis vek");
                int vek = sc.nextInt();
                fronta.add(new Uchazec(jmeno,vzdelani,pozice,vek));
                break;
            case 2:
                fronta.obslouzeni();
                break;
            case 3:
                fronta.printAll();
                break;
            case 4:
                fronta.nahled();
                break;
            case 5:
                System.out.println("Napis pozici");
                String pozici = sc.nextLine();
                fronta.vypisPodlePozice(pozici);
                break;
            case 6:
                fronta.removeVsech();
                break;
            case 0:
                System.out.println("System se vypina");
                power = false;
                break;
        }
    }




}
