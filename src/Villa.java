class Villa extends Ejendom {
    int antalRum;
    double antalBeboedeKvadratmeter;
    double pris;

    public Villa() {
    }

    public Villa(int antalRum, double antalBeboedeKvadratmeter, double pris) {
        this.antalRum = antalRum;
        this.antalBeboedeKvadratmeter = antalBeboedeKvadratmeter;
        this.pris = pris;
    }
    @Override
    double beregnPrisPerKvadratmeter() {
        return pris / antalBeboedeKvadratmeter;
    }
    @Override
    void udskriv() {
        System.out.println("Villa data:");
        System.out.println("Antal rum: " + antalRum);
        System.out.println("Antal beboede kvadratmeter: " + antalBeboedeKvadratmeter);
        System.out.println("pris: " + pris);
        System.out.println("Pris per kvadratmeter: " +beregnPrisPerKvadratmeter());

    }
    public int getAntalRum() {
        return antalRum;
    }

    public void setAntalRum(int antalRum) {
        this.antalRum = antalRum;
    }

    public double getAntalBeboedeKvadratmeter() {
        return antalBeboedeKvadratmeter;
    }

    public void setAntalBeboedeKvadratmeter(double antalBeboedeKvadratmeter) {
        this.antalBeboedeKvadratmeter = antalBeboedeKvadratmeter;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
