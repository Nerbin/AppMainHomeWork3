public class AppMainHomeWork03 {

    public static void main(String[] args) {
        int producSalesInFirstDay = 8;
        int producSalesInSecondDay = 8;
        int producSalesInThirdDay = 4;
        int producSalesInForthDay = 16;
        int producSalesInFifthDay = 4;
        int days = 5;
        double earnings  = 12153.41;

        int allProductSales = producSalesInFirstDay+producSalesInSecondDay+producSalesInThirdDay+producSalesInForthDay
                +producSalesInFifthDay;
        //  System.out.println("Продано всего смартфоона "+allProductSales);

        double avarageIncomePerDay = earnings/days;
        // System.out.printf("В среднем в день продано гаджетов"+"%.2f",avarageIncomePerDay);
        //   System.out.println(" ");

        double f = avarageIncomePerDay * days;
        // System.out.printf("Общая сумма зароботка "+"%.2f",f);

        double priceOneGadget = avarageIncomePerDay / allProductSales;

//       System.out.println(" ");
//       System.out.printf("Цена одного смартфорна "+"%.2f",priceOneGadget);

        System.out.println(" ");

        int number = 1;
        String product = "smartphone";
        String prise = "EUR";
        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is %s %.2f,\n" +
                "sales by day is %s %.2f.\n",number,product,days,prise,earnings,prise,avarageIncomePerDay);


        System.out.println(" ");



        int [] allDays = new int[7];
        int sumAllLaptop = 0;
        allDays [0] = 1;
        allDays [1] = 2;
        allDays [2] = 5;
        allDays [3] = 0;
        allDays [4] = 2;
        allDays [5] = 1;
        allDays [6] = 0;
        for (int buyMoreFifthLaptop: allDays){

            if(buyMoreFifthLaptop==5){   //если купленно 5 лаптопов то идет то пятый идет в подарок и платят
                //только за 4
                buyMoreFifthLaptop = 4;
            }
            //  System.out.println(buyMoreFifthLaptop);
            sumAllLaptop =sumAllLaptop + buyMoreFifthLaptop;

        }
        // System.out.println(sum+ " ");

        days = 7;
        avarageIncomePerDay = 1498.1214285714286;



        double earninAll = avarageIncomePerDay*days;
        // System.out.println("вся сумма "+ earninAll );


        priceOneGadget = avarageIncomePerDay / sumAllLaptop ;

        // System.out.println("Цена 1 лаптопа: "priceOneGadget);
        //System.out.println(" ");

        number = 2;
        product = "laptop";
        prise = "EUR";
        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is %s %.2f,\n" +
                "sales by day is %s %.2f.\n",number,product,days,prise,earninAll,prise,avarageIncomePerDay);
    }
}
