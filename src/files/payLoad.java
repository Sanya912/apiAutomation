package files;

public class payLoad {

	
	public static String getPostData(){
		String b = "{"+

    "\"location\":{"+

        "\"lat\" : -38.383494,"+

        "\"lng\" : 33.427362"+

    "},"+

    "\"accuracy\":50,"+

    "\"name\":\"Frontline house\","+

    "\"phone_number\":\"(+91) 983 893 3937\","+

    "\"address\" : \"29, side layout, cohen 09\","+

    "\"types\": [\"shoe park\",\"shop\"],"+

    "\"website\" : \"http://google.com\","+

    "\"language\" : \"French-IN\""+

"}";
		return b;
	}
	
	public static String Addbook(String n, Integer num){
		String payload = "{\"name\":\"Learn Appium Automation with Java\",\"isbn\":\""+ num+"\",\"aisle\":\"249\",\"author\":\"Alekc\"}";
		return payload;
	}
}
