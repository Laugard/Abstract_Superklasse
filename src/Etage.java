class Etage extends Ejendom {
    double beboelsesareal;
    double butiksareal;
    int antalEtager;
    double pris;

    public Etage() {
    }

    public Etage(double beboelsesareal, double butiksareal, int antalEtager, double pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
        this.antalEtager = antalEtager;
        this.pris = pris;
    }
    @Override
    double beregnPrisPerKvadratmeter() {
        return pris / (beboelsesareal + butiksareal);
    }

    @Override
    void udskriv() {
        System.out.println("Etage data:");
        System.out.println("Beboelsesareal: " + beboelsesareal);
        System.out.println("Butiksareal: " + beboelsesareal);
        System.out.println("Antal etager: " + antalEtager);
        System.out.println("Pris: " + pris);
        System.out.println("Pris per kvadratmeter: " + beregnPrisPerKvadratmeter());
    }
    public double getBeboelsesareal() {
        return beboelsesareal;
    }

    public void setBeboelsesareal(double beboelsesareal) {
        this.beboelsesareal = beboelsesareal;
    }

    public double getButiksareal() {
        return butiksareal;
    }

    public void setButiksareal(double butiksareal) {
        this.butiksareal = butiksareal;
    }

    public int getAntalEtager() {
        return antalEtager;
    }

    public void setAntalEtager(int antalEtager) {
        this.antalEtager = antalEtager;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
