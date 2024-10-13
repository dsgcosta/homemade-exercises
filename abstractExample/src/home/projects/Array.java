package home.projects;

public class Array {
   int [] numberArray;

   public Array(int[] numberArray){
       this.numberArray = numberArray;
   }

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = numberArray;
    }

    public void printArray(){
       for(int num : numberArray){
           System.out.print(num + " ");
       }
    }
}
