package Dec.ex_12022024;

public class BaseClass {


    private String browser;


    BaseClass() {
        System.out.println("Dc-Base Class");
    }

    BaseClass(String b) {
        System.out.println("Pc- Base Class");
    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed");
        }
    }

    void  OpenBrowser(){
        System.out.println("Opening Browser");
    }
    void  OpenBrowser(String browserName){
        System.out.println("Opening Browser" + browserName);
    }
    void CloseBrowser(){
        System.out.println("Close Browser");
    }

}
