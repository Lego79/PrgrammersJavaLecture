package rank.service.recordService;
import rank.entity.LastWordRecord;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class LastWordGameRecordService {

    private List<LastWordRecord> LastWordRecordList;

    public LastWordGameRecordService(List<LastWordRecord> lastWordRecordList) {
        LastWordRecordList = lastWordRecordList;
    }

    public LastWordGameRecordService() {

        this.LastWordRecordList = new ArrayList<>();
    }

    private static final String LAST_WORD_RANK_PATH = "C:\\Temp/rank/lastWordRank.txt";

    public void lastWordRecorder() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LAST_WORD_RANK_PATH, true))) {
            String user =

            String record = "winter" + "/" + "lastWordRank" + "/" + "7" + "/" + "6";
            writer.write(record);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
