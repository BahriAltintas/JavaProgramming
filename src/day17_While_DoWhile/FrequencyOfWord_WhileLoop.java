package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequences = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequences++;
        }
        System.out.println(frequences);

        System.out.println("--------------------------------------------");

        String sentence = "cat cat cat dog dog dog cat cat";


        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            System.out.println(sentence);
        }



    }

}
