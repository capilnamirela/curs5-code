public class confidentialScript {
    public static void main(String[] args) {
        //1
        System.out.println(countChar("testare", 't'));

        //2
        System.out.println(redact("word"));

        //3
        String[] names = {"George", "Mihai", "Ioana"};
        System.out.println(containsWord(names, "Mihai"));

        //4
        String[] splitArray = splitString("Ana are mere");
        for (String word : splitArray){
            System.out.println(word);
        }

        //5
        String[] sensitiveWords = {"mere", "Ana"};
        confidential ("Ana are mere multe mere bune", sensitiveWords);

    }

    private static String confidential(String input, String[] sensitiveWords) {
        String[] inputArray = splitString(input);
        for (int index = 0; index < inputArray.length; index++){
            if (containsWord(sensitiveWords, inputArray[index])) {
                
            }
        }

        return null;
    }

    private static String[] splitString(String input) {
        return input.split(" ");

    }

    private static boolean containsWord(String[] names, String toBeFound) {
        for (String name : names){
            if (name.equals(toBeFound)){
                return true;
            }
        }
        return false;
    }

    private static String redact(String request) {
        return request.replaceAll(".","*");
    }


    private static int countChar(String entry, char foudChar) {
        int count = 0;
        for(int index = 0; index < entry.length(); index++ ){
            if (entry.charAt(index) == foudChar){
                count++;
            }
        }
        return count;
    }



}
