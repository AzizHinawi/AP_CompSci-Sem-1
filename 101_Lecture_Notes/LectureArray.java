/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 5, 9, 8, 8, 3, 8, 8};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(dupeCheck == arr[i]){
                System.out.println("A duplicate found at "+i);
            }
        }
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.println("Two in a row found at: "+i+" and "+(i+1)+". The value was "+arr[i]);
            }
        }
        
	}
}