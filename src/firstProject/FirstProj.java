package firstProject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FirstProj {
	public static void main(String[] args) throws IOException {
		 System.out.println("\n**************************************\n");
	     System.out.println("\tWelcome! \n");
	     System.out.println("**************************************");
	     System.out.println("Enter name of directory");
	     // directory on my laptop is C:/Users/ujwal/eclipse-workspace/firstProject
     	@SuppressWarnings("resource")
		Scanner scc = new Scanner(System.in);
     	String dirPath = scc.next();
     	File directoryPath = new File(dirPath);
	     optionsSelection(directoryPath);
	}
	
	     private static void optionsSelection(File directoryPath) {
	    	 String[] arr = {"\n1. I wish to see file names in ascending order",
		                "2. I wish to add, delete or search for user",
		                "3. Close the application"
		        };
	    	 int[] arr1 = {1,2,3};
		        int  slen = arr1.length;
		        for(int i=0; i<slen;i++){
		            System.out.println(arr[i]);
		        }
		        System.out.println("\nEnter your choice:\t");
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
		        int  options =  sc.nextInt();
		        for(int j=1;j<=slen;j++){
		            if(options==j){
		                switch (options){
		                    case 1:
		                        System.out.println("The files are listed below in alphabetical order: ");
		                        File filesList[] = directoryPath.listFiles();
		              	      for(File file : filesList) {
		              	         System.out.println(file.getName());
		              	      }
		                        optionsSelection(directoryPath);
		                        break;
		                    case 2:
		                        nextOptionsSelection(directoryPath);
		                        optionsSelection(directoryPath);
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
	    	 String[] arr2 = {"\n1. I wish to add a file to the existing directory list",
		                "2. I wish to delete a file from the existing directory list",
		                "3. I wish to search for a file from the existing directory list",
		                "4. I wish to go back to the main screen"
		        };
	    	 int[] arr3 = {1,2,3,4};
		        int  slen2 = arr3.length;
		        for(int i=0; i<slen2;i++){
		            System.out.println(arr2[i]);
		        }
		        System.out.println("\nEnter your choice:\t");
		        @SuppressWarnings("resource")
				Scanner sc2 = new Scanner(System.in);
		        int  options2 =  sc2.nextInt();
	    	 for (int j = 1; j<=4; j++) {
	    		 if(options2 == j) {
	    			 switch (options2) {
	    			 case 1:
	    				 System.out.println("Type the name of the file you want to add");
	    				 Scanner sc3 = new Scanner(System.in);
	    				 String textfile = "/" + sc3.next();
	    				 File userFile = new File(directoryPath + textfile);
	    				 boolean result;
	    				 try {
	    					 result = userFile.createNewFile();
	    					 if(result) {
	    						 System.out.println("Successfully created");
	    					 }
	    					 else {
	    						 System.out.println("The file is already there");
	    					 }
	    				 } catch (IOException e) {
	    					 e.printStackTrace();
	    				 }
	    				 break;
	    			 case 2:
	    				 System.out.println("Type the name of the file you want to delete");
	    				 Scanner sc4 = new Scanner(System.in);
	    				 String textfile2 = "/" + sc4.next();
	    				 File usersFile = new File(directoryPath + textfile2);
	    				 boolean results;
	    				 results = usersFile.delete();
						 if(results) {
							 System.out.println("Successfully deleted");
						 }
						 else {
							 System.out.println("Failed deleting. The file is not there.");
						 }
	    				 break;
	    			 case 3:
	    				 File filesList[] = directoryPath.listFiles();
	    				 int leng = filesList.length;
	    				 System.out.println("Type the name of the file you want to search for");
	    				 Scanner sc5 = new Scanner(System.in);
	    				 String textfile3 = "/" + sc5.next();
	    				 File userssFile = new File(directoryPath + textfile3);
	    				 boolean flag = false;
	    				 for (int i = 0; i < leng; i++) {
	    			        	if (filesList[i].equals(userssFile)) {
	    			        		flag = true;
	    			        	}
	    			        }
	    			        if (flag == true) {
	    			        	System.out.println("The file is there!");
	    			        }
	    			        else {
	    			        	System.out.println("The file is not there");
	    			        }
	    				 break;
	    			 case 4:
	    				 break;
	    			 }
	    		 }
	    	 }
	     }
}
