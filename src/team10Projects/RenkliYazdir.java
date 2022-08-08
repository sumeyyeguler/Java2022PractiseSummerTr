package team10Projects;

/*
---- String içindeki text i istenilen renkte yazdirir.
---- Yazdirilan her Sout işleminden sonra ANSI_RESET yazdirilmalidir

 */

public class RenkliYazdir {


    //Istenilen Renkleri Class Seviyesinde Tanimlamaiz gerekiyor
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        //ORNEKLER
        System.out.println(ANSI_RED + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "QA_TEAM_10" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "QA_TEAM_10" + ANSI_RESET);
    }


}