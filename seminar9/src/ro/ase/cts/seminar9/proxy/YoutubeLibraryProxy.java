package ro.ase.cts.seminar9.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {

	private YoutubeLibraryInterface libImplementation;

	public YoutubelibraryProxy() {
		libImplementation=new YoutubeLibrary();
	}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoinfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
