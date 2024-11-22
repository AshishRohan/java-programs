public class Wordcount   
{  
    public static void main(String[] args) {  
        String sentence = "Java is a independent programming language";  
        int wordCount = 0;  
          
        for(int i = 0; i < sentence.length()-1; i++) {  
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
      
        wordCount++;  
          
      
        System.out.println("Total number of words in the given string: " + wordCount);  
    }  
}  