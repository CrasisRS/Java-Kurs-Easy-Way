public class SchleifeWhile {
    public static void main(String[] args) {

        int count = 1;
/*        while (count != 6){
            System.out.println("Ich bin: " + count);
            count++;
        }*/

        while(true){
            System.out.println("Hi");
            if(count == 3){
                break;
            }
            count++;
        }


    }
}
