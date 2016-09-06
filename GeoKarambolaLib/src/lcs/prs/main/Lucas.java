package lcs.prs.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import pt.karambola.gpx.beans.Gpx;
import pt.karambola.gpx.beans.Point;
import pt.karambola.gpx.beans.Track;
import pt.karambola.gpx.beans.TrackPoint;
import pt.karambola.gpx.beans.TrackSegment;
import pt.karambola.gpx.io.GpxFileIo;
import pt.karambola.gpx.parser.GpxParser;
import pt.karambola.gpx.util.GpxRouteUtils;
import pt.karambola.gpx.util.GpxTrackUtils;

public class Lucas {

	public static void main(String[] args) {
		Gpx gpx = GpxFileIo.parseIn("res/LeuvenArsene.gpx");
		
		for (Track tr : gpx.getTracks()) {
			System.out.println(tr.getTrackPoints().get(0));
			
		}
		
		


		
		
		
		
		
	
	}
		

}
