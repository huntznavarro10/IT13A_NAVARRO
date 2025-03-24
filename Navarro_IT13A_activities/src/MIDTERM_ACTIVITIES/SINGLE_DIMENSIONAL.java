
package MIDTERM_ACTIVITIES;



public class SINGLE_DIMENSIONAL {
    
    public static void main(String[] args){
//        
//        char[] DODO = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
//        
//       for(char c : DODO) {
//        
//        System.out.print( c + ", ");
//       }
        
//SINGLE ARRAY




//MULTIDEMSIONAL ARRAY
int[][] navarro = {
            {1, 2, 3, 4,},
            {5, 6, 7, 8,},
            {9, 10, 11, 12,}
                
            };
        
        for (int i = 0; i< navarro.length; i++) {
            
            System.out.print("The elements in row" + (i + 1 + " : "));
            
            for(int j = 0; j < navarro[i].length; j++) 
            {
            
            System.out.print(navarro[i][j] + " ");
            }
            System.out.println();
            
        }
        
    
        }
    }
      
        
    
    

