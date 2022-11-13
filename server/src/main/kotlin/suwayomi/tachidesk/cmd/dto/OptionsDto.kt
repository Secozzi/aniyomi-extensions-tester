package suwayomi.tachidesk.cmd.dto

/**
 * General options data-class, used in Main.kt to start the tests engine.
 *
 * @param apksPath The path of the apk file OR directory with apks.
 * @param configs The ConfigsDto instance to be passed to the tests engine.
 * @param debugMode An switch to use OkHttp logging interceptor.
 * @param jsonFilesDir The directory to put the JSON result files
 * @param proxy The http/https/socks5 proxy address to be used on every request.
 * @param tmpDir The directory to put temporary files generated by dex2jar.
 * @param userAgent An custom User-Agent header to be used in OkHttp requests.
 */
data class OptionsDto(
    val apksPath: String,
    val configs: ConfigsDto,
    val debugMode: Boolean,
    val jsonFilesDir: String?,
    val prettyJson: Boolean = false,
    val proxy: String?,
    val tmpDir: String,
    val userAgent: String?
)

/**
 * Options to the tests engine.
 *
 * @param animeUrl An specific anime-url to be used in AnimeDetails and EpList tests.
 * @param checkThumbnails An switch to enable checking if thumbnails are loading.
 * @param completeResults An switch to enable dumping ALL data that comes from each test.
 * @param dateFormat The format to use when printing the date of upload of a episode.
 * @param episodeUrl An specific episode url to be used in videoList test. Has priority over episodeNumber param.
 * @param episodeNumber An specific episode number to be used in videoList test.
 * @param increment An switch to turn on animes page incrementing, testing hasNext.
 * @param printJson  An switch to disable pretty-printing to just show json instead.
 * @param resultsCount The amount of results from animes pages to be printed, limiting the spam.
 * @param searchStr An specific word or phrase to be used in search test.
 * @param stopOnError Stop ALL tests on the first error.
 * @param tests An comma-separated list of tests to be done in order, like "popular,anidetails"
 */
data class ConfigsDto(
    val animeUrl: String = "",
    val checkThumbnails: Boolean = false,
    val completeResults: Boolean = false,
    val dateFormat: String = "",
    val episodeUrl: String = "",
    val episodeNumber: Int = -1,
    val increment: Boolean = false,
    val printJson: Boolean = false,
    val resultsCount: Int = 2,
    val searchStr: String = "",
    val showAll: Boolean = false,
    val stopOnError: Boolean = false,
    val tests: String = ""
)
