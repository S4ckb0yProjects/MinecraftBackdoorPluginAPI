package minecraft.backdoor.plugin.api.files;

public class File {
	public static String path = System.getProperty("user.dir");

	public static String getPath() {
		return path;
	}
}
