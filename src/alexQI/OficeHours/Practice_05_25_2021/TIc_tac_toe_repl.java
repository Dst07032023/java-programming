package alexQI.OficeHours.Practice_05_25_2021;

public class TIc_tac_toe_repl {
    public static void main(String[] args) {

        char[] game = {
                'X', 'X', 'X',
                '-', '0', '-',
                '-', '0', '-'
        };
    }

    /*

     Horizontal:
        a[0] + a[1] + a[2]
        a[3] + a[4] + a[5]
        a[6] + a[7] + a[8]

     Vertical:
        a[0] + a[3] + a[6]
        a[1] + a[4] + a[7]
        a[2] + a[5] + a[8]

     Diagonal:
        a[0] + a[4] + a[8]
        a[2] + a[4] + a[6]
     */

    public static String won(char[] x) {
        String winner = "";
        for (int i = 0, y=0; y < x.length; i++, y+=3) {

            /*
            Horizontal:
        a[0] + a[1] + a[2]
        a[3] + a[4] + a[5]
        a[6] + a[7] + a[8]
             */

            String rows = "" + x[y] + x[y + 1] + x[y + 2];
            String col = "" + x[i] + x[i + 3] + x[y + 6];
            String dig = "";

            if(i == 0){
                dig = "" + x[i] + x[i + 4] + x[i + 8];
            } else if (i == 2) {
                dig = "" + x[i] + x[i + 2] + x[i + 4];


            }

            if(rows.equals("XXX") || col.equals("XXX") || dig.equals("XXX")) {
                winner = "Player X won";
            }else if(rows.equals("000") || col.equals("000") || dig.equals("000")){
                winner = "Player 0 won";
            }

        }

        return winner;

    }
}
