//Mert Gunay
//21.05.2017
//This program read the txt file and then take the place name to user and create a destinations to that place.

package asg4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Mert_Gunay {

	public static void main(String[] args) throws FileNotFoundException{

		Station [] M2metro=new Station[15];//create array
		java.io.File file = new java.io.File("metro.txt");//read .txt file
		Scanner input = new Scanner(file);
		int counter=0;
		while ( input.hasNext() ) {//fill the array
			String Read =input.nextLine();
			String strParts[]=Read.split(":");
			ArrayList destinations2=new ArrayList();
			if(strParts.length>3){
				for(int i=3 ; i<strParts.length ;i++ ){
					destinations2.add(strParts[i]);
				}
			}
			M2metro[counter]=new Station(strParts[0],Integer.parseInt(strParts[1]),Integer.parseInt(strParts[2]),destinations2);
			counter++;
		}
		input =new Scanner(System.in);
		System.out.print("Where would you like to go?: ");//take a place from the user
		String UserStation =input.next();
		int counter2=0;
		int exitCode = -1; 

		for(int i=0 ; i<M2metro.length ; i++){
			counter2++;
			for(int j=0 ; j<M2metro[i].Destinations.size() ; j++){

				if(UserStation.equalsIgnoreCase((String)M2metro[i].Destinations.get(j))){//looking which place is that station

					if(counter2>=3){
						System.out.println("Metro Stations from ITU to destination:");
						for(int x=3;x<counter2; x++)	{
							System.out.print("["+M2metro[x].name+"]"+" ");//print the destinations
						}
						System.out.println(" ");
					}
					else if(counter2<3) {
						for(int y=3;y>=(counter2-1); y--)	{
							System.out.print("["+M2metro[y].name+"]"+" ");//print the destinations

						}
					}
				}
			}	
		}

	}
}