package org.sadman.soap;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;
import com.lavasoft.GetIpLocation;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1)
			System.out.println("You need to pass one IP address");
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			String getIpLocation = geoIPServiceSoap.getCountryISO2ByName(ipAddress);
			System.out.println(getIpLocation);
		}
	}

}
