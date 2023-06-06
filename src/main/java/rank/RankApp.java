package rank;


import rank.service.rankService.LastWordRankService;
import rank.service.rankService.NormalGameRankService;
import rank.service.recordService.LastWordGameRecordService;

public class RankApp {
	
	public static void main(String[] args) {
		

		NormalGameRankService n1 = new NormalGameRankService();
		LastWordRankService s1 = new LastWordRankService();
		LastWordGameRecordService ls1 = new LastWordGameRecordService();

//		System.out.println("\n--------consonantRank--------");
//		n1.consonantRankCalc();
//
//		System.out.println("\n--------wordRankCalc--------");
//		n1.wordRankCalc();
//
//		System.out.println("\n--------paragraphCalc--------");
//		n1.paragraphCalc();
//
//		System.out.println("\n--------longParagraphCalc--------");
//		n1.longParagraphCalc();

//		System.out.println("\n--------LastWordCalc--------");
//		s1.lastWordRankCalc();

		ls1.lastWordRecorder();

	}

}
