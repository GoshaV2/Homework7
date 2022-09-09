public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1");
        {
            System.out.println("#1");
            float sum=123123f;
            int k=1;
            while(sum<2459000){
                sum+=sum*0.01;
                System.out.println("Месяц "+ k +", сумма накоплений равна "+ sum +" рублей");
                k++;
            }
        }
        {
            System.out.println("#2");
            int k=1;
            while(k<=10){
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println("");
            for(int i=10;i>=1;i--){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        {
            System.out.println("#3");
            int year=2022;
            int k=10;
            int people=12_000_000;
            int mortality=8;
            int fertility=17;
            while(k!=0){
                people=people+people/1000*fertility-people/1000*mortality;
                System.out.println("Год" + year +", численность населения составляет "+people);
                year+=1;
                k--;
            }
        }
        System.out.println("Дз 2");
        {
            System.out.println("#1");
            float sum=15_000f;
            float percent=0.07f;
            int month=1;
            while(sum<12_000_000){
                System.out.printf("Месяц "+month+", накопления: %.2f",sum);
                System.out.println("");
                sum+=sum*percent;
                month++;
            }
        }
        {
            System.out.println("#2");
            float sum=15_000f;
            float percent=0.07f;
            int month=1;
            while(sum<12_000_000){
                if(month%6==0){
                    System.out.printf("Месяц "+month+", накопления: %.2f",sum);
                    System.out.println("");
                }
                sum+=sum*percent;
                month++;
            }
        }
        {
            System.out.println("#3");
            float sum=15_000f;
            float percent=0.07f;
            int month=1;
            while(month<=12*9){
                if(month%6==0){
                    System.out.printf("Месяц "+month+", накопления: %.2f",sum);
                    System.out.println("");
                }
                sum+=sum*percent;
                month++;
            }
        }
        {
            System.out.println("#4");
            int firstFriday=1;
            for(int i=1;i<=31;i++){
                if(i==firstFriday){
                    System.out.println("Сегодня пятница, "+ i +"-е число. Необходимо подготовить отчет.");
                    firstFriday+=7;
                }
            }
        }
        System.out.println("Дз 3");
        {
            System.out.println("#1");
            int year=2022;
            int startYear=year-200;
            for(int i=0;i<=year;i=i+79){
                if(startYear<=i){
                    System.out.println(i);
                }
            }
        }
        {
            System.out.println("#2");
            for(int i=1;i<=10;i++){
                System.out.println("2*"+i+"="+i*2);
            }
        }
    }
}