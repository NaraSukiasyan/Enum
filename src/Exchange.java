public enum Exchange {
    AMD, USD(448), EUR(456),RUR(6),GBF(577);
    private int rate;
    //Constructor
    Exchange (int r) {rate = r;}
    //Overloded constructor
    Exchange () {rate = 1;}
    int getRate() {return rate ;}
}
class EnumDemo {
    public static void main(String[] args) {
        Exchange ex;
        System.out.println("Exchange Rates are:" );
        for (Exchange e : Exchange.values()) {
           System.out.println( e +  "rates"  +  e.getRate()  + "dram.");
        }
    }
}