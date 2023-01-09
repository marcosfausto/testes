package math_test;

class Fractions {
    int numerator;
    int denominator;

    public Fractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    Fractions add(Fractions f) {
        int numerator = this.numerator * f.getDenominator() + f.getNumerator() * this.denominator;
        int denominator = this.denominator * f.getDenominator();
        return new Fractions(numerator, denominator);
    }

    void print() {
        System.out.println(numerator + "/" + denominator);
    }
}