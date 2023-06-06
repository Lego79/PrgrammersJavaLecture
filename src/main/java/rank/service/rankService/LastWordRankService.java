package rank.service.rankService;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import rank.entity.LastWordRank;
import rank.entity.NormalGameRank;

public class LastWordRankService  {
	
	private List<LastWordRank> lastWordRankList;

	public LastWordRankService(List<LastWordRank> lastWordRankList) {
	
		this.lastWordRankList = lastWordRankList;
	}
	
	public LastWordRankService() {
		
		this.lastWordRankList = new ArrayList<>();
	}

	private static final String LAST_WORD_RANK_PATH = "C:\\Temp/rank/lastWordRank.txt";

	DecimalFormat df = new DecimalFormat("0.00%");

	public void lastWordRankCalc() {

		try {
			File file = new File(LAST_WORD_RANK_PATH );
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("/");

				if (parts.length == 4) {
					String user = parts[0];
					String category = parts[1];
					int win = Integer.parseInt(parts[2]);
					int lose = Integer.parseInt(parts[3]);
					double winRatio = (double)win/(win+lose);
					lastWordRankList.add(new LastWordRank(user, category, winRatio));
				}
			}
			scanner.close();

			Collections.sort(lastWordRankList, (rank1, rank2) ->
					Double.compare(rank2.getWinRatio(), rank1.getWinRatio()));

			int cnt = 0;
			for(int i = 0; i < 5; i++) {

				System.out.println("\n끝말 잇기 " + (cnt + 1) + "등: " + lastWordRankList.get(i).getUser());
				System.out.println("승률: " + df.format(lastWordRankList.get(i).getWinRatio()));
				cnt++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getStackTrace());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n랭킹은 5등까지만 산출합니다. 유저가 6명 미만이면 등록된 유저까지만 출력합니다");
		}
	}
	
	

}
