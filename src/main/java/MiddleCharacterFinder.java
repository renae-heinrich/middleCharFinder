public class MiddleCharacterFinder {

    public MiddleCharacterFinder(){

    }

    public static String calculator(String word){
        String result = "";

        if(!word.isEmpty()) {

            String[] token = word.split("");

            if (token.length % 2 == 1) {
                int index = token.length / 2;
                result = token[index];

            } else {
                int secondIndex = token.length / 2;
                int firstIndex = secondIndex - 1;


                result = token[firstIndex] + token[secondIndex];
            }
        }

    return result;
    }
}
