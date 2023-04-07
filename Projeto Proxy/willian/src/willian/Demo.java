package willian;

public class Demo {

	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Tempo economizado pelo cache de proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // Comportamento do usu�rio em nosso aplicativo:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("Gatos");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("v�deo de dan�a");
        
        // Os usu�rios podem visitar a mesma p�gina com bastante frequ�ncia.
        downloader.renderVideoPage("Gatos");
        downloader.renderVideoPage("algum outro v�deo");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Tempo decorrido: " + estimatedTime + "ms\n\n");
        return estimatedTime;
    }
}
