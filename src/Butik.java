class Butik extends Ejendom {
    double beboelsesareal;
    double butiksareal;
    double pris;

    public Butik() {
    }

    public Butik(double beboelsesareal, double butiksareal, double pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
        this.pris = pris;
    }
    @Override
    double beregnPrisPerKvadratmeter() {
        return pris / (beboelsesareal + butiksareal);
    }

    @Override
    void udskriv() {
        System.out.println("Butik data:");
        System.out.println("Beboelsesareal: " + beboelsesareal);
        System.out.println("Butiksareal: " + butiksareal);
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

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}

