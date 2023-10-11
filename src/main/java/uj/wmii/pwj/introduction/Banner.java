package uj.wmii.pwj.introduction;

public class Banner {
    public String[] toBanner(String input) {
        if( input == null )
            return new String[0];

        input = input.toUpperCase();
        StringBuilder[] sb = new StringBuilder[7];
        for(int i = 0; i < 7; ++i ){
            sb[i]= new StringBuilder();
        }

        for( int i = 0; i < input.length(); ++i){
            switch (input.charAt(i)) {
                case 'A' -> {
                    sb[0].append("   #   ");
                    sb[1].append("  # #  ");
                    sb[2].append(" #   # ");
                    sb[3].append("#     #");
                    sb[4].append("#######");
                    sb[5].append("#     #");
                    sb[6].append("#     #");
                }
                case 'B' -> {
                    sb[0].append("###### ");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("###### ");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append("###### ");
                }
                case 'C' -> {
                    sb[0].append(" ##### ");
                    sb[1].append("#     #");
                    sb[2].append("#      ");
                    sb[3].append("#      ");
                    sb[4].append("#      ");
                    sb[5].append("#     #");
                    sb[6].append(" ##### ");
                }
                case 'D' -> {
                    sb[0].append("###### ");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#     #");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append("###### ");
                }
                case 'E' -> {
                    sb[0].append("#######");
                    sb[1].append("#      ");
                    sb[2].append("#      ");
                    sb[3].append("#####  ");
                    sb[4].append("#      ");
                    sb[5].append("#      ");
                    sb[6].append("#######");
                }
                case 'F' -> {
                    sb[0].append("#######");
                    sb[1].append("#      ");
                    sb[2].append("#      ");
                    sb[3].append("#####  ");
                    sb[4].append("#      ");
                    sb[5].append("#      ");
                    sb[6].append("#      ");
                }
                case 'G' -> {
                    sb[0].append(" ##### ");
                    sb[1].append("#     #");
                    sb[2].append("#      ");
                    sb[3].append("#  ####");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append(" ##### ");
                }
                case 'H' -> {
                    sb[0].append("#     #");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#######");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append("#     #");
                }
                case 'I' -> {
                    sb[0].append("###");
                    sb[1].append(" # ");
                    sb[2].append(" # ");
                    sb[3].append(" # ");
                    sb[4].append(" # ");
                    sb[5].append(" # ");
                    sb[6].append("###");
                }
                case 'J' -> {
                    sb[0].append("      #");
                    sb[1].append("      #");
                    sb[2].append("      #");
                    sb[3].append("      #");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append(" ##### ");
                }
                case 'K' -> {
                    sb[0].append("#    #");
                    sb[1].append("#   # ");
                    sb[2].append("#  #  ");
                    sb[3].append("###   ");
                    sb[4].append("#  #  ");
                    sb[5].append("#   # ");
                    sb[6].append("#    #");
                }
                case 'L' -> {
                    sb[0].append("#      ");
                    sb[1].append("#      ");
                    sb[2].append("#      ");
                    sb[3].append("#      ");
                    sb[4].append("#      ");
                    sb[5].append("#      ");
                    sb[6].append("#######");
                }
                case 'M' -> {
                    sb[0].append("#     #");
                    sb[1].append("##   ##");
                    sb[2].append("# # # #");
                    sb[3].append("#  #  #");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append("#     #");
                }
                case 'N' -> {
                    sb[0].append("#     #");
                    sb[1].append("##    #");
                    sb[2].append("# #   #");
                    sb[3].append("#  #  #");
                    sb[4].append("#   # #");
                    sb[5].append("#    ##");
                    sb[6].append("#     #");
                }
                case 'O' -> {
                    sb[0].append("#######");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#     #");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append("#######");
                }
                case 'P' -> {
                    sb[0].append("###### ");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("###### ");
                    sb[4].append("#      ");
                    sb[5].append("#      ");
                    sb[6].append("#      ");
                }
                case 'Q' -> {
                    sb[0].append(" ##### ");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#     #");
                    sb[4].append("#   # #");
                    sb[5].append("#    # ");
                    sb[6].append(" #### #");
                }
                case 'R' -> {
                    sb[0].append("###### ");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("###### ");
                    sb[4].append("#   #  ");
                    sb[5].append("#    # ");
                    sb[6].append("#     #");
                }
                case 'S' -> {
                    sb[0].append(" ##### ");
                    sb[1].append("#     #");
                    sb[2].append("#      ");
                    sb[3].append(" ##### ");
                    sb[4].append("      #");
                    sb[5].append("#     #");
                    sb[6].append(" ##### ");
                }
                case 'T' -> {
                    sb[0].append("#######");
                    sb[1].append("   #   ");
                    sb[2].append("   #   ");
                    sb[3].append("   #   ");
                    sb[4].append("   #   ");
                    sb[5].append("   #   ");
                    sb[6].append("   #   ");
                }
                case 'U' -> {
                    sb[0].append("#     #");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#     #");
                    sb[4].append("#     #");
                    sb[5].append("#     #");
                    sb[6].append(" ##### ");
                }
                case 'V' -> {
                    sb[0].append("#     #");
                    sb[1].append("#     #");
                    sb[2].append("#     #");
                    sb[3].append("#     #");
                    sb[4].append(" #   # ");
                    sb[5].append("  # #  ");
                    sb[6].append("   #   ");
                }
                case 'W' -> {
                    sb[0].append("#     #");
                    sb[1].append("#  #  #");
                    sb[2].append("#  #  #");
                    sb[3].append("#  #  #");
                    sb[4].append("#  #  #");
                    sb[5].append("#  #  #");
                    sb[6].append(" ## ## ");
                }
                case 'X' -> {
                    sb[0].append("#     #");
                    sb[1].append(" #   # ");
                    sb[2].append("  # #  ");
                    sb[3].append("   #   ");
                    sb[4].append("  # #  ");
                    sb[5].append(" #   # ");
                    sb[6].append("#     #");
                }
                case 'Y' -> {
                    sb[0].append("#     #");
                    sb[1].append(" #   # ");
                    sb[2].append("  # #  ");
                    sb[3].append("   #   ");
                    sb[4].append("   #   ");
                    sb[5].append("   #   ");
                    sb[6].append("   #   ");
                }
                case 'Z' -> {
                    sb[0].append("#######");
                    sb[1].append("     # ");
                    sb[2].append("    #  ");
                    sb[3].append("   #   ");
                    sb[4].append("  #    ");
                    sb[5].append(" #     ");
                    sb[6].append("#######");
                }
                case ' ' -> {
                    sb[0].append("    ");
                    sb[1].append("    ");
                    sb[2].append("    ");
                    sb[3].append("    ");
                    sb[4].append("    ");
                    sb[5].append("    ");
                    sb[6].append("    ");
                }
            }


            if( i+1 != input.length() ){
                if(input.charAt(i+1) != ' ' && input.charAt(i) != ' ') {
                    sb[0].append(" ");
                    sb[1].append(" ");
                    sb[2].append(" ");
                    sb[3].append(" ");
                    sb[4].append(" ");
                    sb[5].append(" ");
                    sb[6].append(" ");
                }
            }
        }

        String[] banner = new String[7];
        for(int i = 0; i < 7; ++i){
            banner[i] = sb[i].toString();
            System.out.println(banner[i]);
        }
        return banner;
    }
}
