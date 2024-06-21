public class CountChar {

    public static void main(String[] args) {

        String site = "www.oracle.com";

        int max = site.length();
        int wS = 0;
        for(int i = 0; i != max;i++)
        {
            char leitura = site.charAt(i);
            if(leitura == 'w')
            {
                wS++;
            }
            
        }
        System.out.println("Numero de W's: "+wS);
    }
}
    

