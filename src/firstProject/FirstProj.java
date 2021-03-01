package firstProject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FirstProj {
	public static void main(String[] args) throws IOException {
		 System.out.println("\n**************************************\n");
	     System.out.println("\tWelcome! \n");
	     System.out.println("**************************************");
	     File directoryPath = new File("C:/Users/ujwal/eclipse-workspace/firstProject/");
	     System.out.println(directoryPath);
	     File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	         System.out.println("File path: "+file.getAbsolutePath());
	         System.out.println("Size :"+file.getTotalSpace());
	         System.out.println(" ");
	      }
	     optionsSelection();
	}
	
	     private static void optionsSelection() {
	    	 String[] arr = {"1. I wish to see file names in ascending order",
		                "2. I wish to add, delete or search for user",
		                "3. Close the application"
		        };
	    	 int[] arr1 = {1,2,3};
		        int  slen = arr1.length;
		        for(int i=0; i<slen;i++){
		            System.out.println(arr[i]);
		            // display the all the Strings mentioned in the String array
		        }
		        System.out.println("\nEnter your choice:\t");
		        Scanner sc = new Scanner(System.in);
		        int  options =  sc.nextInt();
		        for(int j=1;j<=slen;j++){
		            if(options==j){
		            	File directoryPath = new File("C:/Users/ujwal/eclipse-workspace/firstProject/");
		                switch (options){
		                    case 1:
		                        System.out.println("The files are listed below in alphabetical order: \n");
		                        //File directoryPath = new File("C:/Users/ujwal/eclipse-workspace/firstProject");
		                        File filesList[] = directoryPath.listFiles();
		              	      System.out.println("List of files and directories in the specified directory:");
		              	      for(File file : filesList) {
		              	         System.out.println("File name: "+file.getName());
		              	         System.out.println("File path: "+file.getAbsolutePath());
		              	         System.out.println("Size :"+file.getTotalSpace());
		              	         System.out.println(" ");
		              	      }
		                        //System.out.println(expenses+"\n");
		                        optionsSelection();
		                        break;
		                    case 2:
		                        //System.out.println("Enter the value to add your Expense: \n");
		                        //int value = sc.nextInt();
		                        //expenses.add(value);
		                        //System.out.println("Your value is updated\n");
		                        //expenses.addAll(arrlist);
		                        //System.out.println(expenses+"\n");
		                        nextOptionsSelection(directoryPath);
		                        optionsSelection();

		                        break;
		                    case 3:
		                        closeApp();
		                        break;
		                    default:
		                        System.out.println("You have made an invalid choice!");
		                        break;
		                }
		            }
		        }

	}
	     private static void closeApp() {
		        System.out.println("Closing your application... \nThank you!");
		            }
	     
	     private static void nextOptionsSelection(File directoryPath) {
	    	 String[] arr2 = {"1. I wish to add a file to the existing directory list",
		                "2. I wish to delete a file from the existing directory list",
		                "3. I wish to search for a file from the existing directory list",
		                "4. I wish to go back to the main screen"
		        };
	    	 int[] arr3 = {1,2,3,4};
		        int  slen2 = arr3.length;
		        for(int i=0; i<slen2;i++){
		            System.out.println(arr2[i]);
		            // display the all the Strings mentioned in the String array
		        }
		        System.out.println("\nEnter your choice:\t");
		        Scanner sc2 = new Scanner(System.in);
		        int  options2 =  sc2.nextInt();
	    	 for (int j = 1; j<=4; j++) {
	    		 if(options2 == j) {
	    			 switch (options2) {
	    			 case 1:
	    				 //add file
	    				 System.out.println("hey " + directoryPath);
	    				 String textfile = "textt.txt";
	    				 File userFile = new File(directoryPath + textfile);
	    				 /*String fileName = "text.txt";
	    				 try {
							File actualFile = File.createTempFile("text", ".txt", directoryPath);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}*/
	    				 break;
	    			 case 2:
	    				 //delete file
	    				 break;
	    			 case 3:
	    				 //search for file
	    				 break;
	    			 case 4:
	    				 //go back to main screen
	    				 break;
	    			 }
	    		 }
	    	 }
	     }
}
