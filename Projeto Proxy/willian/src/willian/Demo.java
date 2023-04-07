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

        // Comportamento do usuário em nosso aplicativo:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("Gatos");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("vídeo de dança");
        
        // Os usuários podem visitar a mesma página com bastante frequência.
        downloader.renderVideoPage("Gatos");
        downloader.renderVideoPage("algum outro vídeo");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Tempo decorrido: " + estimatedTime + "ms\n\n");
        return estimatedTime;
    }
}
