package practice;

public class des {
    public static void main(String[] args) {

    }

    public String frontTimes(String str, int n) {
        int fase = 3;
        if(fase > str.length()){
            fase = str.length();
        }
        String lng = str.substring(0, fase);
        String result = "";
        for(int i = 0; i < n; i++){
            result = result + lng;
        }

        return result;
    }
    }
