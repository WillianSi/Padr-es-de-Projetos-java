package willian;

import java.util.HashMap;

public class YouTubeDownloader {
	private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Página de vídeo (imagine um HTML sofisticado)");
        System.out.println("ID: " + video.id);
        System.out.println("Título: " + video.title);
        System.out.println("Vídeo: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Vídeos mais populares no YouTube (imagine um HTML sofisticado)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Título: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
