public abstract class Auto {

    private String name;

    public Auto (String name) {
        this.name = name;
    }

    public void rijWeg () {
        System.out.println ("===================================================");
        System.out.println ("Type auto: " + name);
        start ();
        schakel ();
        geefGas ();
        System.out.println ("===================================================" + System.lineSeparator ());
    }

    public void start () {
        System.out.println ("Deze auto start met een startknop");
    }

    public void schakel () {
        System.out.println ("Deze auto schakelt automatisch");
    }

    public void geefGas () {
        System.out.println ("In deze auto geef je gas met een gaspedaal");
    }
}
