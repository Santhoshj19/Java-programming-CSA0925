class Bank {
    public double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    public double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    public double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    public double getRateOfInterest() {
        return 9.7;
    }
}

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
