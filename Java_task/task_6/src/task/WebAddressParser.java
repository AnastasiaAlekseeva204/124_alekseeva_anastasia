package task;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class WebAddressParser {
    private String adress;
    private String login;
    private String password;
    private String schema;
    private String host;
    private String port;
    private String url;
    private String fragment;
   // private String l = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
   private Pattern p = Pattern.compile("(https?|ftp|file):(//(([a-zA-Z0-9_]+)(:([a-zA-Z0-9_]+))@)?([a-zA-Z0-9_|.]+)*(:([0-9{4}]+))?)?(\\/([a-zA-Z0-9_|/]+))*(\\?([a-zA-Z0-9_|=&]+))*(\\#([a-zA-Zа-яА-Я0-9_]+))?");
    public WebAddressParser(String s){
        this.adress = s;
        if(this.isValid()){
            this.adress = s;
        }
        else{
            this.adress = "";
        }
    }
    public String getLogin(){
        Matcher m = p.matcher(this.adress);
        //System.out.println(m.group(4));
        if(m.find() && m.group(4) != null){
            this.login = m.group(4);
            return m.group(4);
        }
        return "";
    }
    public String getPassword(){
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(6) != null){
            this.password = m.group(6);
            return m.group(6);
        }
        return "";
    }
    public boolean isValid(){
        Matcher m = p.matcher(this.adress);
        return m.matches();
    }
    public String getScheme(){
        Matcher m = p.matcher(adress);
        if(m.find()&& m.group(1)!= null) {
            this.schema = m.group(1);
            return this.schema;
        }
        this.schema = "";
        return this.schema;
    }
    public String getHost(){
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(7) != null ){
            this.host = m.group(7);
            return m.group(7);
        }
        return "";
    }
    public String getPort(){
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(9) != null){
            this.port= m.group(9);
            return m.group(9);
        }
        this.port = "";
        return this.port;
    }
    public String getUrl(){
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(11) != null){
            this.url= m.group(11);
            return m.group(11);
        }
        this.url = "";
        return this.url;
    }
    public String getFragment(){
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(15) != null){
            this.fragment= m.group(15);
            return m.group(15);
        }
        this.fragment = "";
        return this.fragment;
    }
    public  HashMap<String, String> getParameters(){
        HashMap<String,String> a = new HashMap<String,String>();
        Matcher m = p.matcher(this.adress);
        if(m.find() && m.group(13) != null){
            String[] param = (m.group(13)).split("&|=");
            for(int i = 0; i< param.length; i+=2){
                a.put(param[i],param[i+1]);
            }
            return a;
        }
        return a;
    }
    /*      - String getLogin() - возвращает логин
         *      - String getPassword() - возвращает пароль
         *      - String getScheme() - возвращает схему
         *      - boolean isValid() - является ли адрес корректным
         *      - String getHost() - возвращает хост
         *      - String getPort() - возвращает порт
         *      - String getUrl() - возвращает url-путь
         *      - HashMap<String, String> getParameters() - возвращает словарь
         *          параметров с их значениями
         *     - String getFragment() - возвращает якоро

     */
}
