package baseball;

public class Review03 {

    public static void main(String[] args) {
        //チームと成績を生成
        BaseBallTeam Team1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam Team2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam Team3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam Team4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam Team5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam Team6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        //report()の呼び出し
        Team1.report();
        Team2.report();
        Team3.report();
        Team4.report();
        Team5.report();
        Team6.report();
    }

}
