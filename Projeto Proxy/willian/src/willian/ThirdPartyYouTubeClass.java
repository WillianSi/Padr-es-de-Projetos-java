package willian;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

	    public HashMap<String, Video> popularVideos() {
	        connectToServer("http://www.youtube.com");
	        return getRandomVideos();
	    }


	    public Video getVideo(String videoId) {
	        connectToServer("http://www.youtube.com/" + videoId);
	        return getSomeVideo(videoId);
	    }

	    // -----------------------------------------------------------------------
	    // Métodos falsos para simular a atividade da rede. Eles são tão lentos quanto na vida real.

	    private int random(int min, int max) {
	        return min + (int) (Math.random() * ((max - min) + 1));
	    }

	    private void experienceNetworkLatency() {
	        int randomLatency = random(5, 10);
	        for (int i = 0; i < randomLatency; i++) {
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    private void connectToServer(String server) {
	        System.out.print("\nConectando à " + server + "... ");
	        experienceNetworkLatency();
	        System.out.print("Conectado!" + "\n");
	    }

	    private HashMap<String, Video> getRandomVideos() {
	        System.out.print("Baixando populares ... ");

	        experienceNetworkLatency();
	        HashMap<String, Video> hmap = new HashMap<String, Video>();
	        hmap.put("catz", new Video("sadgahasgdas", "Gatos.avi"));
	        hmap.put("mkafksangasj", new Video("mkafksangasj", "Cachorro brincando com bola.mp4"));
	        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Vídeo dançante.mpq"));
	        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
	        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Lição de programação #14.avi"));

	        System.out.print("Feito!" + "\n");
	        return hmap;
	    }

	    private Video getSomeVideo(String videoId) {
	        System.out.print("Baixando vídeo ... ");

	        experienceNetworkLatency();
	        Video video = new Video(videoId, "Algum título de vídeo");

	        System.out.print("Feito!" + "\n");
	        return video;
	    }

}
