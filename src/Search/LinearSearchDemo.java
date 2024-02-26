package Search;
public class LinearSearchDemo {
    public static void main(String[] args) {
        int [] intArray = {20,35,-15,7,55,1,-22};
        System.out.println(linearSearch(intArray,-15)); // -15 is at index 2
        System.out.println(linearSearch(intArray,22)); // 22 is not present in the array
        System.out.println(linearSearch(intArray, 67));
    }
    public static int linearSearch(int[] input, int value){
        for(int i=0; i<input.length;i++){ //increment index till we get the value
            if(input[i] == value){ //if value passed in constructor is equal to 'i' then it will return 'i'
                return i;
            }
        }
        return -1;
    }
}
