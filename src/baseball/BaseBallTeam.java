package baseball;

public class BaseBallTeam {

    //フィールド　カプセル化
    private String name;
    private int win;
    private int lose;
    private int draw;

    //引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw){
        this.name = name;
        this.win  = win;
        this.lose = lose;
        this.draw = draw;
    }
    //勝率を計算するメソッド
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }
    //成績を表示するメソッド
    public void report() {
        double rate = getRate();
        System.out.println(name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + rate + "です");
    }
    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

}