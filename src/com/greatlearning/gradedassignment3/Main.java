package com.greatlearning.gradedassignment3;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
         try {
          //declare an array of floors and days
          Integer[] floors;
          int numFloors;
          int[] days;
          try (Scanner scanner = new Scanner(System.in)) {
			//input number of floors in the building
			  System.out.print("enter the total no of floors in the building :");
			  numFloors = scanner.nextInt();
			  
      
      
			  //allocate memory to the floors and days array with number of floors
			  floors = new Integer[numFloors];
			  days = new int[numFloors];
			 
			  //initialize all floors and days to 0
			  for (int f = 0; f < numFloors; f++){
			      floors[f]=Integer.valueOf(0);
			      days[f]=0;
			  }
			 
			  
			 
			  //initialize the next floor size needed to continue construction with the maximum size
			  int nextFloorSizeNeeded=numFloors;
			 
			 
			  //Load Delivery Plan
			  int day;
			  for (int i = 0; i < numFloors; i++) {
			    //For each day, input floor size
			    day=i+1;
			    System.out.print("\nenter the floor size given on day : "+ day +" ");
			    int floorReceived = scanner.nextInt();;
			   
			    //Populate floor size in the respective floor array
			    days[i] = floorReceived;
			  }
			 
			 
			 
      
			 
			  //Create Construction Plan based on the Delivery Plan
			 
			 
			  for (int i = 0; i < numFloors; i++){
			      day = i+1;
			      System.out.print("\nDay: "+day+" ");
			        
			        if (days[i] == nextFloorSizeNeeded){
			            System.out.print(" "+days[i]);
			            nextFloorSizeNeeded--;
			           
			            //while nextFloorSizeNeeded > 0
			            while(nextFloorSizeNeeded > 0){
			                if(floors[numFloors-1] == nextFloorSizeNeeded){
			                   System.out.print(" "+floors[numFloors-1]);
			                       floors[numFloors-1]=0;
			                       Arrays.sort(floors);
			                       nextFloorSizeNeeded--;
			                }
			                else{
			                    break;
			                }
			               
			            }
			        }
			        else{
			            // Add the floor size to floor stack sort/resort
			            floors[0]=Integer.valueOf(days[i]);
			            Arrays.sort(floors);
			            //System.out.print("Floors Stack "+Arrays.toString(floors)+"\n");
			        }
			  }
		}
         
                       
        }    
        catch (Exception e) {
            System.out.println(e);
        }

    }
   
   
}
