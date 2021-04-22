package ro.ase.cts.seminar9;

import ro.ase.cts.seminar9.flyweight.Model3DFactory;
import ro.ase.cts.seminar9.flyweight.ModelFlyweightInterface;
import ro.ase.cts.seminar9.flyweight.ModelType;
import ro.ase.cts.seminar9.flyweight.ScreenData;
import ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without proxy
		YoutubeLibraryInterface youtubeLib= new YoutubeLibrary();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoinfo(1));
		System.out.println(youtubeLib.getVideoinfo(1));
		System.out.println(".........................");
		//with proxy
		YoutubeLibraryInterface youtubeLibProxy= new YoutubeLibraryProxy();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoinfo(1));
		System.out.println(youtubeLib.getVideoinfo(1));
		
		
		ScreenData dataSet1=new ScreenData("green",99,30,100);
		ScreenData dataSet2=new ScreenData("green",20 , 30, 40);
		ModelFlyweightInterface soldier1=Model3DFactory.getModel(ModelType.SOLDIER);
		soldier1.display(dataSet1);
		soldier1.display(dataSet2);
		soldier1.display(dataSet2);

	}

}
