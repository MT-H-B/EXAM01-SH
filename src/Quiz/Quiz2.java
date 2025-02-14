package Quiz;

public class Quiz2 {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
           for(int j=1;j<=10;j++) {
                if((i/3>0&&i%3==0)||j%3==0||(i*10+j)%30==0){
                    System.out.print("CLAP");
                }
                else{
                    System.out.print(i*10+j+"\t");
                }
                System.out.print("\t");
           }
           System.out.println();
        }
    }
}
