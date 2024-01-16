package kp;

import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main class.
 */
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());

	/**
	 * The hidden constructor.
	 */
	private Application() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * The entry point for the application.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {

		final Map<String, Map<Path, Map<Integer, Set<String>>>> datasetMap = new KeywordsCollector().collectKeywords();
		new DatasetWriter().writeDataset(datasetMap);
		final String msg = String.format("main(): projects in dataset [%d], keywords in list [%d]", datasetMap.size(),
				Constants.KEYWORDS_LIST.size());
		logger.info(msg);
	}
}