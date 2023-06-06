package rank.entity;

public class LastWordRank {

	private String user;
	private String gameType;
	private double winRatio;

	public LastWordRank(String user, String gameType, double winRatio) {
		this.user = user;
		this.gameType = gameType;
		this.winRatio = winRatio;
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

	public double getWinRatio() {
		return winRatio;
	}

	public void setWinRatio(double winRatio) {
		this.winRatio = winRatio;
	}
}
