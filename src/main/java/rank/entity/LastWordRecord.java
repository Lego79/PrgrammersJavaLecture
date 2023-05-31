package rank.entity;

public class LastWordRecord {

    private String user;
    private String gameType;
    private int win;
    private int lose;
    

    public LastWordRecord(String user, String gameType, int win, int lose) {
        this.user = user;
        this.gameType = gameType;
        this.win = win;
        this.lose = lose;

    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
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
}
