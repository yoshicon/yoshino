package mimina;

public class asdd {
	public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        // System.out.println("input num");
        // int w = s.nextInt();

        // String[w] np={};

        // for(int q=0;q<w;q++){
        //     System.out.print("xxxx : ");
        //     np[q] = s.nextLine();
        // }
        // System.out.println();
        // System.out.println("=====================================================");
        // System.out.println();

        // for(String as : np){
        //     System.out.println(as);
        // }   // 위에 for문이랑 같음

        //  s.close();

        String mb[][]={
                        {"127", "바부"},
                        {"72", "kut"},
                        {"2", "kong"}
        };

        for(int q = 0 ; q < mb.length ; q++)
            System.out.println(mb[q][0] + " : " + mb[q][1]);
    }
}