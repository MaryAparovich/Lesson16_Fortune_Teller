package by.htp.collections.logic.history;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import by.htp.collections.logic.Client;

public class FortuneHistory {

	private Map<Client, Long> historyMap = new HashMap<>();

	public void add(Client key) {
		Date date = new Date();
		historyMap.put(key, date.getTime());
	}

	public boolean checkTimeDivination(Client key) {

		Long lastTimeDivination = historyMap.get(key);
		if (lastTimeDivination != null) {

			Date date = new Date();
			long currentTime = date.getTime();

			long differenceMilliSeconds = currentTime - lastTimeDivination;
			long twentyFourHours = differenceMilliSeconds / 86400000;

			if (twentyFourHours < 1) {
				System.out.println("Следующее гадание доступно через сутки");
				return false;
			}
		}
		return true;
	}
}
