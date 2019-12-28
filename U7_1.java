public class U7_1 {
    public static void main(String[] args) {
        Station tokyo = new Station("東京");
        Station kanda = new Station("神田");
        Station akihabara = new Station("秋葉原");
        Station okatimachi = new Station("御徒町");
        Station ueno = new Station("上野");

        tokyo.setDown(kanda);
        kanda.getUp(tokyo);
        akihabara.setDown(okatimachi);
        okatimachi.setUp(akihabara);
        ueno.setDown(okatimachi);


        Station station = tokyo;
        while (true){
            System.out.println(station.getName());
            station = station.getDown();
            if (station == null){
                break;
            }
        }
    }
}


