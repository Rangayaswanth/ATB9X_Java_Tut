package ex_12042024;

public enum Enum_P3 {;
    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());

        if(color.Green.getHexcode()=="#61FF33"){
            System.out.println("color is green");
        }
    }



}



enum color{

    RED("FF0000"),
    Green("#61FF33"),
    BLUE("#3377ff");



    private String hexcode;
    color(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return this.hexcode;
    }
}